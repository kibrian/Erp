package com.exelient.dotcapital.Erpapi.Installment.api;

import com.exelient.dotcapital.Erpapi.Customer.data.CustomerResponse;
import com.exelient.dotcapital.Erpapi.Customer.exception.CustomerAlreadyExistException;
import com.exelient.dotcapital.Erpapi.Customer.service.CustomerPlatformService;
import com.exelient.dotcapital.Erpapi.Installment.data.InstallmentData;
import com.exelient.dotcapital.Erpapi.Installment.service.InstallmentService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1/installment")
public class InstallmentApiResource {

    //Logger logger = Logger.getLogger(InstallmentApiResource.class.getName());
    private InstallmentService installmentService;


    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<?> getAllInstallments(Pageable pageable){
        return new ResponseEntity<>( installmentService.getAllInstallments(pageable), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> CreateInstallment(@RequestBody InstallmentData request) {
       //logger.info(request.toString());
        System.out.println(request);
        return new ResponseEntity<>( installmentService.createInstallment(request), HttpStatus.OK);
    }
}
