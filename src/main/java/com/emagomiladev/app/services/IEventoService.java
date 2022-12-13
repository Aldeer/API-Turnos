package com.emagomiladev.app.services;

import java.util.List;

import com.emagomiladev.app.dto.EventoDto;
import com.emagomiladev.app.dto.RespuestaEventoDto;
import com.emagomiladev.app.dto.RespuestaListaEventoDto;
import com.emagomiladev.app.dto.SolicitudEventoDto;

public interface IEventoService {

	public RespuestaEventoDto crearEvento(EventoDto dto);
	
	public RespuestaEventoDto modificarEvento(SolicitudEventoDto dto);
	
	public String eliminarEvento(SolicitudEventoDto dto);
	
	public List<RespuestaListaEventoDto> obtenerTodosLosEventosDeOrganizacion(SolicitudEventoDto dto);
}
