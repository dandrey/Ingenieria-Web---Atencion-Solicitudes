package co.edu.udea.as.dao;

import java.util.List;

import co.edu.udea.as.dto.TB_Usuarios;
import co.edu.udea.as.exception.ASDaoException;

public interface TB_UsuariosDAO {
	
	public List<TB_Usuarios> lista() throws ASDaoException;
	
	public TB_Usuarios obtener(Integer documento) throws ASDaoException;
	
	public void agregar(TB_Usuarios usuario) throws ASDaoException;
	
	public void actualizar(TB_Usuarios usuario) throws ASDaoException;
	
	public void borrar(Integer documento) throws ASDaoException;

}
