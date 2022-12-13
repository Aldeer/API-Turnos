package com.emagomiladev.app.dto;

import java.io.Serializable;
import java.util.Date;

public class RespuestaTurnoDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellido;
	private Long dni;
	private String nombreEvento;
	private Date fechaEvento;
	private String codigoTurno;

	public RespuestaTurnoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RespuestaTurnoDto(String nombre, String apellido, Long dni, String nombreEvento, Date fechaEvento,
			String codigoTurno) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.nombreEvento = nombreEvento;
		this.fechaEvento = fechaEvento;
		this.codigoTurno = codigoTurno;
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

	public String getCodigoTurno() {
		return codigoTurno;
	}

	public void setCodigoTurno(String codigoTurno) {
		this.codigoTurno = codigoTurno;
	}

	@Override
	public String toString() {
		return "RespuestaTurnoDto [nombre=" + nombre + ", apellido=" + apellido + ", nombreEvento=" + nombreEvento
				+ ", fechaEvento=" + fechaEvento + ", codigoTurno=" + codigoTurno + "]";
	}

}
