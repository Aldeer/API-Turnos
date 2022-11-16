package com.emagomiladev.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_person")
	private Long idPerson;

	private String name;
	private String surname;
	private Integer dni;
	@Column(name = "enterprise_name")
	private String enterpriseName;
	@Column(name = "event_name")
	private String eventName;
	@Column(name = "event_day")
	private Date eventDay;

	public Person() {
		super();
	}

	public Person(Long idPerson, String name, String surname, Integer dni, String enterpriseName, String eventName,
			Date eventDay) {
		super();
		this.idPerson = idPerson;
		this.name = name;
		this.surname = surname;
		this.dni = dni;
		this.enterpriseName = enterpriseName;
		this.eventName = eventName;
		this.eventDay = eventDay;
	}

	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getEventDay() {
		return eventDay;
	}

	public void setEventDay(Date eventDay) {
		this.eventDay = eventDay;
	}

}
