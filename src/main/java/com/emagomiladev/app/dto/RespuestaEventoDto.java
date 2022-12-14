package com.emagomiladev.app.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RespuestaEventoDto implements  Serializable{

	private static final long serialVersionUID = 1L;

	private String nombreEmpresa;
	private String nombreEvento;
	private String ubicacion;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fechaEvento;
	private String tipoEvento;

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

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Date getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	@Override
	public String toString() {
		return "SolicitudEventoDto [nombreEmpresa=" + nombreEmpresa + ", nombreEvento=" + nombreEvento + ", ubicacion="
				+ ubicacion + ", fechaEvento=" + fechaEvento + ", tipoEvento=" + tipoEvento + "]";
	}
}
