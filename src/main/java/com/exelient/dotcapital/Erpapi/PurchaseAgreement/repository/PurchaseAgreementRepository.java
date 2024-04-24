package com.exelient.dotcapital.Erpapi.PurchaseAgreement.repository;

import com.exelient.dotcapital.Erpapi.Customer.domain.Customer;
import com.exelient.dotcapital.Erpapi.PurchaseAgreement.domain.PurchaseAgreement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PurchaseAgreementRepository  extends JpaRepository<PurchaseAgreement, Long> {

    @Query(value = "SELECT * FROM hd_purchase_agreement WHERE vc_agreement_no = ?", nativeQuery = true)
    Optional<PurchaseAgreement> findByVcAgreementNo(String vcAgreementNo);
}
