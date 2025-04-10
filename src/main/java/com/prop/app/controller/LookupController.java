package com.prop.app.controller;

import com.prop.app.entity.PropertyTypeEntity;
import com.prop.app.service.LookupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/lookup")
public class LookupController {

    private final LookupService lookupService;

    public LookupController(LookupService lookupService) {
        this.lookupService = lookupService;
    }

    @GetMapping("/property-types")
    public ResponseEntity<List<PropertyTypeEntity>> getStates() {
        return ResponseEntity.ok().body(lookupService.getPropertyTypes());
    }


}

