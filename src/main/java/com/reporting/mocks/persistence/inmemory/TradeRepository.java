package com.reporting.mocks.persistence.inmemory;

import com.reporting.mocks.model.trade.Tcn;
import com.reporting.mocks.model.trade.Trade;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TradeRepository extends MongoRepository<Trade, Tcn> {
    Trade getTradeByTcn(Tcn tcn);
}
