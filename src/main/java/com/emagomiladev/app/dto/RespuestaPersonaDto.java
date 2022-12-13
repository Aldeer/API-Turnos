package com.emagomiladev.app.dto;

import java.io.Serializable;

public class RespuestaPersonaDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellido;
	private Long dni;

	public RespuestaPersonaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RespuestaPersonaDto(String nombre, String apellido, Long dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "RespuestaPersonaDto [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}

}
