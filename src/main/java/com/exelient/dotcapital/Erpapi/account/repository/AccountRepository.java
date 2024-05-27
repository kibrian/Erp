package com.exelient.dotcapital.Erpapi.account.repository;

import com.exelient.dotcapital.Erpapi.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query(value = "SELECT * FROM finance.mst_account WHERE vc_field3 = ?", nativeQuery = true)
//    @Query(value = "SELECT * FROM mst_account WHERE vc_field3 = ?", nativeQuery = true)
    Optional<Account> existsByVcCustomerId(String field3);

    @Query(value = "SELECT MAX(a.accountCode) FROM Account a")
    Integer getNextAccountCode();

}
