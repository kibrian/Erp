package com.exelient.dotcapital.Erpapi.Customer.repository;

import com.exelient.dotcapital.Erpapi.Customer.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    @Query(value = "SELECT * FROM mst_customer", nativeQuery = true)
    Page<Customer> findAllCustomers(Pageable pageable);

    @Query(value = "SELECT MAX(c.nuCustomerCode) FROM Customer c")
    Integer getNextCustomerCode();

    @Query(value = "SELECT * FROM mst_customer WHERE vc_customer_id = ?", nativeQuery = true)
    Optional<Customer> existsByVcCustomerId(String vcCustomerId);

    @Query(value = "SELECT * FROM mst_customer WHERE vc_customer_id = ?", nativeQuery = true)
    Customer findByVcCustomerId(String vcCustomerId);


}
