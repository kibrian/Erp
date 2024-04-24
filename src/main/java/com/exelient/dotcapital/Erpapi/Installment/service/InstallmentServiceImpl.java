package com.exelient.dotcapital.Erpapi.Installment.service;

import com.exelient.dotcapital.Erpapi.Installment.data.InstallmentData;
import com.exelient.dotcapital.Erpapi.Installment.domain.Installment;
import com.exelient.dotcapital.Erpapi.Installment.repository.InstallmentRepository;
import com.exelient.dotcapital.Erpapi.PurchaseAgreement.domain.PurchaseAgreement;
import com.exelient.dotcapital.Erpapi.PurchaseAgreement.repository.PurchaseAgreementRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@AllArgsConstructor
@Service
public class InstallmentServiceImpl implements InstallmentService {

    private final InstallmentRepository installmentRepository;
    private final PurchaseAgreementRepository agreementRepo;

    @Override
    public Page<InstallmentData> getAllInstallments(Pageable pageable) {
        Page<Installment> installments = installmentRepository.findAll(pageable);
        return installments.map(this::mapEntityToInstallmentData);
    }

    @Override
    public InstallmentData createInstallment(InstallmentData request) {
        Installment installment = mapInstallmentDataToEntity(request);
        Installment savedInstallment = installmentRepository.save(installment);
        return mapEntityToInstallmentData(savedInstallment);
    }

    // Utility methods for mapping InstallmentData to Installment entity and vice versa
    private Installment mapInstallmentDataToEntity(InstallmentData data) {
        Optional<PurchaseAgreement> existingAgreement = agreementRepo.findByVcAgreementNo(data.getVcAgreementNo());
        if (existingAgreement.isPresent()) {}
        Installment entity = new Installment();
        entity.setVcCompCode("01");
        entity.setVcAgreementNo(existingAgreement.get());
        entity.setDtAgreementDate(data.getDtAgreementDate());
        entity.setNuSerialNo(data.getNuSerialNo());
        entity.setDtInstallmentDate(data.getDtInstallmentDate());
        entity.setNuPrincipalInstAmount(data.getNuPrincipalInstAmount());
        entity.setNuInterestInstAmount(data.getNuInterestInstAmount());
        entity.setNuTotPrincipal(data.getNuTotPrincipal());
        entity.setNuTotInterest(data.getNuTotInterest());
        entity.setVcReceiptVoucherNo(data.getVcReceiptVoucherNo());
        entity.setDtVoucherDate(data.getDtVoucherDate());
        entity.setVcChequeNo(data.getVcChequeNo());
        entity.setDtChequeDate(data.getDtChequeDate());
        entity.setNuChequeAmount(data.getNuChequeAmount());
        entity.setNuAmtAllocated(data.getNuAmtAllocated());
        entity.setNuTotAmtAllocated(data.getNuTotAmtAllocated());
        entity.setDtModDate(data.getDtModDate());
        entity.setVcDefaultComp("01");
        entity.setVcAuthCode("01");
        entity.setNuTotChequeAmount(data.getNuTotChequeAmount());
        entity.setNuInstallmentAmt(data.getNuInstallmentAmt());
        entity.setVcReceiptVoucherNo2(data.getVcReceiptVoucherNo2());
        entity.setVcChequeNo2(data.getVcChequeNo2());
        entity.setNuChequeAmount2(data.getNuChequeAmount2());
        entity.setDtChequeDate2(data.getDtChequeDate2());
        entity.setDtVoucherDate2(data.getDtVoucherDate2());
        entity.setVcReceiptVoucherNo3(data.getVcReceiptVoucherNo3());
        entity.setVcChequeNo3(data.getVcChequeNo3());
        entity.setNuChequeAmount3(data.getNuChequeAmount3());
        entity.setDtChequeDate3(data.getDtChequeDate3());
        entity.setDtVoucherDate3(data.getDtVoucherDate3());
        entity.setChInvoice("N");
        entity.setNuPenalty(data.getNuPenalty());
        entity.setNuPenaltyOther(data.getNuPenaltyOther());
        return entity;
    }

    private InstallmentData mapEntityToInstallmentData(Installment entity) {
        InstallmentData data = new InstallmentData();
        data.setVcCompCode(entity.getVcCompCode());
        data.setVcAgreementNo(entity.getVcAgreementNo().getVcAgreementNo());
        data.setDtAgreementDate(entity.getDtAgreementDate());
        data.setNuSerialNo(entity.getNuSerialNo());
        data.setDtInstallmentDate(entity.getDtInstallmentDate());
        data.setNuPrincipalInstAmount(entity.getNuPrincipalInstAmount());
        data.setNuInterestInstAmount(entity.getNuInterestInstAmount());
        data.setNuTotPrincipal(entity.getNuTotPrincipal());
        data.setNuTotInterest(entity.getNuTotInterest());
        data.setVcReceiptVoucherNo(entity.getVcReceiptVoucherNo());
        data.setDtVoucherDate(entity.getDtVoucherDate());
        data.setVcChequeNo(entity.getVcChequeNo());
        data.setDtChequeDate(entity.getDtChequeDate());
        data.setNuChequeAmount(entity.getNuChequeAmount());
        data.setNuAmtAllocated(entity.getNuAmtAllocated());
        data.setNuTotAmtAllocated(entity.getNuTotAmtAllocated());
        data.setDtModDate(entity.getDtModDate());
        data.setVcDefaultComp(entity.getVcDefaultComp());
        data.setVcAuthCode(entity.getVcAuthCode());
        data.setNuTotChequeAmount(entity.getNuTotChequeAmount());
        data.setNuInstallmentAmt(entity.getNuInstallmentAmt());
        data.setVcReceiptVoucherNo2(entity.getVcReceiptVoucherNo2());
        data.setVcChequeNo2(entity.getVcChequeNo2());
        data.setNuChequeAmount2(entity.getNuChequeAmount2());
        data.setDtChequeDate2(entity.getDtChequeDate2());
        data.setDtVoucherDate2(entity.getDtVoucherDate2());
        data.setVcReceiptVoucherNo3(entity.getVcReceiptVoucherNo3());
        data.setVcChequeNo3(entity.getVcChequeNo3());
        data.setNuChequeAmount3(entity.getNuChequeAmount3());
        data.setDtChequeDate3(entity.getDtChequeDate3());
        data.setDtVoucherDate3(entity.getDtVoucherDate3());
        data.setChInvoice(entity.getChInvoice());
        data.setNuPenalty(entity.getNuPenalty());
        data.setNuPenaltyOther(entity.getNuPenaltyOther());
        return data;
    }
}
