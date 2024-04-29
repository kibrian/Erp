package com.exelient.dotcapital.Erpapi.account.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MST_ACCOUNT")
//, schema = "finance"
public class Account {
    @Id
    @Column(name = "NU_ACCOUNT_CODE")
    private Integer accountCode;

    @Column(name = "VC_COMP_CODE")
    private String compCode;

    @Column(name = "VC_ACCOUNT_NAME")
    private String accountName;

    @Column(name = "VC_ACC_GROUP_CODE")
    private String accGroupCode;

    @Column(name = "CH_RESERVED")
    private String reserved;

    @Column(name = "NU_TAX_LIMIT")
    private BigDecimal taxLimit;

    @Column(name = "VC_TAX_CODE")
    private String taxCode;

    @Column(name = "VC_DEFAULT_COMP")
    private String defaultComp;

    @Column(name = "CH_STAT_FLAG")
    private String statFlag;

    @Column(name = "CH_STAT_UP_FLAG")
    private String statUpFlag;

    @Column(name = "DT_MOD_DATE")
    private LocalDate modDate;

    @Column(name = "VC_AUTH_CODE")
    private String authCode;

    @Column(name = "VC_FIELD1")
    private String field1;

    @Column(name = "VC_FIELD2")
    private String field2;

    @Column(name = "VC_FIELD3")
    private String field3;

    @Column(name = "VC_FIELD4")
    private String field4;

    @Column(name = "DT_FIELD1")
    private LocalDate field1Date;

    @Column(name = "DT_FIELD2")
    private LocalDate field2Date;

    @Column(name = "NU_FIELD1")
    private BigDecimal field1Num;

    @Column(name = "NU_FIELD2")
    private BigDecimal field2Num;

    @Column(name = "CH_HOLD")
    private String hold;

    @Column(name = "NU_CURRENCY_CODE")
    private int currencyCode;

    @Column(name = "VC_CC_FLAG")
    private String ccFlag;

}
