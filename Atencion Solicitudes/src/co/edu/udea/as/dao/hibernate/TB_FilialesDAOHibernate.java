package co.edu.udea.as.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.as.dao.TB_FilialesDAO;
import co.edu.udea.as.dto.TB_Filiales;
import co.edu.udea.as.dto.TB_Usuarios;
import co.edu.udea.as.exception.ASDaoException;

public class TB_FilialesDAOHibernate extends HibernateDaoSupport implements TB_FilialesDAO {

	@Override
	public List<TB_Filiales> lista() throws ASDaoException {
		List<TB_Filiales> filiales = new ArrayList<TB_Filiales>();
		
		try {
			Session session = this.getSessionFactory().openSession();
			Criteria criteria = session.createCriteria(TB_Filiales.class);
			
			filiales = criteria.list();
		} catch (HibernateException e) {
			throw new ASDaoException(e);
		}
		return filiales;
	}

	@Override
	public TB_Filiales obtener(Integer codigo) throws ASDaoException {
		TB_Filiales filial = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			filial =(TB_Filiales)session.load(TB_Filiales.class, codigo);

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}

		return filial;
	}

	@Override
	public void agregar(TB_Filiales filial) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.save(filial);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}
	}

	@Override
	public void actualizar(TB_Filiales filial) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.update(filial);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}
	}

	@Override
	public void borrar(Integer codigo) throws ASDaoException {
		TB_Filiales filial = null;
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			filial =(TB_Filiales)session.load(TB_Filiales.class, codigo);

			filial.setEstado(true);
			tx = session.beginTransaction();
			
			session.update(filial);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}
	}

	@Override
	public void updateEstado(Integer codigo, Boolean estado) throws ASDaoException {
		TB_Filiales filial = null;
		Session session = null;
		org.hibernate.Transaction tx = null;
		try{
			session = this.getSessionFactory().openSession();

			filial =(TB_Filiales)session.load(TB_Filiales.class, codigo);
			
			filial.setEstado(estado);
			
			tx = session.beginTransaction();
			session.update(filial);
			tx.commit();
			

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}
		
	}

}
