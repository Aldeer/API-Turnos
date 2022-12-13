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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emagomiladev.app.dto.EliminarPersonaDto;
import com.emagomiladev.app.dto.PersonaDto;
import com.emagomiladev.app.services.IPersonaService;

@RestController
@RequestMapping("/api/v1/personas")
public class PersonasController {

	@Autowired
	private IPersonaService perService;

	@GetMapping("/apellidos")
	public ResponseEntity<Map<String, Object>> buscarPersonasPorApellido(@RequestParam String apellido) {
		Map<String, Object> res = new HashMap<>();
		res.put("Usuarios", perService.obtenerPersonasPorApellido(apellido));
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	@GetMapping("/todos")
	public ResponseEntity<Map<String, Object>> obtenerTodasLasPersonas() {
		Map<String, Object> res = new HashMap<>();
		res.put("Todos los Usuarios", perService.obtenerTodasLasPersonas());
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	@GetMapping("/nroDocumento")
	public ResponseEntity<Map<String, Object>> buscarPersonaPorDni(@RequestParam Long dni) {
		Map<String, Object> res = new HashMap<>();
		res.put("Usuario", perService.obtenerPersonasPorDni(dni));
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	@PostMapping("/registrarse")
	public ResponseEntity<Map<String, Object>> registrarPersona(@RequestBody PersonaDto dto) {
		Map<String, Object> res = new HashMap<>();
		res.put("Registro", perService.crearPersona(dto));
		return new ResponseEntity<>(res, HttpStatus.CREATED);
	}

	@PutMapping("/modificar")
	public ResponseEntity<Map<String, Object>> modificarRegistroPersona(@RequestBody PersonaDto dto) {
		Map<String, Object> res = new HashMap<>();
		res.put("Mensaje", perService.modificarPersona(dto));
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminar")
	public ResponseEntity<Map<String, Object>> eliminarRegistroPersona(@RequestBody EliminarPersonaDto dto){
		Map<String, Object> res = new HashMap<>();
		res.put("Mensaje", perService.eliminarPersona(dto));
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
	
}
