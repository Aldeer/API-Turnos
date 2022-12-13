package com.emagomiladev.app.dto;

import java.io.Serializable;

public class PersonaDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellido;
	private Long dni;
	private String clave;
	private Long dniMod;

	public PersonaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonaDto(String nombre, String apellido, Long dni, String clave) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.clave = clave;
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

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Long getDniMod() {
		return dniMod;
	}

	public void setDniMod(Long dniMod) {
		this.dniMod = dniMod;
	}

	@Override
	public String toString() {
		return "PersonaDto [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", clave=" + clave + "]";
	}

}
