package com.reporting.mocks.persistence.inmemory;

import com.reporting.mocks.model.id.TradePopulationId;
import com.reporting.mocks.persistence.inmemory.model.TradePopulationMetaDataReactive;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradePopulationMetaDataReactiveRepository extends JpaRepository<TradePopulationMetaDataReactive, TradePopulationId> {
    TradePopulationMetaDataReactive getTradePopulationMetaDataReactiveByTradePopulationId(TradePopulationId id);
}
