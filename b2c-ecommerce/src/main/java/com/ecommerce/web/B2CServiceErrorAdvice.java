package com.ecommerce.web;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ecommerce.exception.B2CException;

@ControllerAdvice
public class B2CServiceErrorAdvice {

    private static final Logger log = LoggerFactory.getLogger(B2CServiceErrorAdvice.class);

	@ExceptionHandler({RuntimeException.class})
    public ResponseEntity<String> handleRunTimeException(RuntimeException e) {
        log.error("System error", e);
        return error(INTERNAL_SERVER_ERROR, e);
    }
    
	@ExceptionHandler({B2CException.class})
    public ResponseEntity<String> handleNotFoundException(B2CException e) {
        log.error("Not found error", e);
        return error(NOT_FOUND, e);
    }

    private ResponseEntity<String> error(HttpStatus status, Exception e) {
        return ResponseEntity.status(status).body(e.getMessage());
    }
}
