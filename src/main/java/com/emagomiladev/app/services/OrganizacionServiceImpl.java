package com.emagomiladev.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emagomiladev.app.dao.OrganizacionDao;
import com.emagomiladev.app.dto.OrganizacionDto;
import com.emagomiladev.app.dto.RespuestaOrgDto;
import com.emagomiladev.app.dto.SolicitudOrgDto;
import com.emagomiladev.app.entities.Organizacion;
import com.emagomiladev.app.exceptions.ResourceNotFoundException;
import com.emagomiladev.app.exceptions.wrongPasswordException;
import com.emagomiladev.app.wrappers.OrganizacionWrapper;

@Service
public class OrganizacionServiceImpl implements IOrganizacionService {

	@Autowired
	private OrganizacionDao daoOrg;

	@Override
	public RespuestaOrgDto crearNuevaOrganizacion(OrganizacionDto dto) {
		Organizacion entidad = OrganizacionWrapper.mapearEntidad(dto);
		Organizacion guardarEntidad = daoOrg.save(entidad);
		return OrganizacionWrapper.mapearRespuestaDto(guardarEntidad);
	}

	@Override
	public RespuestaOrgDto findByNombre(String nombre) {
		Organizacion org = daoOrg.findByNombre(nombre)
				.orElseThrow(() -> new ResourceNotFoundException("Organizacion", "nombre", nombre));
		return OrganizacionWrapper.mapearRespuestaDto(org);
	}


	@Override
	public RespuestaOrgDto actualizarOrganizacion(SolicitudOrgDto dto) {

		Organizacion org = daoOrg.findByNombre(dto.getNombre())
				.orElseThrow(() -> new ResourceNotFoundException("Organizacion", "nombre", dto.getNombre()));
		
		if (!dto.getClave().equals(org.getClave()))
			throw new wrongPasswordException();

		if (dto.getOrganizacion().getNombre() != null)
			org.setNombre(dto.getOrganizacion().getNombre());
		if (dto.getOrganizacion().getCuit() != null)
			org.setCuit(dto.getOrganizacion().getCuit());
		if (dto.getOrganizacion().getDireccion() != null)
			org.setDireccion(dto.getOrganizacion().getDireccion());
		if (dto.getOrganizacion().getTelefono() != null)
			org.setTelefono(dto.getOrganizacion().getTelefono());
		if (dto.getOrganizacion().getEmail() != null)
			org.setEmail(dto.getOrganizacion().getEmail());
		if (dto.getOrganizacion().getClave() != null)
			org.setClave(dto.getOrganizacion().getClave());

		RespuestaOrgDto orgDto = OrganizacionWrapper.mapearRespuestaDto(daoOrg.save(org));
		return orgDto;
	}


	@Override
	public String eliminarEmpresa(SolicitudOrgDto dto) {
		
		Organizacion org = daoOrg.findByNombre(dto.getNombre())
				.orElseThrow(() -> new ResourceNotFoundException("Organizacion", "nombre", dto.getNombre()));
		if (!dto.getClave().equals(org.getClave()))
			throw new wrongPasswordException();
		
		daoOrg.delete(org);
		return "Empresa eliminada con exito!";
	}

}
