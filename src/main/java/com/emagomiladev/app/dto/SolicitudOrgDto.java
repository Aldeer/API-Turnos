package com.emagomiladev.app.dto;

import java.io.Serializable;

public class SolicitudOrgDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String cuit;
	private String clave;
	private OrganizacionDto organizacion;

	public SolicitudOrgDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SolicitudOrgDto(String nombre, String cuit, String clave, OrganizacionDto organizacion) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.clave = clave;
		this.organizacion = organizacion;
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

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public OrganizacionDto getOrganizacion() {
		return organizacion;
	}

	public void setOrganizacion(OrganizacionDto organizacion) {
		this.organizacion = organizacion;
	}

	@Override
	public String toString() {
		return "SolicitudOrgDto [nombre=" + nombre + ", cuit=" + cuit + ", clave=" + clave + ", organizacion="
				+ organizacion + "]";
	}

}
