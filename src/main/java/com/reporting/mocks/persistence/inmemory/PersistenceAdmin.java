package com.reporting.mocks.persistence.inmemory;

import com.reporting.mocks.interfaces.persistence.IPersistenceAdmin;
import org.springframework.stereotype.Component;

@Component
public class PersistenceAdmin implements IPersistenceAdmin {

    @Override
    public void clearDataSets() {

    }

    @Override
    public void initDataSets() {

    }
    
}