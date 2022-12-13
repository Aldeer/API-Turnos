package com.emagomiladev.app.services;

import com.emagomiladev.app.dto.RespuestaTurnoDto;
import com.emagomiladev.app.dto.SolicitudTurnoDto;

public interface ITurnoService {

	public RespuestaTurnoDto crearTurno(SolicitudTurnoDto dto);
}
