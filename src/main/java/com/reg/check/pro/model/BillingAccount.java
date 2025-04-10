package com.reg.check.pro.model;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class BillingAccount {

    @JsonProperty("AccountType")
    private String accountType;
    
    @JsonProperty("AccountBalance")
    private double accountBalance;
    
    @JsonProperty("TransactionCost")
    private double transactionCost;
    
    @JsonProperty("ExtraInformation")
    private Map<String, Object> extraInformation;
}

