package co.edu.udea.as.dao;

import java.util.List;

import co.edu.udea.as.dto.TB_Respuesta;
import co.edu.udea.as.exception.ASDaoException;

public interface TB_RespuestaDAO {
	
	public List<TB_Respuesta> lista() throws ASDaoException;
	
	public TB_Respuesta obtener(Integer id) throws ASDaoException;
	
	public TB_Respuesta agregar(TB_Respuesta respuesta) throws ASDaoException;
	
	public TB_Respuesta actualizar(TB_Respuesta respuesta) throws ASDaoException;
	
	public TB_Respuesta borrar(Integer id) throws ASDaoException;

}
