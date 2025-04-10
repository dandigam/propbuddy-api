package com.reg.check.pro.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusInformation {

	@JsonProperty("Lookup")
    private Lookup lookup;
}


