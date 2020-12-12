package com.reporting.mocks.persistence.inmemory;

import com.reporting.mocks.model.id.TradePopulationId;
import com.reporting.mocks.persistence.inmemory.model.TradePopulationMetaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TradePopulationMetaDataRepository extends JpaRepository<TradePopulationMetaData,TradePopulationId> {
    TradePopulationMetaData getTradePopulationMetaDataByTradePopulationId(TradePopulationId id);
}
