package com.exelient.dotcapital.Erpapi.account.api;

import com.exelient.dotcapital.Erpapi.account.data.AccountRequestData;
import com.exelient.dotcapital.Erpapi.account.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.logging.Logger;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1/account")
@EnableScheduling
public class AccountApiResource {

    private final AccountService accountService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<?> getAllAccounts(Pageable pageable){
        return new ResponseEntity<>( accountService.getAllAccounts(pageable), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> CreateAccount(@RequestBody AccountRequestData request){
        System.out.println(request);
        return new ResponseEntity<>( accountService.createAccount(request), HttpStatus.OK);
    }

    @Scheduled(fixedDelay = 1000000)
    public void printTime(){
        System.out.println("Current Time: " + new Date());
    }
}
