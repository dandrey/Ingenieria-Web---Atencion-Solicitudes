package co.edu.udea.as.dao;

import java.util.List;

import co.edu.udea.as.dto.TB_Productos;
import co.edu.udea.as.exception.ASDaoException;

public interface TB_ProductosDAO {
	
public List<TB_Productos> lista() throws ASDaoException;
	
	public TB_Productos obtener(String referencia) throws ASDaoException;
	
	public void agregar(TB_Productos producto) throws ASDaoException;
	
	public void actualizar(TB_Productos producto) throws ASDaoException;
	
	public void borrar(String referencia) throws ASDaoException;

}
