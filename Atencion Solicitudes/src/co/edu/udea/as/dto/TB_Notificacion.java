package co.edu.udea.as.dto;

import java.util.Date;

public class TB_Notificacion {
	
	private int notifiacion;
	private int solicitud;
	private Date fechaNotifiacion;
	
	public int getNotifiacion() {
		return notifiacion;
	}
	public void setNotifiacion(int notifiacion) {
		this.notifiacion = notifiacion;
	}
	public int getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(int solicitud) {
		this.solicitud = solicitud;
	}
	public Date getFechaNotifiacion() {
		return fechaNotifiacion;
	}
	public void setFechaNotifiacion(Date fechaNotifiacion) {
		this.fechaNotifiacion = fechaNotifiacion;
	}
}
