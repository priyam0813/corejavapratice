package com.wipro.users.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;
@RestControllerAdvice
public class GlobalExceptionHandler {

	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> handleResourceNotFoundException(Exception e){
		ResponseEntity<String> resposeEntity = new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		return resposeEntity;
	}
}
