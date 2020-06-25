package com.csc.services;
import java.util.List;

import com.csc.entity.StateEntity;


public interface StateService {

    public List<StateEntity> findByCountry(int id);

}