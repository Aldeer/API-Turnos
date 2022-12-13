package com.emagomiladev.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emagomiladev.app.dao.EventoDao;
import com.emagomiladev.app.dao.PersonaDao;
import com.emagomiladev.app.dao.TurnoDao;
import com.emagomiladev.app.dto.RespuestaTurnoDto;
import com.emagomiladev.app.dto.SolicitudTurnoDto;
import com.emagomiladev.app.entities.Evento;
import com.emagomiladev.app.entities.Persona;
import com.emagomiladev.app.entities.Turno;
import com.emagomiladev.app.exceptions.EventOrganizationException;
import com.emagomiladev.app.exceptions.ResourceNotFoundException;
import com.emagomiladev.app.exceptions.WrongPasswordException;
import com.emagomiladev.app.utilities.GeneradorDeCodigo;
import com.emagomiladev.app.wrappers.TurnoWrapper;

@Service
public class TurnoServiceImpl implements ITurnoService {

	@Autowired
	private PersonaDao personaDao;

	@Autowired
	private EventoDao eveDao;

	@Autowired
	private TurnoDao turnoDao;

	@Override
	public RespuestaTurnoDto crearTurno(SolicitudTurnoDto dto) {
		Persona per = personaDao.findByDni(dto.getDni())
				.orElseThrow(() -> new ResourceNotFoundException("PERSONA", "DNI", Long.toString(dto.getDni())));

		if (!dto.getClave().equals(per.getClave()))
			throw new WrongPasswordException();

		Evento event = eveDao.findByNombre(dto.getNombreEvento())
				.orElseThrow(() -> new ResourceNotFoundException("EVENTO", "NOMBRE", dto.getNombreEvento()));

		if (!event.getOrganizacion().getNombre().equals(dto.getNombreEmpresa()))
			throw new EventOrganizationException();

		if (event.getFechaEvento() != null)
			dto.setFechaEvento(event.getFechaEvento());

		Turno turnoGuardado = TurnoWrapper.mapearEntidad(dto, per, event);

		while (turnoGuardado.equals(turnoDao.findByCodigo(turnoGuardado.getCodigo()))) {
			turnoGuardado.setCodigo(GeneradorDeCodigo.generar());
		}

		turnoDao.save(turnoGuardado);

		return TurnoWrapper.mapearDto(turnoGuardado, per, event);
	}

}
