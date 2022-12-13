package com.emagomiladev.app.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SolicitudEventoDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombreEmpresa;
	private String clave;
	private String nombreEvento;
	private String nombreMod;
	private String ubicacionMod;
	private String tipoEventoMod;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fechaEventoMod;

	public SolicitudEventoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SolicitudEventoDto(String nombreEmpresa, String clave, String nombreEvento, String nombreMod,
			String ubicacionMod, String tipoEventoMod, Date fechaEventoMod) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.clave = clave;
		this.nombreEvento = nombreEvento;
		this.nombreMod = nombreMod;
		this.ubicacionMod = ubicacionMod;
		this.tipoEventoMod = tipoEventoMod;
		this.fechaEventoMod = fechaEventoMod;
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

	public String getNombreMod() {
		return nombreMod;
	}

	public void setNombreMod(String nombreMod) {
		this.nombreMod = nombreMod;
	}

	public String getUbicacionMod() {
		return ubicacionMod;
	}

	public void setUbicacionMod(String ubicacionMod) {
		this.ubicacionMod = ubicacionMod;
	}

	public String getTipoEventoMod() {
		return tipoEventoMod;
	}

	public void setTipoEventoMod(String tipoEventoMod) {
		this.tipoEventoMod = tipoEventoMod;
	}

	public Date getFechaEventoMod() {
		return fechaEventoMod;
	}

	public void setFechaEventoMod(Date fechaEventoMod) {
		this.fechaEventoMod = fechaEventoMod;
	}

	@Override
	public String toString() {
		return "SolicitudEventoDto [nombreEmpresa=" + nombreEmpresa + ", clave=" + clave + ", nombreEvento="
				+ nombreEvento + ", nombreMod=" + nombreMod + ", ubicacionMod=" + ubicacionMod + ", tipoEventoMod="
				+ tipoEventoMod + ", fechaEventoMod=" + fechaEventoMod + "]";
	}

}
