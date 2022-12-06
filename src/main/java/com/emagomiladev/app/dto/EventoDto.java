package com.emagomiladev.app.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EventoDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombreEmpresa;
	private String clave;
	private String nombreEvento;
	private String ubicacion;
	private String tipoEvento;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date fechaEvento;
	private boolean activo;

	public EventoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventoDto(String nombreEmpresa, String clave, String nombreEvento, String ubicacion, String tipoEvento,
			Date fechaEvento, boolean activo) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.clave = clave;
		this.nombreEvento = nombreEvento;
		this.ubicacion = ubicacion;
		this.tipoEvento = tipoEvento;
		this.fechaEvento = fechaEvento;
		this.activo = activo;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
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

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Date getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "EventoDto [nombreEmpresa=" + nombreEmpresa + ", clave=" + clave + ", nombreEvento=" + nombreEvento
				+ ", ubicacion=" + ubicacion + ", tipoEvento=" + tipoEvento + ", fechaEvento=" + fechaEvento
				+ ", activo=" + activo + "]";
	}

}
