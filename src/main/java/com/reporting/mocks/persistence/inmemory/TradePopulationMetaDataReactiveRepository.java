package com.reporting.mocks.persistence.inmemory;

import com.reporting.mocks.model.id.TradePopulationId;
import com.reporting.mocks.persistence.inmemory.model.TradePopulationMetaDataReactive;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TradePopulationMetaDataReactiveRepository extends MongoRepository<TradePopulationMetaDataReactive, TradePopulationId> {
    TradePopulationMetaDataReactive getTradePopulationMetaDataReactiveByTradePopulationId(TradePopulationId id);
}
