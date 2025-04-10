package com.prop.app.controller;

import com.prop.app.dto.ContactRequestDto;
import com.prop.app.service.ContactUsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/contact-us")
@RequiredArgsConstructor
@Slf4j
public class ContactUsController {

    @Autowired
    private ContactUsService contactService;

    @PostMapping("/submit")
    @Operation(summary = "Handles 'Contact Us' form submission and saves user inquiry.")

    public ResponseEntity<String> submitContactForm(@RequestBody ContactRequestDto contactRequestDto) {
        contactService.saveContact(contactRequestDto);
        return ResponseEntity.ok("Your information has been submitted successfully");
    }
}
