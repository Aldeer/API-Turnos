package com.emagomiladev.app.dto;

import java.io.Serializable;
import java.util.Date;

public class TurnoDto implements Serializable {


	private static final long serialVersionUID = 1L;
	private String nombreEmpresa;
	private String nombreEvento;
	private Date fechaEvento;
	private String codigo;

	public TurnoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TurnoDto(String nombreEmpresa, String nombreEvento, Date fechaEvento, String codigo) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.nombreEvento = nombreEvento;
		this.fechaEvento = fechaEvento;
		this.codigo = codigo;
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "TurnoDto [nombreEmpresa=" + nombreEmpresa + ", nombreEvento=" + nombreEvento + ", fechaEvento="
				+ fechaEvento + ", codigo=" + codigo + "]";
	}

}
