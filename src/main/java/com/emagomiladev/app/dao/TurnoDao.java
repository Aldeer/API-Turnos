package com.emagomiladev.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emagomiladev.app.entities.Turno;

@Repository
public interface TurnoDao extends JpaRepository<Turno, Long>{

	@Transactional(readOnly = true)
	public Turno findByCodigo(String codigo);
}
