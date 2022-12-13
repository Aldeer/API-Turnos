package com.emagomiladev.app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EventOrganizationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final static String MENSAJE = "¡Evento No pertenece a la organizacion!";

	public EventOrganizationException() {
		super(MENSAJE);
		// TODO Auto-generated constructor stub
	}

}
