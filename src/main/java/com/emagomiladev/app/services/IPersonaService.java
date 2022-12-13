package com.emagomiladev.app.services;

import java.util.List;

import com.emagomiladev.app.dto.EliminarPersonaDto;
import com.emagomiladev.app.dto.PersonaDto;
import com.emagomiladev.app.dto.RespuestaPersonaDto;

public interface IPersonaService {
	
	public RespuestaPersonaDto crearPersona(PersonaDto dto);

	public List<RespuestaPersonaDto> obtenerPersonasPorApellido(String apellido);

	public List<RespuestaPersonaDto> obtenerTodasLasPersonas();

	public List<RespuestaPersonaDto> obtenerPersonasPorNombre(String nombre);

	public RespuestaPersonaDto obtenerPersonasPorDni(Long dni);
	
	public RespuestaPersonaDto modificarPersona(PersonaDto dto);
	
	public String eliminarPersona(EliminarPersonaDto dto);
}
