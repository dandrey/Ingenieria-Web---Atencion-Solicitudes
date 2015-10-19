package co.edu.udea.as.dao.hibernate;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.as.dao.TB_RespondeDAO;
import co.edu.udea.as.dto.TB_Responde;
import co.edu.udea.as.exception.ASDaoException;

/**
 * @author Duvan A. Sanchez
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:configuracionSpring.xml")

public class TB_RespondeDAOHibernateTest {

	@Autowired
	TB_RespondeDAO tb_respondeDao;

	@Test
	public void testLista() {
		List<TB_Responde> responden = null;
		try {
			responden = tb_respondeDao.lista();
			for(TB_Responde responde : responden){
				System.out.println("Nombre de usuario: " + responde.getNombre());
			}
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
			System.out.println(e);
		}
	}

	@Test
	public void testObtener() {
		TB_Responde responde = null;
		try {
			responde = tb_respondeDao.obtener("GC01");
			System.out.println("El nombre de la persona que responde es: " + responde.getNombre());
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testAgregar() {
		TB_Responde responde = null;
		try {
			responde = new TB_Responde();
			responde.setId("GC02");
			responde.setNombre("Mauricio Velez Restrepo");
			responde.setCargo("Gerente Cuentas");
			tb_respondeDao.agregar(responde);
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testActualizar() {
		TB_Responde responde = null;
		try {
			responde = new TB_Responde();
			responde.setId("GC01");
			responde.setNombre("Marcos Velez Uribe");
			responde.setCargo("Gerente Cuentas");
			tb_respondeDao.actualizar(responde);
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testBorrar() {
		try {
			tb_respondeDao.borrar("GC03");;
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}
	}
}
