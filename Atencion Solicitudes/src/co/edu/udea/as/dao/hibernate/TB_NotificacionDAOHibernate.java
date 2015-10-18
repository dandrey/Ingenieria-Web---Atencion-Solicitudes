package co.edu.udea.as.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.as.dao.TB_NotificacionDAO;
import co.edu.udea.as.dto.TB_Notificacion;
import co.edu.udea.as.exception.ASDaoException;

public class TB_NotificacionDAOHibernate extends HibernateDaoSupport implements TB_NotificacionDAO {

	@Override
	public List<TB_Notificacion> lista() throws ASDaoException {
List<TB_Notificacion> notificaciones = new ArrayList<TB_Notificacion>();
		
		try {
			Session session = this.getSessionFactory().openSession();
			Criteria criteria = session.createCriteria(TB_Notificacion.class);
			
			notificaciones = criteria.list();
		} catch (HibernateException e) {
			throw new ASDaoException(e);
		}		return notificaciones;
	}

	@Override
	public TB_Notificacion obtener(Integer codigo) throws ASDaoException {
		TB_Notificacion notificacion = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			notificacion =(TB_Notificacion)session.load(TB_Notificacion.class, codigo);

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}		return notificacion;
	}

	@Override
	public void agregar(TB_Notificacion notificacion) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.save(notificacion);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}		
	}

	@Override
	public void actualizar(TB_Notificacion notificacion) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.update(notificacion);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}		
	}

	@Override
	public void borrar(Integer codigo) throws ASDaoException {
		TB_Notificacion notificacion = null;
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			notificacion =(TB_Notificacion)session.load(TB_Notificacion.class, codigo);

			notificacion.setFechaNotifiacion(null);
			notificacion.setNotifiacion(null);
			tx = session.beginTransaction();
			
			session.update(notificacion);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}		
	}

}
