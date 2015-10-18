package co.edu.udea.as.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.as.dao.TB_RespondeDAO;
import co.edu.udea.as.dto.TB_Responde;
import co.edu.udea.as.exception.ASDaoException;

public class TB_RespondeDAOHibernate extends HibernateDaoSupport implements TB_RespondeDAO {

	@Override
	public List<TB_Responde> lista() throws ASDaoException {
List<TB_Responde> responden = new ArrayList<TB_Responde>();
		
		try {
			Session session = this.getSessionFactory().openSession();
			Criteria criteria = session.createCriteria(TB_Responde.class);
			
			responden = criteria.list();
		} catch (HibernateException e) {
			throw new ASDaoException(e);
		}		return responden;
	}

	@Override
	public TB_Responde obtener(String id) throws ASDaoException {
		TB_Responde responde = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			responde =(TB_Responde)session.load(TB_Responde.class, id);

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}		return responde;
	}

	@Override
	public void agregar(TB_Responde responde) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.save(responde);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}
	}

	@Override
	public void actualizar(TB_Responde responde) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.update(responde);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}
	}

	@Override
	public void borrar(String id) throws ASDaoException {
		TB_Responde responde = null;
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			responde =(TB_Responde)session.load(TB_Responde.class, id);

			responde.setEstado(true);
			tx = session.beginTransaction();
			
			session.update(responde);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}
	}

}
