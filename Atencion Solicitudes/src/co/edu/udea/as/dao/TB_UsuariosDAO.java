package co.edu.udea.as.dao;

import java.util.List;

import co.edu.udea.as.dto.TB_Usuarios;
import co.edu.udea.as.exception.ASDaoException;

public interface TB_UsuariosDAO {
	
	public List<TB_Usuarios> lista() throws ASDaoException;
	
	public TB_Usuarios obtener(Integer documento) throws ASDaoException;
	
	public TB_Usuarios agregar(TB_Usuarios usuario) throws ASDaoException;
	
	public TB_Usuarios actualizar(TB_Usuarios usuario) throws ASDaoException;
	
	public TB_Usuarios borrar(Integer documento) throws ASDaoException;

}
