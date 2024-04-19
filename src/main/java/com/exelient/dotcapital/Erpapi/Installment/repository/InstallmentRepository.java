package com.exelient.dotcapital.Erpapi.Installment.repository;

import com.exelient.dotcapital.Erpapi.Installment.domain.Installment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstallmentRepository extends JpaRepository<Installment,Long> {
}
