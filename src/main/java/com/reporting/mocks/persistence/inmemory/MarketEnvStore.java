package com.reporting.mocks.persistence.inmemory;

import com.reporting.mocks.interfaces.persistence.IMarketStore;
import com.reporting.mocks.model.DataMarkerType;
import com.reporting.mocks.model.MarketEnv;
import com.reporting.mocks.model.PricingGroup;
import com.reporting.mocks.model.id.MarketEnvId;

import java.util.Collection;
import java.util.UUID;

public class MarketEnvStore implements IMarketStore {
    protected PricingGroup pricingGroup;
    protected MarketEnvRepository marketEnvRepository;

    public MarketEnvStore(PricingGroup pricingGroup, MarketEnvRepository marketEnvRepository) {
        this.pricingGroup = pricingGroup;
        this.marketEnvRepository = marketEnvRepository;
    }

    @Override
    public MarketEnv create(DataMarkerType type) {
        MarketEnv marketEnv = new MarketEnv(this.pricingGroup, type);
        MarketEnv storedEnv = this.marketEnvRepository.save(marketEnv);
        return storedEnv;
    }

    @Override
    public MarketEnv create(DataMarkerType type, int dayAdvance) {
        MarketEnv marketEnv = new MarketEnv(this.pricingGroup, type, dayAdvance);
        MarketEnv storedEnv = this.marketEnvRepository.save(marketEnv);
        return storedEnv;
    }

    @Override
    public MarketEnv get(UUID id) {
        return this.marketEnvRepository.getMarketEnvByMarketEnvId(new MarketEnvId(this.pricingGroup.getName(), id));
    }

    @Override
    public UUID getStoreId() {
        return null;
    }

    @Override
    public PricingGroup getPricingGroup() {
        return this.pricingGroup;
    }

    @Override
    public Collection<MarketEnv> getAll() {
        return this.marketEnvRepository.getMarketEnvsByPricingGroup(this.pricingGroup);
    }
}
