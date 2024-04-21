package com.exelient.dotcapital.Erpapi.PurchaseAgreement.api;

import com.exelient.dotcapital.Erpapi.Customer.exception.CustomerNotFoundException;
import com.exelient.dotcapital.Erpapi.PurchaseAgreement.data.PurchaseAgreementData;
import com.exelient.dotcapital.Erpapi.PurchaseAgreement.service.PurchaseAgreementService;
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
@RequestMapping(value = "/api/v1/purchase-agreement")
public class PurchaseAgreementApiResource {

    //Logger logger = Logger.getLogger(PurchaseAgreementApiResource.class.getName());

    private PurchaseAgreementService purchaseAgreementService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<?> getAllPurchaseAgreements(Pageable pageable){
        return new ResponseEntity<>( purchaseAgreementService.getAllPurchaseAgreements(pageable), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> CreatePurchaseAgreement(@RequestBody PurchaseAgreementData request) throws CustomerNotFoundException {
        //logger.info(request.toString());
        System.out.println(request);
        return new ResponseEntity<>( purchaseAgreementService.createPurchaseAgreement(request), HttpStatus.OK);
    }
}
