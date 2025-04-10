package com.reg.check.pro.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController
public class HealthCheckController {

	@Autowired
	private WebClient webClient;

	@GetMapping("/health")
	public String checkService() {
		return "service up";
	}

	@GetMapping("/webclient")
	public Mono<Map> webclient() {

		Mono<String> call1 = webClient.get().uri("http://localhost:8080/health").retrieve().bodyToMono(String.class);

		Mono<String> call2 = webClient.get().uri("http://localhost:8080/health").retrieve().bodyToMono(String.class);

		Mono<String> call3 = webClient.get().uri("http://localhost:8080/health").retrieve().bodyToMono(String.class);

		 return Mono.zip(call1, call2, call3)
		            .map(result -> {
		                Map<String, String> map = new HashMap<>();
		                map.put("cal1", result.getT1());
		                map.put("cal2", result.getT2());
		                map.put("cal3", result.getT3());
		                return map;
		            });
		
	}

	@GetMapping("/multiple")
	public Map<String, String> callMultipleApis() {

		Map<String, String> map = new HashMap<>();

		CompletableFuture<String> call1 = mutliCall1();
		CompletableFuture<String> call2 = mutliCall2();
		CompletableFuture<String> call3 = mutliCall3();

		CompletableFuture<Void> allOf = CompletableFuture.allOf(call1, call2, call3);
		try {
			allOf.join();
			map.put("cal1", call1.get());
			map.put("cal2", call2.get());
			map.put("cal3", call3.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		return map;

	}

	private CompletableFuture<String> mutliCall1() {
		String s = webClient.get().uri("http://localhost:8080/health").retrieve().bodyToMono(String.class).block();
		return CompletableFuture.supplyAsync(() -> s);

	}

	private CompletableFuture<String> mutliCall2() {
		return CompletableFuture.supplyAsync(
				() -> webClient.get().uri("http://localhost:8080/health").retrieve().bodyToMono(String.class).block());
	}

	private CompletableFuture<String> mutliCall3() {
		return CompletableFuture.supplyAsync(
				() -> webClient.get().uri("http://localhost:8080/health").retrieve().bodyToMono(String.class).block());
	}

}
