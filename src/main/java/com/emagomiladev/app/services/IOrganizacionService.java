package com.emagomiladev.app.services;

import com.emagomiladev.app.dto.OrganizacionDto;
import com.emagomiladev.app.dto.RespuestaOrgDto;
import com.emagomiladev.app.dto.SolicitudOrgDto;

public interface IOrganizacionService {

	public RespuestaOrgDto crearNuevaOrganizacion(OrganizacionDto dto);

	public RespuestaOrgDto findByNombre(String nombre);
	
	public RespuestaOrgDto actualizarOrganizacion(SolicitudOrgDto dto);
	
	public String eliminarEmpresa(SolicitudOrgDto dto);
}
