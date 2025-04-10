package com.reg.check.pro.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @JsonProperty("RequestGuid")
    private String requestGuid;
    
    @JsonProperty("PackageId")
    private String packageId;
    
    @JsonProperty("PackageVersion")
    private int packageVersion;
    
    @JsonProperty("ResponseVersion")
    private int responseVersion;
    
    @JsonProperty("DataKeys")
    private Map<String, String> dataKeys;
}

