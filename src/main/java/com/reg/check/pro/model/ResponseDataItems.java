package com.reg.check.pro.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDataItems {
	@JsonProperty("WriteOffRecordCount")
    private int writeOffRecordCount;
    
    @JsonProperty("LookupStatusMessage")
    private String lookupStatusMessage;
    
    @JsonProperty("MileageRecordCount")
    private int mileageRecordCount;
    
    @JsonProperty("Vrm")
    private String vrm;
    
    @JsonProperty("ImportUsedBeforeUkRegistration")
    private String importUsedBeforeUkRegistration;
    
    @JsonProperty("VicTestDate")
    private String vicTestDate;
    
    @JsonProperty("DateFirstRegistered")
    private String dateFirstRegistered;
    
    @JsonProperty("Model")
    private String model;
    
    @JsonProperty("PreviousColour")
    private String previousColour;
    
    @JsonProperty("StolenStatus")
    private String stolenStatus;
    
    @JsonProperty("PreviousKeeperCount")
    private int previousKeeperCount;
    
    @JsonProperty("WriteOffDate")
    private String writeOffDate;
    
    @JsonProperty("ImportDate")
    private String importDate;
    
    @JsonProperty("StolenPoliceForce")
    private String stolenPoliceForce;
    
    @JsonProperty("FuelType")
    private String fuelType;
    
    @JsonProperty("LookupStatusCode")
    private String lookupStatusCode;
    
    @JsonProperty("CertificateOfDestructionIssued")
    private String certificateOfDestructionIssued;
    
    @JsonProperty("LatestColourChangeDate")
    private String latestColourChangeDate;
    
    @JsonProperty("Data")
    private String data;
    
    @JsonProperty("WriteOffCategory")
    private String writeOffCategory;
    
    @JsonProperty("ColourChangeCount")
    private int colourChangeCount;
    
    @JsonProperty("HighRiskRecordCount")
    private int highRiskRecordCount;
    
    @JsonProperty("ImportedFromOutsideEu")
    private boolean importedFromOutsideEu;
    
    @JsonProperty("Make")
    private String make;
    
    @JsonProperty("LatestV5cIssuedDate")
    private String latestV5cIssuedDate;
    
    @JsonProperty("MileageRecordList")
    private List<MileageRecord> mileageRecordList;
    
    @JsonProperty("MileageAnomalyDetected")
    private boolean mileageAnomalyDetected;
    
    @JsonProperty("VinLast5")
    private String vinLast5;
    
    @JsonProperty("VicTestResult")
    private String vicTestResult;
    
    @JsonProperty("DateFirstRegisteredUk")
    private String dateFirstRegisteredUk;
    
    @JsonProperty("WriteOffRecordList")
    private String writeOffRecordList;
    
    @JsonProperty("StolenDate")
    private String stolenDate;
    
    @JsonProperty("LatestKeeperChangeDate")
    private String latestKeeperChangeDate;
    
    @JsonProperty("StolenContactNumber")
    private String stolenContactNumber;
    
    @JsonProperty("FinanceRecordCount")
    private int financeRecordCount;
    
    @JsonProperty("PlateChangeCount")
    private int plateChangeCount;
    
    @JsonProperty("ScrapDate")
    private String scrapDate;
    
    @JsonProperty("ExportDate")
    private String exportDate;
    
    @JsonProperty("FinanceRecordList")
    private List<Object> financeRecordList;
    
    @JsonProperty("StolenMiaftrRecordCount")
    private int stolenMiaftrRecordCount;
    
    @JsonProperty("GearCount")
    private int gearCount;
    
    @JsonProperty("PlateChangeList")
    private List<Object> plateChangeList;
    
    @JsonProperty("Exported")
    private boolean exported;
    
    @JsonProperty("HighRiskRecordList")
    private List<Object> highRiskRecordList;
    
    @JsonProperty("TransmissionType")
    private String transmissionType;
    
    @JsonProperty("Scrapped")
    private boolean scrapped;
    
    @JsonProperty("WrittenOff")
    private boolean writtenOff;
    
    @JsonProperty("YearOfManufacture")
    private String yearOfManufacture;
    
    @JsonProperty("EngineCapacity")
    private int engineCapacity;
    
    @JsonProperty("Stolen")
    private boolean stolen;
    
    @JsonProperty("PreviousKeepers")
    private String previousKeepers;
    
    @JsonProperty("Imported")
    private boolean imported;
    
    @JsonProperty("StolenMiaftrRecordList")
    private List<Object> stolenMiaftrRecordList;
    
    @JsonProperty("VicTested")
    private String vicTested;
    
    @JsonProperty("Colour")
    private String colour;
}

