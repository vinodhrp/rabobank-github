package com.rabobank.git.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.rabobank.git.util.ErrorMessage;

import feign.FeignException;

/**
 * 
 * @author vinodhr
 *
 */
@ControllerAdvice
@Component
public class RaboExceptionHandler extends ResponseEntityExceptionHandler {

	public Logger logger = LoggerFactory.getLogger(RaboExceptionHandler.class);

	@ExceptionHandler(value = { FeignException.class })
	public ResponseEntity<?> handleFeignExceptions(Exception ex, WebRequest request) {
		logger.error("Excpetion thrown due to Feign Client....  : ", ex.getMessage());
		ErrorMessage apiCustomMessage = new ErrorMessage(HttpStatus.BAD_REQUEST,
				"Excpetion thrown due to Feign Client" + ex.getMessage());
		return new ResponseEntity<ErrorMessage>(apiCustomMessage, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<?> handleAllExceptions(Exception ex, WebRequest request) {
		logger.error("Something went Wrong : ", ex.getMessage());
		ErrorMessage apiCustomMessage = new ErrorMessage(HttpStatus.BAD_REQUEST,
				"Something went Wrong :" + ex.getMessage());
		return new ResponseEntity<ErrorMessage>(apiCustomMessage, HttpStatus.BAD_REQUEST);
	}

}
