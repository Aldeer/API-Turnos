package com.emagomiladev.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emagomiladev.app.entities.Persona;

@Repository
public interface PersonaDao extends JpaRepository<Persona, Long>{

	public List<Persona> findByApellido(String apellido);
	
	public Optional<Persona> findByDni(Long dni);
	
	public List<Persona> findByNombre(String nombre);
	
	public boolean existsByDni(Long dni);
	
}
