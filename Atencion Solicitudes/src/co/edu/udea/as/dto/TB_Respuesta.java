package co.edu.udea.as.dto;

import java.util.Date;

public class TB_Respuesta {
	
	private int id;
	private String respuesta;
	private Date fecharespuesta;
	private String reponsable;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getReponsable() {
		return reponsable;
	}
	public void setReponsable(String reponsable) {
		this.reponsable = reponsable;
	}

}