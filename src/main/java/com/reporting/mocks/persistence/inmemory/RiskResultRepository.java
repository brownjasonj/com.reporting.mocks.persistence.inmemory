package com.reporting.mocks.persistence.inmemory;

import com.reporting.mocks.model.RiskResult;
import com.reporting.mocks.model.id.RiskRunId;
import com.reporting.mocks.model.risks.Risk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RiskResultRepository extends JpaRepository<RiskResult<? extends Risk>,RiskRunId> {
    List<RiskResult<? extends Risk>> getAllByRiskRunId(RiskRunId riskRunId);
}
