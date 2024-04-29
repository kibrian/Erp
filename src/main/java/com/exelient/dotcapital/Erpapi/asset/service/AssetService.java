package com.exelient.dotcapital.Erpapi.asset.service;

import com.exelient.dotcapital.Erpapi.Customer.exception.CustomerAlreadyExistException;
import com.exelient.dotcapital.Erpapi.asset.data.AssetRequestData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AssetService {

    Page<AssetRequestData> getAllAssets(Pageable pageable);

    AssetRequestData createAsset(AssetRequestData request);

}
