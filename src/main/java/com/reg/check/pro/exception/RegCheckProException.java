package com.reg.check.pro.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RegCheckProException {

	@ExceptionHandler(DVLAApiException.class)
	public ResponseEntity<String> dVLAApiException(DVLAApiException exception) {

		switch (exception.getErrorCode().statusCode().value()) {
		case 404:
			return ResponseEntity.status(404).body("Data not found.");
		case 400:
			return ResponseEntity.status(400).body("Bad Request..");
		case 500:
			return ResponseEntity.status(500).body("Server error..");
		default:
			return ResponseEntity.status(500).body("An unknown error occurred.");

		}
	}

}
