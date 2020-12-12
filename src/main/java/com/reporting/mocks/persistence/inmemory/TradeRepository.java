package com.reporting.mocks.persistence.inmemory;

import com.reporting.mocks.model.trade.Tcn;
import com.reporting.mocks.model.trade.Trade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeRepository extends JpaRepository<Trade, Tcn> {
    Trade getTradeByTcn(Tcn tcn);
}
