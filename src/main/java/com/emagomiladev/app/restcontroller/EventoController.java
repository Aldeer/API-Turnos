package com.emagomiladev.app.restcontroller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emagomiladev.app.dto.EventoDto;
import com.emagomiladev.app.dto.SolicitudEventoDto;
import com.emagomiladev.app.services.IEventoService;

@RestController
@RequestMapping("/api/v1/eventos")
public class EventoController {

	@Autowired
	private IEventoService eventoService;

	@GetMapping("/obtenerTodos")
	public ResponseEntity<Map<String, Object>> obtenerTodosLosEventosDeUnaOrg(@RequestBody SolicitudEventoDto dto) {
		Map<String, Object> res = new HashMap<>();
		res.put("Todos los eventos de: " + dto.getNombreEmpresa(),
				eventoService.obtenerTodosLosEventosDeOrganizacion(dto));
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	@PostMapping("/nuevo")
	public ResponseEntity<Map<String, Object>> crearEvento(@RequestBody EventoDto dto) {
		Map<String, Object> res = new HashMap<>();
		res.put("Evento", eventoService.crearEvento(dto));
		return new ResponseEntity<>(res, HttpStatus.CREATED);
	}

	@PutMapping("/modificar")
	public ResponseEntity<Map<String, Object>> modificarEvento(@RequestBody SolicitudEventoDto dto) {
		Map<String, Object> res = new HashMap<>();
		res.put("Evento Modificado", eventoService.modificarEvento(dto));
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	@DeleteMapping("/eliminar")
	public ResponseEntity<Map<String, Object>> eliminarEvento(@RequestBody SolicitudEventoDto dto) {
		Map<String, Object> res = new HashMap<>();
		res.put("Mensaje", eventoService.eliminarEvento(dto));

		return new ResponseEntity<>(res, HttpStatus.OK);
	}
}
