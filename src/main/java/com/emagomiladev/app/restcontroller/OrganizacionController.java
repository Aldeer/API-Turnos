package com.emagomiladev.app.restcontroller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emagomiladev.app.dto.OrganizacionDto;
import com.emagomiladev.app.dto.RespuestaOrgDto;
import com.emagomiladev.app.dto.SolicitudOrgDto;
import com.emagomiladev.app.services.IOrganizacionService;

@RestController
@RequestMapping("/api/v1/organizaciones")
public class OrganizacionController {

	@Autowired
	private IOrganizacionService orgService;

	@GetMapping("/{nombre}")
	public ResponseEntity<Map<String, Object>> buscarOrganizacion(@PathVariable(name = "nombre") String nombre) {
		Map<String, Object> res = new HashMap<>();
		RespuestaOrgDto dto = orgService.findByNombre(nombre);
		res.put("Organizacion", dto);

		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	@GetMapping("/todas")
	public ResponseEntity<Map<String, Object>> traerTodasLasOrganizaciones() {
		Map<String, Object> res = new HashMap<>();
		res.put("Organizaciones", orgService.obtenerTodasLasOrganizaciones());
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	@GetMapping("/cuit")
	public ResponseEntity<Map<String, Object>> traerOrganizacionPorCuit(@RequestParam String cuit) {
		Map<String, Object> res = new HashMap<>();
		res.put("Respuesta", orgService.findByCuit(cuit));
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	@PostMapping("/nuevaOrganizacion")
	public ResponseEntity<Map<String, Object>> crear(@Valid @RequestBody OrganizacionDto dto) {
		Map<String, Object> res = new HashMap<>();
		res.put("Empresa:", orgService.crearNuevaOrganizacion(dto));

		return new ResponseEntity<>(res, HttpStatus.CREATED);
	}

	@PutMapping("/modificar")
	public ResponseEntity<Map<String, Object>> actualizar(@Valid @RequestBody SolicitudOrgDto dto) {
		Map<String, Object> res = new HashMap<>();
		RespuestaOrgDto orgMod = orgService.actualizarOrganizacion(dto);
		res.put("Empresa modificada", orgMod);
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	@DeleteMapping("/eliminar")
	public ResponseEntity<Map<String, Object>> eliminar(@Valid @RequestBody SolicitudOrgDto dto) {
		Map<String, Object> res = new HashMap<>();
		res.put("Mensaje", orgService.eliminarEmpresa(dto));

		return new ResponseEntity<>(res, HttpStatus.OK);
	}

}
