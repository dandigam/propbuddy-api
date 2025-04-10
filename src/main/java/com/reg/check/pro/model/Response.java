package com.reg.check.pro.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    @JsonProperty("StatusCode")
    private String statusCode;
    
    @JsonProperty("StatusMessage")
    private String statusMessage;
    
    @JsonProperty("StatusInformation")
    private StatusInformation statusInformation;
    
    @JsonProperty("DataItems")
    private ResponseDataItems dataItems;
}

