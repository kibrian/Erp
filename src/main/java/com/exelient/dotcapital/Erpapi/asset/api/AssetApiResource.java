package com.exelient.dotcapital.Erpapi.asset.api;

import com.exelient.dotcapital.Erpapi.Customer.data.CustomerResponse;
import com.exelient.dotcapital.Erpapi.Customer.exception.CustomerAlreadyExistException;
import com.exelient.dotcapital.Erpapi.asset.data.AssetRequestData;
import com.exelient.dotcapital.Erpapi.asset.service.AssetService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1/asset")
public class AssetApiResource {
    private final AssetService assetService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<?> getAllAssets(Pageable pageable){
        return new ResponseEntity<>( assetService.getAllAssets(pageable), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> CreateAsset(@RequestBody AssetRequestData request) {
        System.out.println(request);
        return new ResponseEntity<>( assetService.createAsset(request), HttpStatus.OK);
    }
}
