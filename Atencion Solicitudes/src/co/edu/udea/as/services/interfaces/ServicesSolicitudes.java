package co.edu.udea.as.services.interfaces;

import co.edu.udea.as.exception.ASServiceException;

public interface ServicesSolicitudes {
	
	public void creaQueja(String tipoSolicitud, String nombre, String apellidos, Integer cedula,
			String correo, Integer telefono, String referencia, Integer filial, String texto) throws ASServiceException;
	
	public void creaPeticion(String tipoSolicitud, String nombre, String apellidos, Integer cedula,
			String correo, Integer telefono, String referencia, Integer filial, String texto) throws ASServiceException;
	
	public void creaReclamo(String tipoSolicitud, String nombre, String apellidos, Integer cedula,
			String correo, Integer telefono, String referencia, Integer filial, String texto) throws ASServiceException;
	
	public void creaSugerencia(String tipoSolicitud, String nombre, String apellidos, Integer cedula,
			String correo, Integer telefono, String referencia, Integer filial, String texto) throws ASServiceException;

}
