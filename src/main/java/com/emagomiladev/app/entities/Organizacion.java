package com.emagomiladev.app.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "organizaciones")
public class Organizacion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "cuit")
	private String cuit;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "telefono")
	private Long telefono;

	@Column(name = "email")
	private String email;

	@Column(name = "fecha_de_alta", updatable = false)
	private Date fechaAlta;

	@Column(name = "clave")
	private String clave;

	@OneToMany(mappedBy = "organizacion", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Evento> eventos = new ArrayList<>();

	public Organizacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Organizacion(Long id, String nombre, String cuit, String direccion, Long telefono, String email,
			Date fechaAlta, String clave) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cuit = cuit;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.fechaAlta = fechaAlta;
		this.clave = clave;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	
	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	@Override
	public String toString() {
		return "Organizacion [id=" + id + ", nombre=" + nombre + ", cuit=" + cuit + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", email=" + email + ", fechaAlta=" + fechaAlta + ", clave=" + clave
				+ ", eventos=" + eventos + "]";
	}

}
