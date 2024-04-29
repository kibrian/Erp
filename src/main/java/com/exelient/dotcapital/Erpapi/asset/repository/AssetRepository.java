package com.exelient.dotcapital.Erpapi.asset.repository;

import com.exelient.dotcapital.Erpapi.asset.domain.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {
}
