package co.edu.udea.as.dao;

import java.util.List;

import co.edu.udea.as.dto.TB_Filiales;
import co.edu.udea.as.exception.ASDaoException;

public interface TB_FilialesDAO {
	
	public List<TB_Filiales> lista() throws ASDaoException;
	
	public TB_Filiales obtener(Integer codigo) throws ASDaoException;
	
	public TB_Filiales agregar(TB_Filiales filial) throws ASDaoException;
	
	public TB_Filiales actualizar(TB_Filiales filial) throws ASDaoException;
	
	public TB_Filiales borrar(Integer codigo) throws ASDaoException;

}
