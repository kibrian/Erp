package com.exelient.dotcapital.Erpapi.Installment.service;


import com.exelient.dotcapital.Erpapi.Installment.data.InstallmentData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface InstallmentService {
    Page<InstallmentData> getAllInstallments(Pageable pageable);

    InstallmentData createInstallment(InstallmentData request);

}
