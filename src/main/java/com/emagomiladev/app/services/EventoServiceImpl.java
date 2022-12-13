package com.emagomiladev.app.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emagomiladev.app.dao.EventoDao;
import com.emagomiladev.app.dao.OrganizacionDao;
import com.emagomiladev.app.dto.EventoDto;
import com.emagomiladev.app.dto.RespuestaEventoDto;
import com.emagomiladev.app.dto.RespuestaListaEventoDto;
import com.emagomiladev.app.dto.SolicitudEventoDto;
import com.emagomiladev.app.entities.Evento;
import com.emagomiladev.app.entities.Organizacion;
import com.emagomiladev.app.exceptions.ResourceNotFoundException;
import com.emagomiladev.app.exceptions.WrongPasswordException;
import com.emagomiladev.app.wrappers.EventoWrapper;

@Service
public class EventoServiceImpl implements IEventoService {

	@Autowired
	private OrganizacionDao orgDao;

	@Autowired
	private EventoDao eveDao;

	@Override
	public RespuestaEventoDto crearEvento(EventoDto dto) {
		Organizacion org = orgDao.findByNombre(dto.getNombreEmpresa())
				.orElseThrow(() -> new ResourceNotFoundException("ORGANIZACION", "NOMBRE", dto.getNombreEmpresa()));
		if (!dto.getClave().equals(org.getClave()))
			throw new WrongPasswordException();

		Evento mapEvento = EventoWrapper.mapearEntidad(dto, org);
		Evento eventoGuardado = eveDao.save(mapEvento);

		return EventoWrapper.mapearDto(eventoGuardado);
	}

	@Override
	public RespuestaEventoDto modificarEvento(SolicitudEventoDto dto) {

		Organizacion org = orgDao.findByNombre(dto.getNombreEmpresa())
				.orElseThrow(() -> new ResourceNotFoundException("ORGANIZACION", "NOMBRE", dto.getNombreEmpresa()));
		if (!dto.getClave().equals(org.getClave()))
			throw new WrongPasswordException();

		Evento eve = eveDao.findByNombre(dto.getNombreEvento())
				.orElseThrow(() -> new ResourceNotFoundException("EVENTO", "NOMBRE", dto.getNombreEvento()));

		if (dto.getNombreMod() != null)
			eve.setNombre(dto.getNombreMod());
		if (dto.getUbicacionMod() != null)
			eve.setUbicacion(dto.getUbicacionMod());
		if (dto.getTipoEventoMod() != null)
			eve.setTipoEvento(dto.getTipoEventoMod());
		if (dto.getFechaEventoMod() != null)
			eve.setFechaEvento(dto.getFechaEventoMod());

		eveDao.save(eve);

		return EventoWrapper.mapearDto(eve);
	}

	@Override
	public String eliminarEvento(SolicitudEventoDto dto) {
		Organizacion org = orgDao.findByNombre(dto.getNombreEmpresa())
				.orElseThrow(() -> new ResourceNotFoundException("ORGANIZACION", "NOMBRE", dto.getNombreEmpresa()));
		if (!dto.getClave().equals(org.getClave()))
			throw new WrongPasswordException();

		Evento eve = eveDao.findByNombre(dto.getNombreEvento())
				.orElseThrow(() -> new ResourceNotFoundException("EVENTO", "NOMBRE", dto.getNombreEvento()));

		eveDao.deleteById(eve.getId());
		return "¡EVENTO ELIMINADO CON EXITO!";
	}

	@Override
	public List<RespuestaListaEventoDto> obtenerTodosLosEventosDeOrganizacion(SolicitudEventoDto dto) {

		System.out.println(dto.toString());
		Organizacion org = orgDao.findByNombre(dto.getNombreEmpresa())
				.orElseThrow(() -> new ResourceNotFoundException("ORGANIZACION", "NOMBRE", dto.getNombreEmpresa()));
		List<Evento> eventos = eveDao.findByOrganizacionId(org.getId());
		List<RespuestaListaEventoDto> eventosDtos = eventos.stream()
				.map((evento) -> EventoWrapper.mapearListaDto(evento)).collect(Collectors.toList());
		return eventosDtos;
	}

}
