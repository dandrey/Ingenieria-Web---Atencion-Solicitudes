package co.edu.udea.as.dto;

public class TB_EncuestaSatisfaccion {
	
	private Integer codigo;
	private TB_Notificacion solicitud;
	private String encuesta;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public TB_Notificacion getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(TB_Notificacion solicitud) {
		this.solicitud = solicitud;
	}
	public String getEncuesta() {
		return encuesta;
	}
	public void setEncuesta(String encuesta) {
		this.encuesta = encuesta;
	}
}
