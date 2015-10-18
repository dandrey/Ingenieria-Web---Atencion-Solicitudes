package co.edu.udea.as.dto;

import java.util.Date;

public class TB_Respuesta {
	
	private Integer id;
	private String respuesta;
	private Date fecharespuesta;
	private TB_Responde reponsable;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public Date getFecharespuesta() {
		return fecharespuesta;
	}
	public void setFecharespuesta(Date fecharespuesta) {
		this.fecharespuesta = fecharespuesta;
	}
	public TB_Responde getReponsable() {
		return reponsable;
	}
	public void setReponsable(TB_Responde reponsable) {
		this.reponsable = reponsable;
	}

}
