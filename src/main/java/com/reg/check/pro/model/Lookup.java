package com.reg.check.pro.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lookup {
    
    @JsonProperty("StatusCode")
    private String statusCode;
    
    @JsonProperty("StatusMessage")
    private String statusMessage;
    
    @JsonProperty("AdviceTextList")
    private List<Object> adviceTextList;
}

