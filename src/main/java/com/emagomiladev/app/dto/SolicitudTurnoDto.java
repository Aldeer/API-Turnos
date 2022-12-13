package com.emagomiladev.app.dto;

import java.io.Serializable;
import java.util.Date;

public class SolicitudTurnoDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long dni;
	private String clave;
	private String nombreEmpresa;
	private String nombreEvento;
	private Date fechaEvento;

	public SolicitudTurnoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SolicitudTurnoDto(Long dni, String clave, String nombreEmpresa, String nombreEvento, Date fechaEvento) {
		super();
		this.dni = dni;
		this.clave = clave;
		this.nombreEmpresa = nombreEmpresa;
		this.nombreEvento = nombreEvento;
		this.fechaEvento = fechaEvento;
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

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
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

	@Override
	public String toString() {
		return "SolicitudTurnoDto [dni=" + dni + ", clave=" + clave + ", nombreEmpresa=" + nombreEmpresa
				+ ", nombreEvento=" + nombreEvento + ", fechaEvento=" + fechaEvento + "]";
	}

}
