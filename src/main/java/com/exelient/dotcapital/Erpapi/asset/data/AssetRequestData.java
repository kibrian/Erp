package com.exelient.dotcapital.Erpapi.asset.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssetRequestData {


    private String compCode;
    private Integer serialNo;
    private String agreementNo;
    private LocalDate agreementDate;
    private String assetCode;
    private String assetDesc;
    private String vcSerialNo;
    private Integer quantity;
    private BigDecimal price;
    private String vatType;
    private BigDecimal assetValue;
    private BigDecimal totalAssetValue;
    private LocalDate modificationDate;
    private String defaultComp;
    private String authCode;
    private String taxCode;
    private BigDecimal vatAmount;
    private BigDecimal vatValue;
    private String groupCode;
    private BigDecimal itemValue;
    private BigDecimal totalVat;

}
