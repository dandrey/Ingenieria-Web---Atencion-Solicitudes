package co.edu.udea.as.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.as.dao.TB_EncuestaSatisfaccionDAO;
import co.edu.udea.as.dto.TB_EncuestaSatisfaccion;
import co.edu.udea.as.exception.ASDaoException;

public class TB_EncuestaSatisfaccionDAOHibernate extends HibernateDaoSupport implements TB_EncuestaSatisfaccionDAO {

	@Override
	public List<TB_EncuestaSatisfaccion> lista() throws ASDaoException {
List<TB_EncuestaSatisfaccion> encuestas = new ArrayList<TB_EncuestaSatisfaccion>();
		
		try {
			Session session = this.getSessionFactory().openSession();
			Criteria criteria = session.createCriteria(TB_EncuestaSatisfaccion.class);
			
			encuestas = criteria.list();
		} catch (HibernateException e) {
			throw new ASDaoException(e);
		}		return encuestas;
	}

	@Override
	public TB_EncuestaSatisfaccion obtener(Integer codigo) throws ASDaoException {
		TB_EncuestaSatisfaccion encuesta = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			encuesta =(TB_EncuestaSatisfaccion)session.load(TB_EncuestaSatisfaccion.class, codigo);

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}		return encuesta;
	}

	@Override
	public void agregar(TB_EncuestaSatisfaccion encuesta) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.save(encuesta);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}	}

	@Override
	public void actualizar(TB_EncuestaSatisfaccion encuesta) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.update(encuesta);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}	}

	@Override
	public void borrar(Integer codigo) throws ASDaoException {
		TB_EncuestaSatisfaccion encuesta = null;
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			encuesta =(TB_EncuestaSatisfaccion)session.load(TB_EncuestaSatisfaccion.class, codigo);

			encuesta.setCodigo(null);
			encuesta.setEncuesta(null);
			encuesta.setSolicitud(null);
			tx = session.beginTransaction();
			
			session.update(encuesta);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}	}

}
