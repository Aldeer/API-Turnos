package com.emagomiladev.app.wrappers;

import com.emagomiladev.app.dto.PersonaDto;
import com.emagomiladev.app.dto.RespuestaPersonaDto;
import com.emagomiladev.app.entities.Persona;

public class PersonaWrapper {

	public static RespuestaPersonaDto mapearDto(Persona entidad) {
		RespuestaPersonaDto dto = new RespuestaPersonaDto();

		dto.setNombre(entidad.getNombre());
		dto.setApellido(entidad.getApellido());
		dto.setDni(entidad.getDni());

		return dto;
	}

	public static Persona mapearEntidad(PersonaDto dto) {
		Persona entidad = new Persona();

		entidad.setNombre(dto.getNombre());
		entidad.setApellido(dto.getApellido());
		entidad.setDni(dto.getDni());
		entidad.setClave(dto.getClave());

		return entidad;
	}
}
