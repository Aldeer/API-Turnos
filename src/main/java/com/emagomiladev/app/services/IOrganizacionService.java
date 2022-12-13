package com.emagomiladev.app.services;

import java.util.List;

import com.emagomiladev.app.dto.OrganizacionDto;
import com.emagomiladev.app.dto.RespuestaOrgDto;
import com.emagomiladev.app.dto.SolicitudOrgDto;

public interface IOrganizacionService {

	public RespuestaOrgDto crearNuevaOrganizacion(OrganizacionDto dto);

	public RespuestaOrgDto findByNombre(String nombre);

	public List<RespuestaOrgDto> obtenerTodasLasOrganizaciones();

	public RespuestaOrgDto findByCuit(String cuit);

	public RespuestaOrgDto actualizarOrganizacion(SolicitudOrgDto dto);

	public String eliminarEmpresa(SolicitudOrgDto dto);
}
