package com.emagomiladev.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emagomiladev.app.entities.Evento;

@Repository
public interface EventoDao extends JpaRepository<Evento, Long>{

}
