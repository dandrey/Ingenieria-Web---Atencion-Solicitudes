package co.edu.udea.as.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.as.dao.TB_UsuariosDAO;
import co.edu.udea.as.dto.TB_Usuarios;
import co.edu.udea.as.exception.ASDaoException;

public class TB_UsuariosDAOHibernate extends HibernateDaoSupport implements TB_UsuariosDAO {

	@Override
	public List<TB_Usuarios> lista() throws ASDaoException {

		List<TB_Usuarios> usuarios = new ArrayList<TB_Usuarios>();

		try{
			Session session = this.getSessionFactory().openSession();
			Criteria criteria = session.createCriteria(TB_Usuarios.class);

			usuarios = criteria.list();
		}catch(HibernateException e){
			throw new ASDaoException(e);
		}
		return usuarios;
	}

	@Override
	public TB_Usuarios obtener(Integer documento) throws ASDaoException {
		TB_Usuarios usuario = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			usuario =(TB_Usuarios)session.load(TB_Usuarios.class, documento);

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}

		return usuario;
	}

	@Override
	public void agregar(TB_Usuarios usuario) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.save(usuario);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}
	}

	@Override
	public void actualizar(TB_Usuarios usuario) throws ASDaoException {
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			tx = session.beginTransaction();
			session.update(usuario);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}
	}

	@Override
	public void borrar(Integer documento) throws ASDaoException {
		TB_Usuarios usuario = null;
		org.hibernate.Transaction tx = null;
		Session session = null;
		try{
			session = this.getSessionFactory().openSession();

			usuario =(TB_Usuarios)session.load(TB_Usuarios.class, documento);

			tx = session.beginTransaction();
			usuario.setEstado(true);
			session.update(documento);
			tx.commit();

		}catch(HibernateException e){
			throw new ASDaoException(e);
		}finally {
			session.close();
		}
	}
}
