package com.reporting.mocks.persistence.inmemory;

import com.reporting.mocks.model.id.TradePopulationId;
import com.reporting.mocks.model.trade.TradeType;
import com.reporting.mocks.persistence.inmemory.model.TradePopulationEntry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TradePopulationEntryReactiveRepository extends MongoRepository<TradePopulationEntry, TradePopulationId> {
    List<TradePopulationEntry> findByTradePopulationId(TradePopulationId id);
    List<TradePopulationEntry> findByTradePopulationIdAndTradeType(TradePopulationId tradePopulationId, TradeType tradeType);
}
