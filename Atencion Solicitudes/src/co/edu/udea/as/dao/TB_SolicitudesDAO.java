package co.edu.udea.as.dao;

import java.util.List;

import co.edu.udea.as.dto.TB_Solicitudes;
import co.edu.udea.as.exception.ASDaoException;

public interface TB_SolicitudesDAO {
	
	public List<TB_Solicitudes> lista() throws ASDaoException;

	public TB_Solicitudes obtener(Integer codigo) throws ASDaoException;

	public TB_Solicitudes agregar(TB_Solicitudes solicitud) throws ASDaoException;

	public TB_Solicitudes actualizar(TB_Solicitudes solicitud) throws ASDaoException;

	public TB_Solicitudes borrar(Integer codigo) throws ASDaoException;

}
