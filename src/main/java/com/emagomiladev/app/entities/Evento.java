package com.emagomiladev.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "eventos", uniqueConstraints = {@UniqueConstraint(columnNames = {"nombre"})})
public class Evento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "UBICACION")
	private String ubicacion;

	@Column(name = "TIPO_DE_EVENTO")
	private String tipoEvento;

	@Column(name = "FECHA_EVENTO")
	private Date fechaEvento;

	@Column(name = "ACTIVO")
	private boolean activo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organizacion_id")
	private Organizacion organizacion;
	public Evento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evento(Long id, String nombre, String ubicacion, String tipoEvento, Date fechaEvento, boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.tipoEvento = tipoEvento;
		this.fechaEvento = fechaEvento;
		this.activo = activo;
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", tipoEvento=" + tipoEvento
				+ ", fechaEvento=" + fechaEvento + ", activo=" + activo + ", organizacion=" + organizacion + "]";
	}
	

}
