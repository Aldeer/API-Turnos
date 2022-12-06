package com.emagomiladev.app.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.emagomiladev.app.dto.ErrorDetallesDto;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorDetallesDto> handlerResourceNotFoundExceptions(ResourceNotFoundException exception, WebRequest wRequest){
		ErrorDetallesDto error = new ErrorDetallesDto(new Date(), exception.getMessage(), wRequest.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(wrongPasswordException.class) 
	public ResponseEntity<ErrorDetallesDto> handlerWrongPasswordExceptions(wrongPasswordException exception, WebRequest wbr){
		ErrorDetallesDto error = new ErrorDetallesDto(new Date(),  exception.getMessage(), wbr.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.FORBIDDEN);
	}
}
