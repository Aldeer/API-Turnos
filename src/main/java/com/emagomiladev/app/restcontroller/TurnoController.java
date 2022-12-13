package com.emagomiladev.app.restcontroller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emagomiladev.app.dto.SolicitudTurnoDto;
import com.emagomiladev.app.services.ITurnoService;

@RestController
@RequestMapping("/api/v1/turnos")
public class TurnoController {

	@Autowired
	private ITurnoService turnService;

	@PostMapping("/nuevoTurno")
	public ResponseEntity<Map<String, Object>> ObtenerTurnoAEvento(@RequestBody SolicitudTurnoDto dto) {
		Map<String, Object> res = new HashMap<>();
		res.put("Turno generado", turnService.crearTurno(dto));
		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.CREATED);
	}
}
