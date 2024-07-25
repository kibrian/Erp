package com.exelient.dotcapital.Erpapi.Customer.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
//@Table(name = "MST_CUSTOMER", schema = "MAKESS")
@Table(name = "MST_CUSTOMER")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @Column(name = "NU_CUSTOMER_CODE")
    private Integer nuCustomerCode;

    @Column(name = "VC_COMP_CODE")
    private String vcCompCode;

    @Column(name = "VC_CUSTOMER_NAME")
    private String vcCustomerName;

    @Column(name = "VC_BILL_ADDRESS1")
    private String vcBillAddress1;

    @Column(name = "VC_BILL_ADDRESS2")
    private String vcBillAddress2;

    @Column(name = "VC_BILL_ADDRESS3")
    private String vcBillAddress3;

    @Column(name = "VC_BILL_CITY")
    private String vcBillCity;

    @Column(name = "VC_BILL_STATE")
    private String vcBillState;

    @Column(name = "VC_BILL_COUNTRY")
    private String vcBillCountry;

    @Column(name = "VC_BILL_PIN_CODE")
    private String vcBillPinCode;

    @Column(name = "VC_TELEPHONE")
    private String vcTelephone;

    @Column(name = "VC_EMAIL")
    private String vcEmail;

    @Column(name = "VC_FAX_NO")
    private String vcFaxNo;

    @Column(name = "VC_BANK_NAME")
    private String vcBankName;

    @Column(name = "VC_BANK_BRANCH_NAME")
    private String vcBankBranchName;

    @Column(name = "VC_BANK_ADDRESS1")
    private String vcBankAddress1;

    @Column(name = "VC_BANK_ADDRESS2")
    private String vcBankAddress2;

    @Column(name = "VC_BANK_ADDRESS3")
    private String vcBankAddress3;

    @Column(name = "VC_BANK_CITY")
    private String vcBankCity;

    @Column(name = "VC_BANK_STATE")
    private String vcBankState;

    @Column(name = "VC_BANK_COUNTRY")
    private String vcBankCountry;

    @Column(name = "VC_BANK_PIN_CODE")
    private String vcBankPinCode;

    @Column(name = "VC_CONTACT_PERSON")
    private String vcContactPerson;

    @Column(name = "VC_CONTACT_PERSON_PHONE")
    private String vcContactPersonPhone;

    @Column(name = "VC_SHIP_ADDRESS1")
    private String vcShipAddress1;

    @Column(name = "VC_SHIP_ADDRESS2")
    private String vcShipAddress2;

    @Column(name = "VC_SHIP_ADDRESS3")
    private String vcShipAddress3;

    @Column(name = "VC_SHIP_CITY")
    private String vcShipCity;

    @Column(name = "VC_SHIP_STATE")
    private String vcShipState;

    @Column(name = "VC_SHIP_COUNTRY")
    private String vcShipCountry;

    @Column(name = "VC_SHIP_PIN_CODE")
    private String vcShipPinCode;

    @Column(name = "VC_LINCENSE_NO")
    private String vcLicenseNo;

    @Column(name = "VC_CST_NO")
    private String vcCstNo;

    @Column(name = "VC_LST_NO")
    private String vcLstNo;

    @Column(name = "NU_MAX_CREDIT_DAY")
    private Integer nuMaxCreditDay;

    @Column(name = "VC_CATEGORY_CODE")
    private String vcCategoryCode;

    @Column(name = "VC_DIVISION_NO")
    private String vcDivisionNo;

    @Column(name = "VC_RANGE")
    private String vcRange;

    @Column(name = "VC_COLLECTORATE")
    private String vcCollectorate;

    @Column(name = "VC_RC_NO")
    private String vcRcNo;

    @Column(name = "VC_PITAX_GIR_NO")
    private String vcPitaxGirNo;

    @Column(name = "NU_ACCOUNT_CODE")
    private Integer nuAccountCode;

    @Column(name = "NU_CURRENCY_CODE", nullable = false)
    private Integer nuCurrencyCode;

    @Column(name = "VC_VENDOR_CODE")
    private String vcVendorCode;

    @Column(name = "VC_ECC_NO")
    private String vcEccNo;

//    @Column(name = "VC_LICENSE_NO")
//    private String vcLicenseNo;

    @Column(name = "DT_CST_DATE")
    private LocalDate dtCstDate;

    @Column(name = "DT_LST_DATE")
    private LocalDate dtLstDate;

    @Column(name = "NU_CREDIT_LIMIT", precision = 13, scale = 2)
    private BigDecimal nuCreditLimit;

    @Column(name = "CH_STAT_FLAG")
    private String chStatFlag;

    @Column(name = "CH_STAT_UP_FLAG")
    private String chStatUpFlag;

    @Column(name = "DT_MOD_DATE")
    private LocalDate dtModDate;

    @Column(name = "VC_DEFAULT_COMP")
    private String vcDefaultComp;

    @Column(name = "VC_AUTH_CODE")
    private String vcAuthCode;

    @Column(name = "VC_FIELD1")
    private String vcField1;

    @Column(name = "VC_FIELD2")
    private String vcField2;

    @Column(name = "VC_FIELD3")
    private String vcField3;

    @Column(name = "VC_FIELD4")
    private String vcField4;

    @Column(name = "NU_FIELD1", precision = 20, scale = 3)
    private BigDecimal nuField1;

    @Column(name = "NU_FIELD2", precision = 20, scale = 3)
    private BigDecimal nuField2;

    @Column(name = "DT_FIELD1")
    private LocalDate dtField1;

    @Column(name = "DT_FIELD2")
    private LocalDate dtField2;

    @Column(name = "VC_BANK_ACC")
    private String vcBankAcc;

    @Column(name = "VC_MOBILE")
    private String vcMobile;

    @Column(name = "VC_PIN_NO")
    private String vcPinNo;

    @Column(name = "VC_VAT_NO")
    private String vcVatNo;

    @Column(name = "CH_CASH")
    private String chCash;

    @Column(name = "CH_EXEMPTED")
    private String chExempted;

    @Column(name = "NU_CHEQUE_LIMIT", precision = 13, scale = 2)
    private BigDecimal nuChequeLimit;

    @Column(name = "VC_CORRES_ADD1")
    private String vcCorresAdd1;

    @Column(name = "VC_CORR_ADD2")
    private String vcCorrAdd2;

    @Column(name = "VC_CORR_ADD3")
    private String vcCorrAdd3;

    @Column(name = "VC_CORR_ADD4")
    private String vcCorrAdd4;

    @Column(name = "VC_CORR_ADD5")
    private String vcCorrAdd5;

    @Column(name = "VC_CORR_ADD6")
    private String vcCorrAdd6;

    @Column(name = "VC_SEGMENT_CODE")
    private String vcSegmentCode;

    @Column(name = "VC_BANK_CODE")
    private String vcBankCode;

    @Column(name = "VC_BRANCH_CODE")
    private String vcBranchCode;

    @Column(name = "VC_BUSS_TYPE")
    private String vcBussType;

    @Column(name = "VC_DISC_CATG1")
    private String vcDiscCatg1;

    @Column(name = "VC_DISC_CATG2")
    private String vcDiscCatg2;

    @Column(name = "VC_SALES_EXEC")
    private String vcSalesExec;

    @Column(name = "CH_STOP_LIMIT")
    private String chStopLimit;

    @Column(name = "CH_STOP_DAYS")
    private String chStopDays;

    @Column(name = "VC_DISC_CATG3")
    private String vcDiscCatg3;

    @Column(name = "VC_DISC_CATG4")
    private String vcDiscCatg4;

    @Column(name = "VC_CUSTOMER_ID")
    private String vcCustomerId;

    @Column(name = "DT_REG_DATE")
    private LocalDate dtRegDate;

    @Column(name = "ID_NO")
    private String idNo;

    @Column(name = "VC_FINANCE_PERSON")
    private String vcFinancePerson;

    @Column(name = "VC_ID_NO")
    private String vcIdNo;

    @Column(name = "VC_BILL_AREA")
    private String vcBillArea;

    @Column(name = "CUSTOMER_TYPE3")
    private String customerType3;

    @Column(name = "CUSTOMER_TYPE2")
    private String customerType2;

    @Column(name = "CUSTOMER_TYPE1")
    private String customerType1;

    @Column(name = "VC_INCORP_CERT")
    private String vcIncorpCert;

    @Lob
    @Column(name = "LG_CUSTOMER_IMAGE")
    private byte[] lgCustomerImage;

    // Standard getters and setters
}
