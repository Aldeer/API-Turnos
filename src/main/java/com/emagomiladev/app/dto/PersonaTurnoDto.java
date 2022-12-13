package com.emagomiladev.app.dto;

import java.io.Serializable;
import java.util.Date;

public class PersonaTurnoDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellido;
	private Long dni;
	private String nombreEvento;
	private Date fechaEvento;
	private String codigo;

	public PersonaTurnoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonaTurnoDto(String nombre, String apellido, Long dni, String nombreEvento, Date fechaEvento,
			String codigo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.nombreEvento = nombreEvento;
		this.fechaEvento = fechaEvento;
		this.codigo = codigo;
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

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public Date getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "PersonaTurnoDto [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nombreEvento="
				+ nombreEvento + ", fechaEvento=" + fechaEvento + "]";
	}

}
