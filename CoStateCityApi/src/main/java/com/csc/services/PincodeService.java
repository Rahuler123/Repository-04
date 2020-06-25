package com.csc.services;
import java.util.List;

import com.csc.entity.CityEntity;
import com.csc.entity.PincodeEntity;



public interface PincodeService {

    public List<PincodeEntity> findByCityy(int id);

}