package com.exelient.dotcapital.Erpapi.asset.service;

import com.exelient.dotcapital.Erpapi.PurchaseAgreement.domain.PurchaseAgreement;
import com.exelient.dotcapital.Erpapi.PurchaseAgreement.exception.PurchaseAgreementNotFoundException;
import com.exelient.dotcapital.Erpapi.PurchaseAgreement.repository.PurchaseAgreementRepository;
import com.exelient.dotcapital.Erpapi.asset.data.AssetRequestData;
import com.exelient.dotcapital.Erpapi.asset.domain.Asset;
import com.exelient.dotcapital.Erpapi.asset.repository.AssetRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class AssetServiceImpl implements AssetService{

    private final AssetRepository assetRepository;
    private final PurchaseAgreementRepository purchaseAgreementRepository;

    @Override
    public Page<AssetRequestData> getAllAssets(Pageable pageable) {
        Page<Asset> assets = assetRepository.findAll(pageable);
        return assets.map(this::mapEntityToAssetRequestData);
    }

    @Override
    public AssetRequestData createAsset(AssetRequestData request){
        Asset asset = mapAssetRequestDataToEntity(request);
        Asset savedAsset = assetRepository.saveAndFlush(asset);
        return mapEntityToAssetRequestData(savedAsset);
    }

    private Asset mapAssetRequestDataToEntity(AssetRequestData data) {
        Optional<PurchaseAgreement> existingAgreement = purchaseAgreementRepository.findByVcAgreementNo(data.getAgreementNo());
        if (existingAgreement.isEmpty()) {
            throw new PurchaseAgreementNotFoundException();
        }
        Asset entity = new Asset();
        entity.setCompCode("01");
        entity.setSerialNo(1);
        entity.setAgreementNo(data.getAgreementNo());
        entity.setAgreementDate(data.getAgreementDate());
        entity.setAssetCode("LOAN");
        entity.setAssetDesc("LOAN");
        entity.setVcSerialNo("LOAN");
        entity.setQuantity(data.getQuantity());
        entity.setPrice(BigDecimal.valueOf(1));
        entity.setVatType(data.getVatType());
        entity.setAssetValue(data.getAssetValue());
        entity.setTotalAssetValue(data.getTotalAssetValue());
        entity.setModificationDate(data.getModificationDate());
        entity.setDefaultComp("01");
        entity.setAuthCode("01");
        entity.setTaxCode(data.getTaxCode());
        entity.setVatAmount(data.getVatAmount());
        entity.setVatValue(BigDecimal.valueOf(0));
        entity.setGroupCode("1");
        entity.setItemValue(BigDecimal.valueOf(0));
        entity.setTotalVat(data.getTotalVat());
        return entity;
    }

    private AssetRequestData mapEntityToAssetRequestData(Asset entity) {
        Optional<PurchaseAgreement> agreement = purchaseAgreementRepository.findByVcAgreementNo(entity.getAgreementNo());
        if (agreement.isEmpty()){
            throw new PurchaseAgreementNotFoundException();
        }
        AssetRequestData data = new AssetRequestData();
        data.setCompCode(entity.getCompCode());
        data.setSerialNo(entity.getSerialNo());
        data.setAgreementNo(agreement.get().getVcAgreementNo());
        data.setAgreementDate(entity.getAgreementDate());
        data.setAssetCode(entity.getAssetCode());
        data.setAssetDesc(entity.getAssetDesc());
        data.setVcSerialNo(entity.getVcSerialNo());
        data.setQuantity(entity.getQuantity());
        data.setPrice(entity.getPrice());
        data.setVatType(entity.getVatType());
        data.setAssetValue(entity.getAssetValue());
        data.setTotalAssetValue(entity.getTotalAssetValue());
        data.setModificationDate(entity.getModificationDate());
        data.setDefaultComp(entity.getDefaultComp());
        data.setAuthCode(entity.getAuthCode());
        data.setTaxCode(entity.getTaxCode());
        data.setVatAmount(entity.getVatAmount());
        data.setVatValue(entity.getVatValue());
        data.setGroupCode(entity.getGroupCode());
        data.setItemValue(entity.getItemValue());
        data.setTotalVat(entity.getTotalVat());

        return data;
    }
}
