package com.emagomiladev.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emagomiladev.app.entities.Evento;

@Repository
public interface EventoDao extends JpaRepository<Evento, Long> {

	@Transactional(readOnly = true)
	public Optional<Evento> findByNombre(String nombre);
	
	@Transactional(readOnly = true)
	public List<Evento> findByOrganizacionId(Long id);
}
