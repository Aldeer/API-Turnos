package com.emagomiladev.app.exceptions;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class WrongPasswordException extends RuntimeException implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final String MENSAJE = "¡ERROR! CREDENCIALES NO VALIDAS";

	public WrongPasswordException() {
		super(MENSAJE);
	}

}
