package com.reg.check.pro.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TechnicalSupport {
    
    @JsonProperty("ServerId")
    private String serverId;
    
    @JsonProperty("RequestId")
    private String requestId;
    
    @JsonProperty("QueryDurationMs")
    private int queryDurationMs;
    
    @JsonProperty("SupportDate")
    private String supportDate;
    
    @JsonProperty("SupportTime")
    private String supportTime;
    
    @JsonProperty("SupportCode")
    private String supportCode;
    
    @JsonProperty("SupportInformationList")
    private List<Object> supportInformationList;
}


