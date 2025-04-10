package com.reg.check.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reg.check.pro.model.Root;
import com.reg.check.pro.service.DVLAApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/vehicle")
@Tag(name = "Vehicle Lookup", description = "APIs for fetching vehicle information based on registration number")
public class VehicleInformationController {

	@Autowired
	private DVLAApiService dVLAApiService;

	@Operation(summary = "Get vehicle information", description = "Fetches vehicle details by registration number.")
	@GetMapping("/lookup/{registration}")
	public ResponseEntity<Root> getVehicleInfo(@PathVariable String registration) {

		Root apiResponse = dVLAApiService.getVdiCheckFull(registration);
		return ResponseEntity.ok(apiResponse);
	}
}
