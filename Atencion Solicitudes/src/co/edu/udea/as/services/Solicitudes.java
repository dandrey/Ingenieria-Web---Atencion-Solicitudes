package co.edu.udea.as.services;

import co.edu.udea.as.exception.ASServiceException;
import co.edu.udea.as.services.interfaces.ServicesSolicitudes;

public class Solicitudes implements ServicesSolicitudes {

	@Override
	public void creaQueja(String tipoSolicitud, String nombre, String apellidos, Integer cedula, String correo,
			Integer telefono, String referencia, Integer filial, String texto) throws ASServiceException {
		//Validar datos de ingreso
		//verificar e que exista la filiar y el producto
		//Guardar el Usuario
		//Crear la solicitud

	}

	@Override
	public void creaPeticion(String tipoSolicitud, String nombre, String apellidos, Integer cedula, String correo,
			Integer telefono, String referencia, Integer filial, String texto) throws ASServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public void creaReclamo(String tipoSolicitud, String nombre, String apellidos, Integer cedula, String correo,
			Integer telefono, String referencia, Integer filial, String texto) throws ASServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public void creaSugerencia(String tipoSolicitud, String nombre, String apellidos, Integer cedula, String correo,
			Integer telefono, String referencia, Integer filial, String texto) throws ASServiceException {
		// TODO Auto-generated method stub

	}

}
