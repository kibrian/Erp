package com.exelient.dotcapital.Erpapi.PurchaseAgreement.service;

import com.exelient.dotcapital.Erpapi.Customer.exception.CustomerNotFoundException;
import com.exelient.dotcapital.Erpapi.PurchaseAgreement.data.PurchaseAgreementData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PurchaseAgreementService {

    Page<PurchaseAgreementData> getAllPurchaseAgreements(Pageable pageable);

    PurchaseAgreementData createPurchaseAgreement(PurchaseAgreementData request) throws CustomerNotFoundException;

}
