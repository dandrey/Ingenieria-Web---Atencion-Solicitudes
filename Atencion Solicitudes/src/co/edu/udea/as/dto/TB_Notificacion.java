package co.edu.udea.as.dto;

import java.util.Date;

public class TB_Notificacion {
	
	private Integer notifiacion;
	private Integer solicitud;
	private Date fechaNotifiacion;
	
	public Integer getNotifiacion() {
		return notifiacion;
	}
	public void setNotifiacion(Integer notifiacion) {
		this.notifiacion = notifiacion;
	}
	public Integer getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(Integer solicitud) {
		this.solicitud = solicitud;
	}
	public Date getFechaNotifiacion() {
		return fechaNotifiacion;
	}
	public void setFechaNotifiacion(Date fechaNotifiacion) {
		this.fechaNotifiacion = fechaNotifiacion;
	}
}
