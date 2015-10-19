package co.edu.udea.as.dao.hibernate;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.as.dao.TB_RespondeDAO;
import co.edu.udea.as.dao.TB_RespuestaDAO;
import co.edu.udea.as.dto.TB_Responde;
import co.edu.udea.as.dto.TB_Respuesta;
import co.edu.udea.as.exception.ASDaoException;

/**
 * @author Duvan A. Sanchez
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:configuracionSpring.xml")

public class TB_RespuestaDAOHibernateTest {

	@Autowired
	TB_RespuestaDAO tb_respuestaDao;

	//TB_RespondeDAO tb_respondeDao;

//	@Test
//	public void testLista() {
//		List<TB_Respuesta> respuestas = null;
//		try {
//			respuestas = tb_respuestaDao.lista();
//			for(TB_Respuesta respuesta : respuestas){
//				System.out.println("Respuesta: " + respuesta.getRespuesta());
//			}
//			assertTrue(true);
//		} catch (ASDaoException e) {
//			fail(e.getMessage());
//			System.out.println(e);
//		}
//	}

	@Test
	public void testObtener() {
		TB_Respuesta respuesta = null;
		try {
			respuesta = tb_respuestaDao.obtener(1);
			System.out.println("El nombre de la respuesta es: " + respuesta.getRespuesta());
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}	
	}

//	@Test
//	public void testAgregar() {
//		TB_Respuesta respuesta = null;
//		TB_Responde responsable = null;
//		try {
//			respuesta = new TB_Respuesta();
//			respuesta.setRespuesta("Estamos verificando datos");
//			respuesta.setFecharespuesta(new Date());
//			responsable = new TB_Responde();
//			responsable.setCargo("AX01");
//			respuesta.setReponsable(responsable);
//			tb_respuestaDao.agregar(respuesta);
//			assertTrue(true);
//		} catch (ASDaoException e) {
//			fail(e.getMessage());
//		}
//	}
//
//	@Test
//	public void testActualizar() {
//		TB_Respuesta respuesta = null;
//		TB_Responde responsable = null;
//		try {
//			respuesta = new TB_Respuesta();
//			respuesta.setId(1);
//			respuesta.setRespuesta("Estamos verificando datos otra vez");
//			respuesta.setFecharespuesta(new Date());
//			responsable = new TB_Responde();
//			responsable.setCargo("AX01");
//			respuesta.setReponsable(responsable);
//			tb_respuestaDao.actualizar(respuesta);
//			assertTrue(true);
//		} catch (ASDaoException e) {
//			fail(e.getMessage());
//		}
//	}
//
//	@Test
//	public void testBorrar() {
//		try {
//			tb_respuestaDao.borrar(5);
//			assertTrue(true);
//		} catch (ASDaoException e) {
//			fail(e.getMessage());
//		}
//	}

}
