package com.reporting.mocks.persistence.inmemory;

import com.reporting.mocks.model.CalculationContext;
import com.reporting.mocks.model.PricingGroup;
import com.reporting.mocks.model.id.CalculationContextId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CalculationContextRepository extends JpaRepository<CalculationContext, CalculationContextId> {
    CalculationContext findCalculationContextByCalculationContextId(CalculationContextId calculationContextId);
    List<CalculationContext> findCalculationContextByPricingGroup(PricingGroup pricingGroup);
}
