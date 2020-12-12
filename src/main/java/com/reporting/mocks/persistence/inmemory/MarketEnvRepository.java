package com.reporting.mocks.persistence.inmemory;

import com.reporting.mocks.model.MarketEnv;
import com.reporting.mocks.model.PricingGroup;
import com.reporting.mocks.model.id.MarketEnvId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MarketEnvRepository extends JpaRepository<MarketEnv, MarketEnvId> {
    MarketEnv getMarketEnvByMarketEnvId(MarketEnvId marketEnvId);
    List<MarketEnv> getMarketEnvsByPricingGroup(PricingGroup pricingGroup);
}
