package co.edu.udea.as.dao;

import java.util.List;

import co.edu.udea.as.dto.TB_TipoSolicitud;
import co.edu.udea.as.exception.ASDaoException;

public interface TB_TipoSolicitudDAO {
	
	public List<TB_TipoSolicitud> lista() throws ASDaoException;
	
	public TB_TipoSolicitud obtener(String codigo) throws ASDaoException;
	
	public TB_TipoSolicitud agregar(TB_TipoSolicitud tipoSol) throws ASDaoException;
	
	public TB_TipoSolicitud actualizar(TB_TipoSolicitud tipoSol) throws ASDaoException;
	
	public TB_TipoSolicitud borrar(String codigo) throws ASDaoException;

}
