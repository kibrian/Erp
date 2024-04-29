package com.exelient.dotcapital.Erpapi.account.service;

import com.exelient.dotcapital.Erpapi.Customer.exception.CustomerNotFoundException;
import com.exelient.dotcapital.Erpapi.account.data.AccountRequestData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccountService {

    Page<AccountRequestData> getAllAccounts(Pageable pageable);

    AccountRequestData createAccount(AccountRequestData request);

}
