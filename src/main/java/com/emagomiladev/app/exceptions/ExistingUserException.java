package com.emagomiladev.app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ExistingUserException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final static String MENSAJE = "¡Ya se encuentra registrado un usuario con ese DNI!";

	public ExistingUserException() {
		super(MENSAJE);
	}

}
