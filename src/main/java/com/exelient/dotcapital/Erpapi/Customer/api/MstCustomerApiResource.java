package com.exelient.dotcapital.Erpapi.Customer.api;

import com.exelient.dotcapital.Erpapi.Customer.data.CustomerResponse;
import com.exelient.dotcapital.Erpapi.Customer.exception.CustomerAlreadyExistException;
import com.exelient.dotcapital.Erpapi.Customer.service.CustomerPlatformService;
import lombok.AllArgsConstructor;
import java.util.logging.Logger;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1/customer")
public class MstCustomerApiResource {
    //Logger logger = Logger.getLogger(MstCustomerApiResource.class.getName());
    private CustomerPlatformService customerPlatformService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCustomers(Pageable pageable){
        return new ResponseEntity<>( customerPlatformService.getAllCustomers(pageable), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> CreateCustomers(@RequestBody CustomerResponse request) throws CustomerAlreadyExistException {
        System.out.println(request);
        return new ResponseEntity<>( customerPlatformService.createCustomer(request), HttpStatus.OK);
    }
}
