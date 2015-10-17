package co.edu.udea.as.dao;

import java.util.List;

import co.edu.udea.as.dto.TB_EncuestaSatisfaccion;
import co.edu.udea.as.exception.ASDaoException;

public interface TB_EncuestaSatisfaccionDAO {
	
	public List<TB_EncuestaSatisfaccion> lista() throws ASDaoException;
	
	public TB_EncuestaSatisfaccion obtener(Integer codigo) throws ASDaoException;
	
	public TB_EncuestaSatisfaccion agregar(TB_EncuestaSatisfaccion encuesta) throws ASDaoException;
	
	public TB_EncuestaSatisfaccion actualizar(TB_EncuestaSatisfaccion encuesta) throws ASDaoException;
	
	public TB_EncuestaSatisfaccion borrar(Integer codigo) throws ASDaoException;

}
