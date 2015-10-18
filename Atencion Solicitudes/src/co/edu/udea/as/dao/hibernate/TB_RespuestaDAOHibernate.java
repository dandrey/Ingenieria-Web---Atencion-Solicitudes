package co.edu.udea.as.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.as.dao.TB_RespuestaDAO;
import co.edu.udea.as.dto.TB_Respuesta;
import co.edu.udea.as.exception.ASDaoException;

public class TB_RespuestaDAOHibernate extends HibernateDaoSupport implements TB_RespuestaDAO {

	@Override
	public List<TB_Respuesta> lista() throws ASDaoException {
List<TB_Respuesta> respuestas = new ArrayList<TB_Respuesta>();
		
		try {
			Session session = this.getSessionFactory().openSession();
			Criteria criteria = session.createCriteria(TB_Respuesta.class);
			
			respuestas = criteria.list();
		} catch (HibernateException e) {
			throw new ASDaoException(e);
		}		return respuestas;
	}

	@Override
	public TB_Respuesta obtener(Integer id) throws ASDaoException {
		TB_Respuesta respuesta = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			respuesta =(TB_Respuesta)session.load(TB_Respuesta.class, id);

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}		return respuesta;
	}

	@Override
	public void agregar(TB_Respuesta respuesta) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.save(respuesta);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}
	}

	@Override
	public void actualizar(TB_Respuesta respuesta) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.update(respuesta);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}
	}

	@Override
	public void borrar(Integer id) throws ASDaoException {
		TB_Respuesta respuesta = null;
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			respuesta =(TB_Respuesta)session.load(TB_Respuesta.class, id);

			respuesta.setId(null);
			respuesta.setRespuesta(null);
			respuesta.setFecharespuesta(null);
			respuesta.setReponsable(null);
			
			tx = session.beginTransaction();
			
			session.update(respuesta);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}		
	}

}
