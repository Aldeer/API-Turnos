package com.emagomiladev.app.dto;

import java.io.Serializable;

public class EliminarPersonaDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long dni;
	private String clave;

	public EliminarPersonaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EliminarPersonaDto(Long dni, String clave) {
		super();
		this.dni = dni;
		this.clave = clave;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "EliminarPersonaDto [dni=" + dni + ", clave=" + clave + "]";
	}

}
