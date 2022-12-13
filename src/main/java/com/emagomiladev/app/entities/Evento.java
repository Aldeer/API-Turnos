package com.emagomiladev.app.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "eventos", uniqueConstraints = { @UniqueConstraint(columnNames = { "nombre" , "organizacion_id"}) })
public class Evento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "ubicacion")
	private String ubicacion;

	@Column(name = "tipo_de_evento")
	private String tipoEvento;

	@Column(name = "fecha_evento")
	private Date fechaEvento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organizacion_id")
	private Organizacion organizacion;
	
	@OneToMany(mappedBy = "evento", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Turno> turnos = new ArrayList<>();

	public Evento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evento(Long id, String nombre, String ubicacion, String tipoEvento, Date fechaEvento,
			Organizacion organizacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.tipoEvento = tipoEvento;
		this.fechaEvento = fechaEvento;
		this.organizacion = organizacion;
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

	public Organizacion getOrganizacion() {
		return organizacion;
	}

	public void setOrganizacion(Organizacion organizacion) {
		this.organizacion = organizacion;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", tipoEvento=" + tipoEvento
				+ ", fechaEvento=" + fechaEvento + ", organizacion=" + organizacion + "]";
	}

}
