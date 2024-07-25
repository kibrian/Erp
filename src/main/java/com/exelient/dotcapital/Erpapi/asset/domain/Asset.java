package com.exelient.dotcapital.Erpapi.asset.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
//@Table(name = "DT_ASSET", schema = "SALES")
@Table(name = "DT_ASSET")
@AllArgsConstructor
@NoArgsConstructor
public class Asset {
    @Id
    @Column(name = "VC_AGREEMENT_NO", nullable = false)
    private String agreementNo;

    @Column(name = "NU_SERIAL_NO")
    private Integer serialNo;

    @Column(name = "VC_COMP_CODE", nullable = false)
    private String compCode;

    @Column(name = "DT_AGREEMENT_DATE", nullable = false)
    private LocalDate agreementDate;

    @Column(name = "VC_ASSET_CODE")
    private String assetCode;

    @Column(name = "VC_ASSET_DESC")
    private String assetDesc;

    @Column(name = "VC_SERIAL_NO")
    private String vcSerialNo;

    @Column(name = "NU_QTY")
    private Integer quantity;

    @Column(name = "NU_PRICE")
    private BigDecimal price;

    @Column(name = "VC_VAT_TYPE")
    private String vatType;

    @Column(name = "NU_ASSET_VALUE")
    private BigDecimal assetValue;

    @Column(name = "NU_TOT_ASSET_VALUE")
    private BigDecimal totalAssetValue;

    @Column(name = "DT_MOD_DATE")
    private LocalDate modificationDate;

    @Column(name = "VC_DEFAULT_COMP")
    private String defaultComp;

    @Column(name = "VC_AUTH_CODE")
    private String authCode;

    @Column(name = "VC_TAX_CODE")
    private String taxCode;

    @Column(name = "NU_VAT_AMOUNT")
    private BigDecimal vatAmount;

    @Column(name = "NU_VAT_VALUE")
    private BigDecimal vatValue;

    @Column(name = "VC_GROUP_CODE")
    private String groupCode;

    @Column(name = "NU_ITEM_VALUE")
    private BigDecimal itemValue;

    @Column(name = "NU_TOT_VAT")
    private BigDecimal totalVat;

}
