package com.reg.check.pro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import com.reg.check.pro.exception.DVLAApiException;
import com.reg.check.pro.model.Root;

import reactor.core.publisher.Mono;

@Service
public class DVLAApiService {

	@Value("${dvla.auth_apikey}")
	private String authApiKey;

	@Value("${dvla.base-url}")
	private String baseUrl;

	@Autowired
	private WebClient webClient;

	public Root getVdiCheckFull(String registration) {

		String completeUrl = UriComponentsBuilder.fromUriString(baseUrl).path("datapackage/VdiCheckFull")
				.queryParam("v", 2).queryParam("api_nullitems", 1).queryParam("auth_apikey", authApiKey)
				.queryParam("key_VRM", registration).toUriString();

		ResponseEntity<Root> response = webClient.get().uri(completeUrl).retrieve()
				.onStatus(httpStatus -> !httpStatus.is2xxSuccessful(), errorCode -> {
					return Mono.error(new DVLAApiException(errorCode));
				}).toEntity(Root.class).block();

		return response.getBody();

	}

}
