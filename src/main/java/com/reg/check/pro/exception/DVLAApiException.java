package com.reg.check.pro.exception;

import org.springframework.web.reactive.function.client.ClientResponse;

public class DVLAApiException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private final ClientResponse errorCode;

	public DVLAApiException(ClientResponse errorCode) {
		super("Error response: " + errorCode.statusCode());
		this.errorCode = errorCode;
	}

	public ClientResponse getErrorCode() {
		return errorCode;
	}

}
