package com.emagomiladev.app.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RespuestaOrgDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String cuit;
	private String direccion;
	private Long telefono;
	private String email;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date fechaAlta;

	public RespuestaOrgDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RespuestaOrgDto(String nombre, String cuit, String direccion, Long telefono, String email, Date fechaAlta) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.fechaAlta = fechaAlta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "RespuestaOrgDto [nombre=" + nombre + ", cuit=" + cuit + ", direccion=" + direccion + ", telefono="
				+ telefono + ", email=" + email + ", fechaAlta=" + fechaAlta + "]";
	}

}
