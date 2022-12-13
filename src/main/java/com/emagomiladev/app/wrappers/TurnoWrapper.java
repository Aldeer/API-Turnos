package com.emagomiladev.app.wrappers;

import com.emagomiladev.app.dto.RespuestaTurnoDto;
import com.emagomiladev.app.dto.SolicitudTurnoDto;
import com.emagomiladev.app.entities.Evento;
import com.emagomiladev.app.entities.Persona;
import com.emagomiladev.app.entities.Turno;
import com.emagomiladev.app.utilities.GeneradorDeCodigo;

public class TurnoWrapper {

	public static Turno mapearEntidad(SolicitudTurnoDto dto, Persona per, Evento eve) {
		Turno ent = new Turno();

		ent.setCodigo(GeneradorDeCodigo.generar());
		ent.setEvento(eve);
		ent.setPersona(per);
		ent.setFecha(dto.getFechaEvento());

		return ent;
	}

	public static RespuestaTurnoDto mapearDto(Turno entidad, Persona per, Evento event) {
		RespuestaTurnoDto dto = new RespuestaTurnoDto();
		
		dto.setNombre(per.getNombre());
		dto.setApellido(per.getApellido());
		dto.setDni(per.getDni());
		dto.setNombreEvento(event.getNombre());
		dto.setFechaEvento(event.getFechaEvento());
		dto.setCodigoTurno(entidad.getCodigo());
		return dto;
	}
}
