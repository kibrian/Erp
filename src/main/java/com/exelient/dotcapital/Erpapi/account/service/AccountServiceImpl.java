package com.exelient.dotcapital.Erpapi.account.service;


import com.exelient.dotcapital.Erpapi.account.data.AccountRequestData;
import com.exelient.dotcapital.Erpapi.account.domain.Account;
import com.exelient.dotcapital.Erpapi.account.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public Page<AccountRequestData> getAllAccounts(Pageable pageable) {
        Page<Account> accountEntities = accountRepository.findAll(pageable);
        return accountEntities.map(this::mapToAccountRequestData);
    }

    @Override
    public AccountRequestData createAccount(AccountRequestData request) {
        // Check if the account already exists
        Optional<Account> existingAccountOptional = accountRepository.existsByVcCustomerId(request.getField3());
        if (existingAccountOptional.isPresent()) {
            // Account already exists, return the existing account data
            Account existingAccount = existingAccountOptional.get();
            return mapToAccountRequestData(existingAccount);
        } else {

            // Proceed with creating the new customer
            int nextAccountCode = accountRepository.getNextAccountCode() != null ? accountRepository.getNextAccountCode() + 1 : 1;
            request.setAccountCode(nextAccountCode);
            // Account does not exist, proceed with creation
            Account account = mapAccountRequestDataToEntity(request);
            Account savedAccount = accountRepository.saveAndFlush(account);
            return mapToAccountRequestData(savedAccount);
        }
    }

    private Account mapAccountRequestDataToEntity(AccountRequestData requestData) {

        Account entity = new Account();
        entity.setCompCode("01");
        entity.setAccountCode(requestData.getAccountCode());
        entity.setAccountName(requestData.getAccountName());
        entity.setAccGroupCode("1002001");
        entity.setReserved("N");
        entity.setTaxLimit(requestData.getTaxLimit());
        entity.setTaxCode(requestData.getTaxCode());
        entity.setDefaultComp("01");
        entity.setStatFlag(requestData.getStatFlag());
        entity.setStatUpFlag(requestData.getStatUpFlag());
        entity.setModDate(requestData.getModDate());
        entity.setAuthCode("01");
        entity.setField1(requestData.getField1());
        entity.setField2(requestData.getField2());
        entity.setField3(requestData.getField3());
        entity.setField4(requestData.getField4());
        entity.setField1Date(requestData.getField1Date());
        entity.setField2Date(requestData.getField2Date());
        entity.setField1Num(requestData.getField1Num());
        entity.setField2Num(requestData.getField2Num());
        entity.setHold("N");
        entity.setCurrencyCode(1);
        entity.setCcFlag("N");
        return entity;
    }


    private AccountRequestData mapToAccountRequestData(Account entity) {
        AccountRequestData requestData = new AccountRequestData();
        requestData.setCompCode(entity.getCompCode());
        requestData.setAccountCode(entity.getAccountCode());
        requestData.setAccountName(entity.getAccountName());


        // Null check for nuAccountCode
        String name = entity.getAccountName();
        if (name != null) {
            entity.setAccountName(name.strip());
        } else {
            // Handle the null case, e.g., set a default value or throw a custom exception
            entity.setAccountName(""); // Example default value
            // Optionally log the null value
            // logger.warn("nuAccountCode is null for customer ID: {}", customer.getId());
        }


        requestData.setAccGroupCode(entity.getAccGroupCode());
        requestData.setReserved(entity.getReserved());
        requestData.setTaxLimit(entity.getTaxLimit());
        requestData.setTaxCode(entity.getTaxCode());
        requestData.setDefaultComp(entity.getDefaultComp());
        requestData.setStatFlag(entity.getStatFlag());
        requestData.setStatUpFlag(entity.getStatUpFlag());
        requestData.setModDate(entity.getModDate());
        requestData.setAuthCode(entity.getAuthCode());
        requestData.setField1(entity.getField1());
        requestData.setField2(entity.getField2());
        requestData.setField3(entity.getField3());
        requestData.setField4(entity.getField4());
        requestData.setField1Date(entity.getField1Date());
        requestData.setField2Date(entity.getField2Date());
        requestData.setField1Num(entity.getField1Num());
        requestData.setField2Num(entity.getField2Num());
        requestData.setHold(entity.getHold());
        requestData.setCurrencyCode(entity.getCurrencyCode());
        requestData.setCcFlag(entity.getCcFlag());
        return requestData;
    }


}
