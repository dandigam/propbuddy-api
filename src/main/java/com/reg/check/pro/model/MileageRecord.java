package com.reg.check.pro.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MileageRecord {

    @JsonProperty("DateOfInformation")
    private String dateOfInformation;
    
    @JsonProperty("SourceOfInformation")
    private String sourceOfInformation;
    
    @JsonProperty("Mileage")
    private int mileage;
}

