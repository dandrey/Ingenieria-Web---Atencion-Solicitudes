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

import co.edu.udea.as.dao.TB_ProductosDAO;
import co.edu.udea.as.dto.TB_Productos;
import co.edu.udea.as.exception.ASDaoException;

/**
 * @author Duvan A. Sanchez
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:configuracionSpring.xml")
public class TB_ProductosDAOHibernateTest {

	@Autowired
	TB_ProductosDAO tb_productosDao;

	@Test
	public void testLista() {
		List<TB_Productos> productos = null;
		try {
			productos = tb_productosDao.lista();
			for(TB_Productos producto : productos){
				System.out.println("Nombre de usuario: " + producto.getProducto());
			}
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
			System.out.println(e);
		}
	}

	@Test
	public void testObtener() {
		TB_Productos producto = null;
		try {
			producto = tb_productosDao.obtener("MS002");
			System.out.println("El nombre de la producto es: " + producto.getProducto());
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testAgregar() {
		TB_Productos producto = null;
		try {
			producto = new TB_Productos();
			producto.setReferencia("TV002");
			producto.setProducto("La Smart");
			tb_productosDao.agregar(producto);
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}	
		}

	@Test
	public void testActualizar() {
		TB_Productos producto = null;
		try {
			producto = new TB_Productos();
			producto.setReferencia("TV003");
			producto.setProducto("BMW");
			tb_productosDao.actualizar(producto);
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}	
	}

	@Test
	public void testBorrar() {
		TB_Productos producto = null;
		try {
			producto = new TB_Productos();
			producto.setReferencia("TV004");
			producto.setProducto("Sony");
			tb_productosDao.borrar(producto);
			assertTrue(true);
		} catch (ASDaoException e) {
			fail(e.getMessage());
		}	
	}
}
