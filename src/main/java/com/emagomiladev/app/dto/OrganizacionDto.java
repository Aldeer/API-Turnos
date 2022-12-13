package com.emagomiladev.app.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrganizacionDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "El campo no puede estar vacio o nulo")
	@Size(max = 30, message = "supera el maximo de caracteres permitidos(max. 30)")
	private String nombre;

	@NotEmpty(message = "El campo no puede estar vacio o nulo")
	private String cuit;

	@NotEmpty(message = "El campo no puede estar vacio o nulo")
	@Size(max = 50, message = "Supera el maximo de caracteres permitidos (max. 50)")
	private String direccion;

	private Long telefono;

	@NotEmpty(message = "El campo no puede estar vacio o nulo")
	@Email(message = "Email no valido")
	private String email;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date fechaAlta;

	@NotEmpty(message = "El campo no puede estar vacio o nulo")
	@Size(min = 8, max = 12, message = "La clave debe contener entre min. 8 y max. 12 cifras")
	private String clave;

	public OrganizacionDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrganizacionDto(String nombre, String cuit, String direccion, Long telefono, String email, Date fechaAlta,
			String clave) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.fechaAlta = fechaAlta;
		this.clave = clave;
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

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public void generarFechaActual() {
		Date fechaActual = new Date();
		fechaActual.getTime();
		this.fechaAlta = fechaActual;
	}

	@Override
	public String toString() {
		return "OrganizacionDto [nombre=" + nombre + ", cuit=" + cuit + ", direccion=" + direccion + ", telefono="
				+ telefono + ", email=" + email + ", fechaAlta=" + fechaAlta + ", clave=" + clave + "]";
	}

}
