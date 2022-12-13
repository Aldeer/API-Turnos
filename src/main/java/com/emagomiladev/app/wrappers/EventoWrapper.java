package com.emagomiladev.app.wrappers;

import com.emagomiladev.app.dto.EventoDto;
import com.emagomiladev.app.dto.RespuestaEventoDto;
import com.emagomiladev.app.dto.RespuestaListaEventoDto;
import com.emagomiladev.app.entities.Evento;
import com.emagomiladev.app.entities.Organizacion;

public class EventoWrapper {

	public static Evento mapearEntidad(EventoDto eventoDto, Organizacion entidadOrg) {
		Evento ent = new Evento();
		
		ent.setNombre(eventoDto.getNombreEvento());
		ent.setUbicacion(eventoDto.getUbicacion());
		ent.setTipoEvento(eventoDto.getTipoEvento());
		ent.setFechaEvento(eventoDto.getFechaEvento());
		ent.setOrganizacion(entidadOrg);
		
		return ent;
	}
	
	public static RespuestaEventoDto mapearDto(Evento entidad) {
		RespuestaEventoDto dto =  new RespuestaEventoDto();
		
		dto.setNombreEmpresa(entidad.getOrganizacion().getNombre());
		dto.setNombreEvento(entidad.getNombre());
		dto.setUbicacion(entidad.getUbicacion());
		dto.setFechaEvento(entidad.getFechaEvento());
		dto.setTipoEvento(entidad.getTipoEvento());
		
		return dto;
	}
	
	public static RespuestaListaEventoDto mapearListaDto(Evento entidad) {
		RespuestaListaEventoDto dto = new RespuestaListaEventoDto();
		
		dto.setNombre(entidad.getNombre());
		dto.setUbicacion(entidad.getUbicacion());
		dto.setFechaEvento(entidad.getFechaEvento());
		dto.setTipoEvento(entidad.getTipoEvento());
		
		return dto;
	}
}
