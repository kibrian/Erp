package com.exelient.dotcapital.Erpapi.Customer.service;

import com.exelient.dotcapital.Erpapi.Customer.data.CustomerResponse;
import com.exelient.dotcapital.Erpapi.Customer.exception.CustomerAlreadyExistException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CustomerPlatformService {
    Page<CustomerResponse> getAllCustomers(Pageable pageable);

    CustomerResponse createCustomer(CustomerResponse request) throws CustomerAlreadyExistException;
}
