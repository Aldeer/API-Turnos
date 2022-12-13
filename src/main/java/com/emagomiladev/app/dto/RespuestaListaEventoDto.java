package com.emagomiladev.app.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RespuestaListaEventoDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String ubicacion;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fechaEvento;
	private String tipoEvento;

	public RespuestaListaEventoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RespuestaListaEventoDto(String nombre, String ubicacion, Date fechaEvento, String tipoEvento) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.fechaEvento = fechaEvento;
		this.tipoEvento = tipoEvento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "RespuestaListaEventoDto [nombre=" + nombre + ", ubicacion=" + ubicacion + ", fechaEvento=" + fechaEvento
				+ ", tipoEvento=" + tipoEvento + "]";
	}

}
