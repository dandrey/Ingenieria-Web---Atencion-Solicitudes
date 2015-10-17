package co.edu.udea.as.dao;

import java.util.List;

import co.edu.udea.as.dto.TB_Notificacion;
import co.edu.udea.as.exception.ASDaoException;

public interface TB_NotificacionDAO {
	
	public List<TB_Notificacion> lista() throws ASDaoException;
	
	public TB_Notificacion obtener(Integer codigo) throws ASDaoException;
	
	public TB_Notificacion agregar(TB_Notificacion notificacion) throws ASDaoException;
	
	public TB_Notificacion actualizar(TB_Notificacion notificacion) throws ASDaoException;
	
	public TB_Notificacion borrar(Integer codigo) throws ASDaoException;

}
