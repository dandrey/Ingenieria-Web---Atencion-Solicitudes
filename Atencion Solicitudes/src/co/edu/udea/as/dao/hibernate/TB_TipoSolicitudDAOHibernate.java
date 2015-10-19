package co.edu.udea.as.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.as.dao.TB_TipoSolicitudDAO;
import co.edu.udea.as.dto.TB_TipoSolicitud;
import co.edu.udea.as.exception.ASDaoException;

public class TB_TipoSolicitudDAOHibernate extends HibernateDaoSupport implements TB_TipoSolicitudDAO {

	@Override
	public List<TB_TipoSolicitud> lista() throws ASDaoException {
		List<TB_TipoSolicitud> tipoSol = new ArrayList<TB_TipoSolicitud>();

		try {
			Session session = this.getSessionFactory().openSession();
			Criteria criteria = session.createCriteria(TB_TipoSolicitud.class);

			tipoSol = criteria.list();
		} catch (HibernateException e) {
			throw new ASDaoException(e);
		}		return tipoSol;
	}

	@Override
	public TB_TipoSolicitud obtener(String codigo) throws ASDaoException {
		TB_TipoSolicitud tipoSol = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tipoSol =(TB_TipoSolicitud)session.load(TB_TipoSolicitud.class, codigo);

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}		return tipoSol;
	}

	@Override
	public void agregar(TB_TipoSolicitud tipoSol) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			session.save(tipoSol);
			tx = session.beginTransaction();
			
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}	}

	@Override
	public void actualizar(TB_TipoSolicitud tipoSol) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.update(tipoSol);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}	}

	@Override
	public void borrar(TB_TipoSolicitud tipoSol) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();

			session.delete(tipoSol);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}	
	}
}
