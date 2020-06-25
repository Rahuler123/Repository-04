package com.csc.services;
import java.util.List;

import com.csc.entity.CityEntity;



public interface CityService {

    public List<CityEntity> findByState(int id);

}