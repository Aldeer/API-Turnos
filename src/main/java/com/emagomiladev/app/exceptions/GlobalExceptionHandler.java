package com.emagomiladev.app.exceptions;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.emagomiladev.app.dto.ErrorDetallesDto;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorDetallesDto> handlerResourceNotFoundExceptions(ResourceNotFoundException exception,
			WebRequest wRequest) {
		ErrorDetallesDto error = new ErrorDetallesDto(new Date(), exception.getMessage(),
				wRequest.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(WrongPasswordException.class)
	public ResponseEntity<ErrorDetallesDto> handlerWrongPasswordExceptions(WrongPasswordException exception,
			WebRequest wbr) {
		ErrorDetallesDto error = new ErrorDetallesDto(new Date(), exception.getMessage(), wbr.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.FORBIDDEN);
	}

	@ExceptionHandler(EventOrganizationException.class)
	public ResponseEntity<ErrorDetallesDto> handlerEventOrganizationException(EventOrganizationException ex,
			WebRequest wbr) {
		ErrorDetallesDto error = new ErrorDetallesDto(new Date(), ex.getMessage(), wbr.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(ExistingUserException.class)
	public ResponseEntity<ErrorDetallesDto> handlerExistingUserException(ExistingUserException ex, WebRequest wbr) {
		ErrorDetallesDto error = new ErrorDetallesDto(new Date(), ex.getMessage(), wbr.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(ExistingOrganizationException.class)
	public ResponseEntity<ErrorDetallesDto> handlerExistingOrganizationException(ExistingOrganizationException ex,
			WebRequest wbr) {
		ErrorDetallesDto error = new ErrorDetallesDto(new Date(), ex.getMessage(), wbr.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		Map<String, String> errores = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String nombreDelCampo = ((FieldError) error).getField();
			String mensaje = error.getDefaultMessage();

			errores.put(nombreDelCampo, mensaje);
		});

		return new ResponseEntity<>(errores, HttpStatus.BAD_REQUEST);
	}
}
