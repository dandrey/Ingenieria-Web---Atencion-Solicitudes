package co.edu.udea.as.dao.hibernate;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.as.dao.TB_UsuariosDAO;
import co.edu.udea.as.dto.TB_Usuarios;
import co.edu.udea.as.exception.ASDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:configuracionSpring.xml")
public class TB_UsuariosDAOHibernateTest {
	
	@Autowired
	TB_UsuariosDAO tb_usuariosDao;

	@Test
	public void testLista() {

		List<TB_Usuarios> usuarios = null;
		try {
			usuarios = tb_usuariosDao.lista();
			
			for(TB_Usuarios usuario : usuarios){
				System.out.println("Nombre de usuario: " + usuario.getNombres());
			}
			assertTrue(true);
			
		} catch (ASDaoException e) {
			fail(e.getMessage());
			System.out.println(e);
		}
	}

	/*@Test
	public void testObtener() {
		fail("Not yet implemented");
	}

	@Test
	public void testAgregar() {
		fail("Not yet implemented");
	}

	@Test
	public void testActualizar() {
		fail("Not yet implemented");
	}

	@Test
	public void testBorrar() {
		fail("Not yet implemented");
	}*/

}
