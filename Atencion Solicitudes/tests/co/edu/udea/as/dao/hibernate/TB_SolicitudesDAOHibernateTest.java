package co.edu.udea.as.dao.hibernate;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.as.dao.TB_RespondeDAO;
import co.edu.udea.as.dao.TB_SolicitudesDAO;
import co.edu.udea.as.dto.TB_Filiales;
import co.edu.udea.as.dto.TB_Responde;
import co.edu.udea.as.exception.ASDaoException;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:configuracionSpring.xml")
public class TB_SolicitudesDAOHibernateTest {

	@Autowired
	TB_SolicitudesDAO tb_solicitudesDao;
	
	@Test
	public void testLista() {
		List<TB_Filiales> filiales = null;
		try {
			filiales = tb_filialesDao.lista();
			
			for(TB_Filiales filial : filiales){
				System.out.println("Nombre de usuario: " + filial.getNombre());
			}
			assertTrue(true);
			
		} catch (ASDaoException e) {
			fail(e.getMessage());
			System.out.println(e);
		}}

	@Test
	public void testObtener() {
TB_Filiales filial = null;
		
		try {
			filial = tb_filialesDao.obtener(1);
			System.out.println("El nombre de la Filial es: " + filial.getNombre());
			
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}	}

	@Test
	public void testAgregar() {
TB_Filiales filial = null;
		
		try {
			filial = new TB_Filiales();
			filial.setCodigo(5);
			filial.setNombre("Las Maruchengas");
			filial.setDireccion("Valle");
			tb_filialesDao.agregar(filial);
			
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}	}

	@Test
	public void testActualizar() {
		try {
			tb_filialesDao.updateEstado(14, false);
			
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}	}

	@Test
	public void testBorrar() {
		try {
			tb_filialesDao.borrar(14);
			
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}	}

}
