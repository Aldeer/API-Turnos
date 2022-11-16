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
@Table(name = "enterprises")
public class Enterprise implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEnterprise;

	private String name;
	private String cuit;
	private String direccion;

	@Column(name = "phone_number")
	private String phoneNumber;
	private String email;
	private String clave;
	@Column(name = "registration_date")
	private Date registrationDate;

	public Enterprise() {
		super();
	}

	public Enterprise(Long idEnterprise, String name, String cuit, String direccion, String phoneNumber, String email,
			String clave, Date registrationDate) {
		super();
		this.idEnterprise = idEnterprise;
		this.name = name;
		this.cuit = cuit;
		this.direccion = direccion;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.clave = clave;
		this.registrationDate = registrationDate;
	}

	public Long getIdEnterprise() {
		return idEnterprise;
	}

	public void setIdEnterprise(Long idEnterprise) {
		this.idEnterprise = idEnterprise;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

}
