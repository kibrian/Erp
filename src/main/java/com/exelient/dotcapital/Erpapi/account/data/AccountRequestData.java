package com.exelient.dotcapital.Erpapi.account.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountRequestData {

    private String compCode;
    private Integer accountCode;
    private String accountName;
    private String accGroupCode;
    private String reserved;
    private BigDecimal taxLimit;
    private String taxCode;
    private String defaultComp;
    private String statFlag;
    private String statUpFlag;
    private LocalDate modDate;
    private String authCode;
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private LocalDate field1Date;
    private LocalDate field2Date;
    private BigDecimal field1Num;
    private BigDecimal field2Num;
    private String hold;
    private int currencyCode;
    private String ccFlag;

}
