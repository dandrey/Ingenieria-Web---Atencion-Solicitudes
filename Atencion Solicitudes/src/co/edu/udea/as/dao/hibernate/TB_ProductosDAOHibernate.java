package co.edu.udea.as.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.as.dao.TB_ProductosDAO;
import co.edu.udea.as.dto.TB_Productos;
import co.edu.udea.as.exception.ASDaoException;

public class TB_ProductosDAOHibernate extends HibernateDaoSupport implements TB_ProductosDAO {

	@Override
	public List<TB_Productos> lista() throws ASDaoException {
		List<TB_Productos> productos = new ArrayList<TB_Productos>();
		
		try {
			Session session = this.getSessionFactory().openSession();
			Criteria criteria = session.createCriteria(TB_Productos.class);
			
			productos = criteria.list();
		} catch (HibernateException e) {
			throw new ASDaoException(e);
		}		return productos;
	}

	@Override
	public TB_Productos obtener(String referencia) throws ASDaoException {
		TB_Productos producto = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			producto =(TB_Productos)session.load(TB_Productos.class, referencia);

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}		return producto;
	}

	@Override
	public void agregar(TB_Productos producto) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.save(producto);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}
	}

	@Override
	public void actualizar(TB_Productos producto) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.update(producto);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}
	}

	@Override
	public void borrar(String referencia) throws ASDaoException {
		TB_Productos producto = null;
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			producto =(TB_Productos)session.load(TB_Productos.class, referencia);

			producto.setEstado(true);
			tx = session.beginTransaction();
			
			session.update(producto);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}
	}

}
