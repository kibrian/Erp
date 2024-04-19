package com.exelient.dotcapital.Erpapi.Installment.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstallmentData {
    private String vcCompCode;
    private String vcAgreementNo;
    private LocalDate dtAgreementDate;
    private Integer nuSerialNo;
    private LocalDate dtInstallmentDate;
    private BigDecimal nuPrincipalInstAmount;
    private BigDecimal nuInterestInstAmount;
    private BigDecimal nuTotPrincipal;
    private BigDecimal nuTotInterest;
    private String vcReceiptVoucherNo;
    private LocalDate dtVoucherDate;
    private String vcChequeNo;
    private LocalDate dtChequeDate;
    private BigDecimal nuChequeAmount;
    private BigDecimal nuAmtAllocated;
    private BigDecimal nuTotAmtAllocated;
    private LocalDate dtModDate;
    private String vcDefaultComp;
    private String vcAuthCode;
    private BigDecimal nuTotChequeAmount;
    private BigDecimal nuInstallmentAmt;
    private String vcReceiptVoucherNo2;
    private String vcChequeNo2;
    private BigDecimal nuChequeAmount2;
    private LocalDate dtChequeDate2;
    private LocalDate dtVoucherDate2;
    private String vcReceiptVoucherNo3;
    private String vcChequeNo3;
    private BigDecimal nuChequeAmount3;
    private LocalDate dtChequeDate3;
    private LocalDate dtVoucherDate3;
    private String chInvoice;
    private BigDecimal nuPenalty;
    private BigDecimal nuPenaltyOther;

}
