package com.reporting.mocks.persistence.inmemory;

import com.reporting.mocks.model.id.TradePopulationId;
import com.reporting.mocks.model.trade.TradeType;
import com.reporting.mocks.persistence.inmemory.model.TradePopulationEntry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface TradePopulationEntryReactiveRepository extends ReactiveMongoRepository<TradePopulationEntry, TradePopulationId> {
    Flux<TradePopulationEntry> findByTradePopulationId(TradePopulationId id);
    Flux<TradePopulationEntry> findByTradePopulationIdAndTradeType(TradePopulationId tradePopulationId, TradeType tradeType);
}
