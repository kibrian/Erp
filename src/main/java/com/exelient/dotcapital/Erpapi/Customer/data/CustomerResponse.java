package com.exelient.dotcapital.Erpapi.Customer.data;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private String vcCompCode;
    private int nuCustomerCode;
    private String vcCustomerName;
    private String vcBillAddress1;
    private String vcBillAddress2;
    private String vcBillAddress3;
    private String vcBillCity;
    private String vcBillState;
    private String vcBillCountry;
    private String vcBillPinCode;
    private String vcTelephone;
    private String vcEmail;
    private String vcFaxNo;
    private String vcBankName;
    private String vcBankBranchName;
    private String vcBankAddress1;
    private String vcBankAddress2;
    private String vcBankAddress3;
    private String vcBankCity;
    private String vcBankState;
    private String vcBankCountry;
    private String vcBankPinCode;
    private String vcContactPerson;
    private String vcContactPersonPhone;
    private String vcShipAddress1;
    private String vcShipAddress2;
    private String vcShipAddress3;
    private String vcShipCity;
    private String vcShipState;
    private String vcShipCountry;
    private String vcShipPinCode;
    private String vcLincenseNo;
    private String vcCstNo;
    private String vcLstNo;
    private int nuMaxCreditDay;
    private String vcCategoryCode;
    private String vcDivisionNo;
    private String vcRange;
    private String vcCollectorate;
    private String vcRcNo;
    private String vcPitaxGirNo;
    private int nuAccountCode;
    private int nuCurrencyCode;
    private String vcVendorCode;
    private String vcEccNo;
    private String vcLicenseNo;
    private LocalDate dtCstDate;
    private LocalDate dtLstDate;
    private BigDecimal nuCreditLimit;
    private String chStatFlag;
    private String chStatUpFlag;
    private LocalDate dtModDate;
    private String vcDefaultComp;
    private String vcAuthCode;
    private String vcField1;
    private String vcField2;
    private String vcField3;
    private String vcField4;
    private BigDecimal nuField1;
    private BigDecimal nuField2;
    private LocalDate dtField1;
    private LocalDate dtField2;
    private String vcBankAcc;
    private String vcMobile;
    private String vcPinNo;
    private String vcVatNo;
    private String chCash;
    private String chExempted;
    private BigDecimal nuChequeLimit;
    private String vcCorresAdd1;
    private String vcCorrAdd2;
    private String vcCorrAdd3;
    private String vcCorrAdd4;
    private String vcCorrAdd5;
    private String vcCorrAdd6;
    private String vcSegmentCode;
    private String vcBankCode;
    private String vcBranchCode;
    private String vcBussType;
    private String vcDiscCatg1;
    private String vcDiscCatg2;
    private String vcSalesExec;
    private String chStopLimit;
    private String chStopDays;
    private String vcDiscCatg3;
    private String vcDiscCatg4;
    private String vcCustomerId;
    private LocalDate dtRegDate;
    private String idNo;
    private String vcFinancePerson;
    private String vcIdNo;
    private String vcBillArea;
    private String customerType3;
    private String customerType2;
    private String customerType1;
    private String vcIncorpCert;

    public CustomerResponse(String s) {
    }
}
