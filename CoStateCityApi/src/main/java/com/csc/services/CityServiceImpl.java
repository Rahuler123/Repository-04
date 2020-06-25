package com.csc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.entity.CityEntity;
import com.csc.repo.CityRepo;



@Service("cityService")
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepo cityRepository;

    @Override
    public List<CityEntity> findByState(int id) {
        return cityRepository.findByState(id);
    }

}