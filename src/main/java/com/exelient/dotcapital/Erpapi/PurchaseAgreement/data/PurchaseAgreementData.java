package com.exelient.dotcapital.Erpapi.PurchaseAgreement.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseAgreementData {
    private String vcCompCode;
    private String vcAgreementNo;
    private LocalDate dtAgreementDate;
    private String vcPaymentMode;
    private String vcCustomerId;
    private String vcRemarks;
    private BigDecimal nuValue;
    private Integer nuTenure;
    private String vcInsuranceDetails;
    private String vcSalesAccount;
    private BigDecimal nuDownpayment;
    private Integer nuTotInst;
    private String vcTrackingDevice;
    private String vcInterestType;
    private BigDecimal nuIntRate;
    private LocalDate dtModDate;
    private String vcDefaultComp;
    private String vcAuthCode;
    private String chAuth;
    private BigDecimal nuInterest;
    private Integer nuCustomerCode;
    private String chCreateCode;
    private String chInterestType;
    private String vcCode;
    private String vcSalesmanCode;
    private Integer nuSalesAccountCode;
    private Integer nuIntAccCode;
    private BigDecimal nuTotAmount;
    private String chCancelApplication;
    private LocalDate dtCommencementDate;
    private String vcFacilityNo;
    private String vcType;
    private String vcLoanType;
    private BigDecimal nuInsurance;
    private BigDecimal nuProcess;
    private BigDecimal nuTracking;
    private BigDecimal nuChartels;
    private BigDecimal nuDeed;
    private BigDecimal nuOffer;
    private BigDecimal nuGuarantee;
    private BigDecimal nuLdischarge;
    private BigDecimal nuOthers;
    private BigDecimal nuCharteld;
    private BigDecimal nuLoanProcess;
    private String vcCurrency;
    private Integer nuCurrencyCode;
    private BigDecimal nuConvFactor;
    private String chType;
}
