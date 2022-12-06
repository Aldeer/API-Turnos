package com.emagomiladev.app.wrappers;

import com.emagomiladev.app.dto.OrganizacionDto;
import com.emagomiladev.app.dto.RespuestaOrgDto;
import com.emagomiladev.app.entities.Organizacion;

public class OrganizacionWrapper {
	
	public static OrganizacionDto mapearDto(Organizacion entidad) {
		OrganizacionDto dto = new OrganizacionDto();
		dto.setNombre(entidad.getNombre());
		dto.setCuit(entidad.getCuit());
		dto.setDireccion(entidad.getDireccion());
		dto.setTelefono(entidad.getTelefono());
		dto.setEmail(entidad.getEmail());
		dto.setFechaAlta(entidad.getFechaAlta());
		dto.setClave(entidad.getClave());
		
		return dto;
	}
	
	public static Organizacion mapearEntidad(OrganizacionDto dto) {
		Organizacion entidad = new Organizacion();
		entidad.setNombre(dto.getNombre());
		entidad.setCuit(dto.getCuit());
		entidad.setDireccion(dto.getDireccion());
		entidad.setTelefono(dto.getTelefono());
		entidad.setEmail(dto.getEmail());
		dto.generarFechaActual();
		entidad.setFechaAlta(dto.getFechaAlta());
		entidad.setClave(dto.getClave());
		
		return entidad;
	}
	
	public static RespuestaOrgDto mapearRespuestaDto(Organizacion entidad) {
		RespuestaOrgDto orgDto = new RespuestaOrgDto();
		orgDto.setNombre(entidad.getNombre());
		orgDto.setCuit(entidad.getCuit());
		orgDto.setDireccion(entidad.getDireccion());
		orgDto.setTelefono(entidad.getTelefono());
		orgDto.setEmail(entidad.getEmail());
		orgDto.setFechaAlta(entidad.getFechaAlta());
		return orgDto;
	}
}
