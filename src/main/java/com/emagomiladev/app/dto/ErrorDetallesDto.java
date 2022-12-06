package com.emagomiladev.app.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorDetallesDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern = "yyy-MM-dd hh:mm:ss")
	private Date marcaTiempo;
	private String mensaje;
	private String detalles;

	public ErrorDetallesDto(Date marcaTiempo, String mensaje, String detalles) {
		super();
		this.marcaTiempo = marcaTiempo;
		this.mensaje = mensaje;
		this.detalles = detalles;
	}

	public Date getMarcaTiempo() {
		return marcaTiempo;
	}

	public void setMarcaTiempo(Date marcaTiempo) {
		this.marcaTiempo = marcaTiempo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

}
