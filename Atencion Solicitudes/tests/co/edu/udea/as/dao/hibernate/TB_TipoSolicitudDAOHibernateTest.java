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

import co.edu.udea.as.dao.TB_TipoSolicitudDAO;
import co.edu.udea.as.dto.TB_TipoSolicitud;
import co.edu.udea.as.exception.ASDaoException;

/**
 * @author Duvan A. Sanchez
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:configuracionSpring.xml")

public class TB_TipoSolicitudDAOHibernateTest {

	@Autowired
	TB_TipoSolicitudDAO tb_tiposolicitudDao;

	@Test
	public void testLista() {
		List<TB_TipoSolicitud> tiposols = null;
		try {
			tiposols = tb_tiposolicitudDao.lista();
			for(TB_TipoSolicitud tiposol : tiposols){
				System.out.println("Nombre de usuario: " + tiposol.getSolicitud());
			}
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
			System.out.println(e);
		}
	}

	@Test
	public void testObtener() {
		TB_TipoSolicitud tiposol = null;
		try {
			tiposol = tb_tiposolicitudDao.obtener("PQRS02");
			System.out.println("El nombre de la tiposol es: " + tiposol.getSolicitud());
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testAgregar() {
		TB_TipoSolicitud tiposol = null;
		try {
			tiposol = new TB_TipoSolicitud();
			tiposol.setCodigo("PQRS05");
			tiposol.setSolicitud("Indignado");
			tb_tiposolicitudDao.agregar(tiposol);
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testActualizar() {
		TB_TipoSolicitud tiposol = null;
		try {
			tiposol = new TB_TipoSolicitud();
			tiposol.setCodigo("PQRS06");
			tiposol.setSolicitud("Soporte");
			tb_tiposolicitudDao.actualizar(tiposol);
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testBorrar() {
		TB_TipoSolicitud tiposol = null;
		try {
			tiposol = new TB_TipoSolicitud();
			tiposol.setCodigo("PQRS07");
			tiposol.setSolicitud("InSoporte");
			tb_tiposolicitudDao.borrar(tiposol);
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}
	}
}
