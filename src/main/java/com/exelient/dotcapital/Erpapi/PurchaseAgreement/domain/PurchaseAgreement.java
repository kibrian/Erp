package com.exelient.dotcapital.Erpapi.PurchaseAgreement.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "HD_PURCHASE_AGREEMENT", schema = "SALES")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PurchaseAgreement {
    @Id
    @Column(name = "VC_AGREEMENT_NO")
    private String vcAgreementNo;

    @Column(name = "VC_COMP_CODE")
    private String vcCompCode;

    @Column(name = "DT_AGREEMENT_DATE")
    private LocalDate dtAgreementDate;

    @Column(name = "VC_PAYMENT_MODE")
    private String vcPaymentMode;
    @Column(name = "VC_CUSTOMER_ID")
    private String vcCustomerId;

    @Column(name = "VC_REMARKS")
    private String vcRemarks;

    @Column(name = "NU_VALUE")
    private BigDecimal nuValue;

    @Column(name = "NU_TENURE")
    private Integer nuTenure;

    @Column(name = "VC_INSURANCE_DETAILS")
    private String vcInsuranceDetails;

    @Column(name = "VC_SALES_ACCOUNT")
    private String vcSalesAccount;

    @Column(name = "NU_DOWNPAYMENT")
    private BigDecimal nuDownpayment;

    @Column(name = "NU_TOT_INST")
    private Integer nuTotInst;

    @Column(name = "VC_TRACKING_DEVICE")
    private String vcTrackingDevice;

    @Column(name = "VC_INTERES_TYPE")
    private String vcInteresType;

    @Column(name = "NU_INT_RATE")
    private BigDecimal nuIntRate;

    @Column(name = "DT_MOD_DATE")
    private LocalDate dtModDate;

    @Column(name = "VC_DEFAULT_COMP")
    private String vcDefaultComp;

    @Column(name = "VC_AUTH_CODE")
    private String vcAuthCode;

    @Column(name = "CH_AUTH")
    private String chAuth;

    @Column(name = "NU_INTEREST")
    private BigDecimal nuInterest;


    @Column(name = "NU_CUSTOMER_CODE" )
    private Integer nuCustomerCode;

    @Column(name = "CH_CREATE_CODE")
    private String chCreateCode;

    @Column(name = "CH_INTEREST_TYPE")
    private String chInterestType;

    @Column(name = "VC_CODE")
    private String vcCode;

    @Column(name = "VC_SALESMAN_CODE")
    private String vcSalesmanCode;

    @Column(name = "NU_SALES_ACCOUNT_CODE")
    private Integer nuSalesAccountCode;

    @Column(name = "NU_INT_ACC_CODE")
    private Integer nuIntAccCode;

    @Column(name = "NU_TOT_AMOUNT")
    private BigDecimal nuTotAmount;

    @Column(name = "CH_CANCEL_APPLICATION")
    private String chCancelApplication;

    @Column(name = "DT_COMMENCEMENT_DATE")
    private LocalDate dtCommencementDate;

    @Column(name = "VC_FACILITY_NO")
    private String vcFacilityNo;

    @Column(name = "VC_TYPE")
    private String vcType;

    @Column(name = "VC_LOAN_TYPE")
    private String vcLoanType;

    @Column(name = "NU_INSURANCE")
    private BigDecimal nuInsurance;

    @Column(name = "NU_PROCESS")
    private BigDecimal nuProcess;

    @Column(name = "NU_TRACKING")
    private BigDecimal nuTracking;

    @Column(name = "NU_CHARTELS")
    private BigDecimal nuChartels;

    @Column(name = "NU_DEED")
    private BigDecimal nuDeed;

    @Column(name = "NU_OFFER")
    private BigDecimal nuOffer;

    @Column(name = "NU_GUARANTEE")
    private BigDecimal nuGuarantee;

    @Column(name = "NU_LDISCHARGE")
    private BigDecimal nuLdischarge;

    @Column(name = "NU_OTHERS")
    private BigDecimal nuOthers;

    @Column(name = "NU_CHARTELD")
    private BigDecimal nuCharteld;

    @Column(name = "NU_LOAN_PROCESS")
    private BigDecimal nuLoanProcess;

    @Column(name = "VC_CURRENCY")
    private String vcCurrency;

    @Column(name = "NU_CURRENCY_CODE")
    private Integer nuCurrencyCode;

    @Column(name = "NU_CONV_FACTOR")
    private BigDecimal nuConvFactor;

    @Column(name = "CH_TYPE")
    private String chType;

}
