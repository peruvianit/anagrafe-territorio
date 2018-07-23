package it.peruvianit.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import it.peruvianit.exception.ApiError;
import it.peruvianit.exception.IstatException;

@RestControllerAdvice
public class IstatControllerAdvice {
	
	private final Logger logger = LoggerFactory.getLogger(IstatControllerAdvice.class);

	
	//Default Handler
	@ExceptionHandler(IstatException.class)
	protected ResponseEntity<Object> handleIstatServiceException(RuntimeException e, WebRequest request) {

		if ( logger.isDebugEnabled() ) {
			logger.error(e.getMessage(), e);
		}
		
		ApiError apiError = new  ApiError(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);

		return new ResponseEntity<>(apiError, new HttpHeaders(),apiError.getStatus());
	}
}
