package co.edu.udea.as.dto;

import java.util.Date;

/**
 * Clase dto para los datos de las solicitudes.
 * @author Duvan A. Sanchez
 *
 */
public class TB_Solicitudes {
	
	private Integer codigo;
	private TB_TipoSolicitud tipoSolicitud;
	private Date fechaCreacion;
	private TB_Productos producto;
	private TB_Filiales filial;
	private boolean estado;
	private TB_Respuesta respuesta;
	private String texto;
	private TB_EncuestaSatisfaccion encuesta;
	
	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the tipoSolicitud
	 */
	public TB_TipoSolicitud getTipoSolicitud() {
		return tipoSolicitud;
	}
	/**
	 * @param tipoSolicitud the tipoSolicitud to set
	 */
	public void setTipoSolicitud(TB_TipoSolicitud tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}
	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	/**
	 * @return the producto
	 */
	public TB_Productos getProducto() {
		return producto;
	}
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(TB_Productos producto) {
		this.producto = producto;
	}
	/**
	 * @return the filial
	 */
	public TB_Filiales getFilial() {
		return filial;
	}
	/**
	 * @param filial the filial to set
	 */
	public void setFilial(TB_Filiales filial) {
		this.filial = filial;
	}
	/**
	 * @return the estado
	 */
	public boolean isEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	/**
	 * @return the respuesta
	 */
	public TB_Respuesta getRespuesta() {
		return respuesta;
	}
	/**
	 * @param respuesta the respuesta to set
	 */
	public void setRespuesta(TB_Respuesta respuesta) {
		this.respuesta = respuesta;
	}
	/**
	 * @return the texto
	 */
	public String getTexto() {
		return texto;
	}
	/**
	 * @param texto the texto to set
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}
	/**
	 * @return the encuesta
	 */
	public TB_EncuestaSatisfaccion getEncuesta() {
		return encuesta;
	}
	/**
	 * @param encuesta the encuesta to set
	 */
	public void setEncuesta(TB_EncuestaSatisfaccion encuesta) {
		this.encuesta = encuesta;
	}
}
