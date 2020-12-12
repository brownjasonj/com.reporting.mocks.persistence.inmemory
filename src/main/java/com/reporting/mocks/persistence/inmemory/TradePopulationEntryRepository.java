package com.reporting.mocks.persistence.inmemory;

import com.reporting.mocks.model.id.TradePopulationId;
import com.reporting.mocks.persistence.inmemory.model.TradePopulationEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TradePopulationEntryRepository extends JpaRepository<TradePopulationEntry, TradePopulationId> {
    List<TradePopulationEntry> findByTradePopulationId(TradePopulationId id);
}
