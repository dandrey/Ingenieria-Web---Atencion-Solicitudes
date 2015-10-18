package co.edu.udea.as.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.as.dao.TB_SolicitudesDAO;
import co.edu.udea.as.dto.TB_Solicitudes;
import co.edu.udea.as.exception.ASDaoException;

public class TB_SolicitudesDAOHibernate extends HibernateDaoSupport implements TB_SolicitudesDAO {

	@Override
	public List<TB_Solicitudes> lista() throws ASDaoException {
List<TB_Solicitudes> solicitudes = new ArrayList<TB_Solicitudes>();
		
		try {
			Session session = this.getSessionFactory().openSession();
			Criteria criteria = session.createCriteria(TB_Solicitudes.class);
			
			solicitudes = criteria.list();
		} catch (HibernateException e) {
			throw new ASDaoException(e);
		}		return solicitudes;
	}

	@Override
	public TB_Solicitudes obtener(Integer codigo) throws ASDaoException {
		TB_Solicitudes solicitud = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			solicitud =(TB_Solicitudes)session.load(TB_Solicitudes.class, codigo);

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}		return solicitud;
	}

	@Override
	public void agregar(TB_Solicitudes solicitud) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.save(solicitud);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}	}

	@Override
	public void actualizar(TB_Solicitudes solicitud) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.update(solicitud);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}	}

	@Override
	public void borrar(Integer codigo) throws ASDaoException {
		TB_Solicitudes solicitud = null;
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			solicitud =(TB_Solicitudes)session.load(TB_Solicitudes.class, codigo);

			solicitud.setCodigo(null);
			solicitud.setEncuesta(null);
			solicitud.setEstado(false);
			solicitud.setFechaCreacion(null);
			solicitud.setFilial(null);
			solicitud.setProducto(null);
			solicitud.setRespuesta(null);
			solicitud.setTexto(null);
			solicitud.setTipoSolicitud(null);
			
			tx = session.beginTransaction();
			
			session.update(solicitud);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}	}

}
