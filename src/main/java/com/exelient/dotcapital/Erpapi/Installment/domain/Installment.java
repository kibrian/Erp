package com.exelient.dotcapital.Erpapi.Installment.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "DT_INSTALLMENT", schema = "SALES")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Installment {

    @Id
    @Column(name = "VC_AGREEMENT_NO")
    private String vcAgreementNo;

    @Column(name = "VC_COMP_CODE")
    private String vcCompCode;

    @Column(name = "DT_AGREEMENT_DATE")
    private LocalDate dtAgreementDate;

    @Column(name = "NU_SERIAL_NO")
    private Integer nuSerialNo;

    @Column(name = "DT_INSTALLMENT_DATE")
    private LocalDate dtInstallmentDate;

    @Column(name = "NU_PRINCIPAL_INST_AMOUNT")
    private BigDecimal nuPrincipalInstAmount;

    @Column(name = "NU_INTEREST_INST_AMOUNT")
    private BigDecimal nuInterestInstAmount;

    @Column(name = "NU_TOT_PRINCIPAL")
    private BigDecimal nuTotPrincipal;

    @Column(name = "NU_TOT_INTEREST")
    private BigDecimal nuTotInterest;

    @Column(name = "VC_RECEIPT_VOUCHER_NO")
    private String vcReceiptVoucherNo;

    @Column(name = "DT_VOUCHER_DATE")
    private LocalDate dtVoucherDate;

    @Column(name = "VC_CHEQUE_NO")
    private String vcChequeNo;

    @Column(name = "DT_CHEQUE_DATE")
    private LocalDate dtChequeDate;

    @Column(name = "NU_CHEQUE_AMOUNT")
    private BigDecimal nuChequeAmount;

    @Column(name = "NU_AMT_ALLOCATED")
    private BigDecimal nuAmtAllocated;

    @Column(name = "NU_TOT_AMT_ALLOCATED")
    private BigDecimal nuTotAmtAllocated;

    @Column(name = "DT_MOD_DATE")
    private LocalDate dtModDate;

    @Column(name = "VC_DEFAULT_COMP")
    private String vcDefaultComp;

    @Column(name = "VC_AUTH_CODE")
    private String vcAuthCode;

    @Column(name = "NU_TOT_CHEQUE_AMOUNT")
    private BigDecimal nuTotChequeAmount;

    @Column(name = "NU_INSTALLMENT_AMT")
    private BigDecimal nuInstallmentAmt;

    @Column(name = "VC_RECEIPT_VOUCHER_NO2")
    private String vcReceiptVoucherNo2;

    @Column(name = "VC_CHEQUE_NO2")
    private String vcChequeNo2;

    @Column(name = "NU_CHEQUE_AMOUNT2")
    private BigDecimal nuChequeAmount2;

    @Column(name = "DT_CHEQUE_DATE2")
    private LocalDate dtChequeDate2;

    @Column(name = "DT_VOUCHER_DATE2")
    private LocalDate dtVoucherDate2;

    @Column(name = "VC_RECEIPT_VOUCHER_NO3")
    private String vcReceiptVoucherNo3;

    @Column(name = "VC_CHEQUE_NO3")
    private String vcChequeNo3;

    @Column(name = "NU_CHEQUE_AMOUNT3")
    private BigDecimal nuChequeAmount3;

    @Column(name = "DT_CHEQUE_DATE3")
    private LocalDate dtChequeDate3;

    @Column(name = "DT_VOUCHER_DATE3")
    private LocalDate dtVoucherDate3;

    @Column(name = "CH_INVOICE")
    private String chInvoice;

    @Column(name = "NU_PENALTY")
    private BigDecimal nuPenalty;

    @Column(name = "NU_PENALTY_OTHER")
    private BigDecimal nuPenaltyOther;

}
