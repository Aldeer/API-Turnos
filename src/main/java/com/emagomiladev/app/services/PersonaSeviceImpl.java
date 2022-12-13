package com.emagomiladev.app.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emagomiladev.app.dao.PersonaDao;
import com.emagomiladev.app.dto.EliminarPersonaDto;
import com.emagomiladev.app.dto.PersonaDto;
import com.emagomiladev.app.dto.RespuestaPersonaDto;
import com.emagomiladev.app.entities.Persona;
import com.emagomiladev.app.exceptions.ExistingUserException;
import com.emagomiladev.app.exceptions.ResourceNotFoundException;
import com.emagomiladev.app.exceptions.WrongPasswordException;
import com.emagomiladev.app.wrappers.PersonaWrapper;

@Service
public class PersonaSeviceImpl implements IPersonaService {

	@Autowired
	private PersonaDao perDao;

	@Override
	public List<RespuestaPersonaDto> obtenerPersonasPorApellido(String apellido) {
		List<RespuestaPersonaDto> dtos = perDao.findByApellido(apellido).stream()
				.map(persona -> PersonaWrapper.mapearDto(persona)).collect(Collectors.toList());
		return dtos;
	}

	@Override
	public List<RespuestaPersonaDto> obtenerTodasLasPersonas() {
		List<RespuestaPersonaDto> dtos = perDao.findAll().stream().map(Persona -> PersonaWrapper.mapearDto(Persona))
				.collect(Collectors.toList());
		return dtos;
	}

	@Override
	public List<RespuestaPersonaDto> obtenerPersonasPorNombre(String nombre) {
		List<RespuestaPersonaDto> dtos = perDao.findByNombre(nombre).stream()
				.map(persona -> PersonaWrapper.mapearDto(persona)).collect(Collectors.toList());
		return dtos;
	}

	@Override
	public RespuestaPersonaDto obtenerPersonasPorDni(Long dni) {
		Persona persona = perDao.findByDni(dni)
				.orElseThrow(() -> new ResourceNotFoundException("PERSONA", "DNI", Long.toString(dni)));
		return PersonaWrapper.mapearDto(persona);
	}

	@Override
	public RespuestaPersonaDto crearPersona(PersonaDto dto) {
		if (perDao.existsByDni(dto.getDni()))
			throw new ExistingUserException();
		
		Persona entidad = PersonaWrapper.mapearEntidad(dto);
		perDao.save(entidad);
		return PersonaWrapper.mapearDto(entidad);
	}

	@Override
	public RespuestaPersonaDto modificarPersona(PersonaDto dto) {
		Persona persona = perDao.findByDni(dto.getDni())
				.orElseThrow(() -> new ResourceNotFoundException("PERSONA", "DNI", Long.toString(dto.getDni())));

		if (persona.getClave().equals(dto.getClave()))
			throw new WrongPasswordException();

		if (dto.getNombre() != null || !dto.getNombre().equals(persona.getNombre()))
			persona.setNombre(dto.getNombre());
		if (dto.getApellido() != null || !dto.getApellido().equals(persona.getApellido()))
			persona.setApellido(dto.getApellido());
		if (dto.getDniMod() != null || !dto.getDni().equals(persona.getDni()))
			persona.setDni(dto.getDniMod());

		perDao.save(persona);

		return PersonaWrapper.mapearDto(persona);
	}

	@Override
	public String eliminarPersona(EliminarPersonaDto dto) {
		Persona persona = perDao.findByDni(dto.getDni())
				.orElseThrow(() -> new ResourceNotFoundException("PERSONA", "DNI", Long.toString(dto.getDni())));

		if (persona.getClave().equals(dto.getClave()))
			throw new WrongPasswordException();

		perDao.delete(persona);

		return "¡REGISTRO ELIMINADO CON EXITO!";
	}

}
