package com.emagomiladev.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emagomiladev.app.entities.Organizacion;

@Repository
public interface OrganizacionDao extends JpaRepository<Organizacion, Long> {

	@Transactional(readOnly = true)
	public Optional<Organizacion> findByNombre(String nombre);
	
	@Transactional(readOnly = true)
	public Optional<Organizacion> findByNombreAndClave(String nombre, String clave);
	
	@Transactional(readOnly = true)
	public Optional<Organizacion> findByCuit(String cuit);
	
	@Transactional(readOnly = true)
	public boolean existsByNombre(String nombre);
	
	@Transactional(readOnly = true)
	public boolean existsByCuit(String cuit);
}