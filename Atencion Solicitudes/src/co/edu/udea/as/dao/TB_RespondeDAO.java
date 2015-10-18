package co.edu.udea.as.dao;

import java.util.List;

import co.edu.udea.as.dto.TB_Responde;
import co.edu.udea.as.exception.ASDaoException;

public interface TB_RespondeDAO {
	
	public List<TB_Responde> lista() throws ASDaoException;
	
	public TB_Responde obtener(String id) throws ASDaoException;
	
	public void agregar(TB_Responde responde) throws ASDaoException;
	
	public void actualizar(TB_Responde responde) throws ASDaoException;
	
	public void borrar(String id) throws ASDaoException;

}
