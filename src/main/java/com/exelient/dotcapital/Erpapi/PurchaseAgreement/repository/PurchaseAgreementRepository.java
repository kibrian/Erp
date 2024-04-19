package com.exelient.dotcapital.Erpapi.PurchaseAgreement.repository;

import com.exelient.dotcapital.Erpapi.PurchaseAgreement.domain.PurchaseAgreement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseAgreementRepository  extends JpaRepository<PurchaseAgreement, Long> {
}
