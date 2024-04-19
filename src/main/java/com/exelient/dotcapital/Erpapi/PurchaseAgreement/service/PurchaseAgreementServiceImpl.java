package com.exelient.dotcapital.Erpapi.PurchaseAgreement.service;

import com.exelient.dotcapital.Erpapi.PurchaseAgreement.data.PurchaseAgreementData;
import com.exelient.dotcapital.Erpapi.PurchaseAgreement.domain.PurchaseAgreement;
import com.exelient.dotcapital.Erpapi.PurchaseAgreement.repository.PurchaseAgreementRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class PurchaseAgreementServiceImpl implements PurchaseAgreementService {
    private final PurchaseAgreementRepository repository;
    @Override
    public Page<PurchaseAgreementData> getAllPurchaseAgreements(Pageable pageable) {
        Page<PurchaseAgreement> purchaseAgreementsPage = repository.findAll(pageable);
        return purchaseAgreementsPage.map(this::mapToPurchaseAgreementData);
    }

    private PurchaseAgreementData mapToPurchaseAgreementData(PurchaseAgreement purchaseAgreement) {
        PurchaseAgreementData data = new PurchaseAgreementData();
        data.setVcCompCode(purchaseAgreement.getVcCompCode());
        data.setVcAgreementNo(purchaseAgreement.getVcAgreementNo());
        data.setDtAgreementDate(purchaseAgreement.getDtAgreementDate());
        data.setVcPaymentMode(purchaseAgreement.getVcPaymentMode());
        data.setVcCustomerId(purchaseAgreement.getVcCustomerId());
        data.setVcRemarks(purchaseAgreement.getVcRemarks());
        data.setNuValue(purchaseAgreement.getNuValue());
        data.setNuTenure(purchaseAgreement.getNuTenure());
        data.setVcInsuranceDetails(purchaseAgreement.getVcInsuranceDetails());
        data.setVcSalesAccount(purchaseAgreement.getVcSalesAccount());
        data.setNuDownpayment(purchaseAgreement.getNuDownpayment());
        data.setNuTotInst(purchaseAgreement.getNuTotInst());
        data.setVcTrackingDevice(purchaseAgreement.getVcTrackingDevice());
        data.setVcInterestType(purchaseAgreement.getVcInteresType());
        data.setNuIntRate(purchaseAgreement.getNuIntRate());
        data.setDtModDate(purchaseAgreement.getDtModDate());
        data.setVcDefaultComp(purchaseAgreement.getVcDefaultComp());
        data.setVcAuthCode(purchaseAgreement.getVcAuthCode());
        data.setChAuth(purchaseAgreement.getChAuth());
        data.setNuInterest(purchaseAgreement.getNuInterest());
        data.setNuCustomerCode(purchaseAgreement.getNuCustomerCode());
        data.setChCreateCode(purchaseAgreement.getChCreateCode());
        data.setChInterestType(purchaseAgreement.getChInterestType());
        data.setVcCode(purchaseAgreement.getVcCode());
        data.setVcSalesmanCode(purchaseAgreement.getVcSalesmanCode());
        data.setNuSalesAccountCode(purchaseAgreement.getNuSalesAccountCode());
        data.setNuIntAccCode(purchaseAgreement.getNuIntAccCode());
        data.setNuTotAmount(purchaseAgreement.getNuTotAmount());
        data.setChCancelApplication(purchaseAgreement.getChCancelApplication());
        data.setDtCommencementDate(purchaseAgreement.getDtCommencementDate());
        data.setVcFacilityNo(purchaseAgreement.getVcFacilityNo());
        data.setVcType(purchaseAgreement.getVcType());
        data.setVcLoanType(purchaseAgreement.getVcLoanType());
        data.setNuInsurance(purchaseAgreement.getNuInsurance());
        data.setNuProcess(purchaseAgreement.getNuProcess());
        data.setNuTracking(purchaseAgreement.getNuTracking());
        data.setNuChartels(purchaseAgreement.getNuChartels());
        data.setNuDeed(purchaseAgreement.getNuDeed());
        data.setNuOffer(purchaseAgreement.getNuOffer());
        data.setNuGuarantee(purchaseAgreement.getNuGuarantee());
        data.setNuLdischarge(purchaseAgreement.getNuLdischarge());
        data.setNuOthers(purchaseAgreement.getNuOthers());
        data.setNuCharteld(purchaseAgreement.getNuCharteld());
        data.setNuLoanProcess(purchaseAgreement.getNuLoanProcess());
        data.setVcCurrency(purchaseAgreement.getVcCurrency());
        data.setNuCurrencyCode(purchaseAgreement.getNuCurrencyCode());
        data.setNuConvFactor(purchaseAgreement.getNuConvFactor());
        return data;
    }

    @Override
    public PurchaseAgreementData createPurchaseAgreement(PurchaseAgreementData request) {
        PurchaseAgreement purchaseAgreement = new PurchaseAgreement();
        purchaseAgreement.setVcCompCode("01");
        purchaseAgreement.setVcAgreementNo(request.getVcAgreementNo());
        purchaseAgreement.setDtAgreementDate(request.getDtAgreementDate());
        purchaseAgreement.setVcPaymentMode("BANK");
        purchaseAgreement.setVcCustomerId(request.getVcCustomerId());
        purchaseAgreement.setVcRemarks(request.getVcRemarks());
        purchaseAgreement.setNuValue(request.getNuValue());
        purchaseAgreement.setNuTenure(1);
        purchaseAgreement.setVcInsuranceDetails(request.getVcInsuranceDetails());
        purchaseAgreement.setVcSalesAccount(request.getVcSalesAccount());
        purchaseAgreement.setNuDownpayment(BigDecimal.valueOf(0));
        purchaseAgreement.setNuTotInst(1);
        purchaseAgreement.setVcTrackingDevice(request.getVcTrackingDevice());
        purchaseAgreement.setVcInteresType(request.getVcInterestType());
        purchaseAgreement.setNuIntRate(request.getNuIntRate());
        purchaseAgreement.setDtModDate(request.getDtModDate());
        purchaseAgreement.setVcDefaultComp("01");
        purchaseAgreement.setVcAuthCode("01");
        purchaseAgreement.setChAuth("Y");
        purchaseAgreement.setNuInterest(request.getNuInterest());
        purchaseAgreement.setNuCustomerCode(request.getNuCustomerCode());
        purchaseAgreement.setChCreateCode("01");
        purchaseAgreement.setChInterestType("S");
        purchaseAgreement.setVcCode("81");
        purchaseAgreement.setVcSalesmanCode(request.getVcSalesmanCode());
        purchaseAgreement.setNuSalesAccountCode(request.getNuSalesAccountCode());
        purchaseAgreement.setNuIntAccCode(request.getNuIntAccCode());
        purchaseAgreement.setNuTotAmount(request.getNuTotAmount());
        purchaseAgreement.setChCancelApplication(request.getChCancelApplication());
        purchaseAgreement.setDtCommencementDate(request.getDtCommencementDate());
        purchaseAgreement.setVcFacilityNo(request.getVcFacilityNo());
        purchaseAgreement.setVcType(request.getVcType());
        purchaseAgreement.setVcLoanType(request.getVcLoanType());
        purchaseAgreement.setNuInsurance(request.getNuInsurance());
        purchaseAgreement.setNuProcess(request.getNuProcess());
        purchaseAgreement.setNuTracking(request.getNuTracking());
        purchaseAgreement.setNuChartels(request.getNuChartels());
        purchaseAgreement.setNuDeed(request.getNuDeed());
        purchaseAgreement.setNuOffer(request.getNuOffer());
        purchaseAgreement.setNuGuarantee(request.getNuGuarantee());
        purchaseAgreement.setNuLdischarge(request.getNuLdischarge());
        purchaseAgreement.setNuOthers(request.getNuOthers());
        purchaseAgreement.setNuCharteld(request.getNuCharteld());
        purchaseAgreement.setNuLoanProcess(request.getNuLoanProcess());
        purchaseAgreement.setVcCurrency(request.getVcCurrency());
        purchaseAgreement.setNuCurrencyCode(request.getNuCurrencyCode());
        purchaseAgreement.setNuConvFactor(request.getNuConvFactor());

        // Save the purchase agreement to the database
        PurchaseAgreement savedPurchaseAgreement = repository.saveAndFlush(purchaseAgreement);

        // Map the saved purchase agreement back to PurchaseAgreementData and return
        return mapToPurchaseAgreementData(savedPurchaseAgreement);
    }
}
