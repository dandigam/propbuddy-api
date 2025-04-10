package com.reg.check.pro.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Root {
    
    @JsonProperty("BillingAccount")
    private BillingAccount billingAccount;
    
    @JsonProperty("TechnicalSupport")
    private TechnicalSupport technicalSupport;
    
    @JsonProperty("Request")
    private Request request;
    
    @JsonProperty("Response")
    private Response response;
}

