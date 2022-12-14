package com.emagomiladev.app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class ExistingOrganizationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private static final String MENSAJE = "¡Ya se encuentra registrada la organizacion con '%s: %s'!";

	public ExistingOrganizationException(String valor, String campo) {
		super(String.format(MENSAJE, campo, valor));
	}

}
