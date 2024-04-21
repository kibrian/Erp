package com.exelient.dotcapital.Erpapi.Customer.repository;

import com.exelient.dotcapital.Erpapi.Customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    @Query(value = "SELECT MAX(c.nuCustomerCode) FROM Customer c")
    Integer getNextCustomerCode();

    boolean existsByVcCustomerId(String vcCustomerId);

    Customer findByVcCustomerId(String vcCustomerId);


}
