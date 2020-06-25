package com.csc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.csc.entity.PincodeEntity;
import com.csc.repo.PincodeRepo;



@Service("pincodeService")
public class PincodeServiceImpl implements PincodeService {

    @Autowired
    private PincodeRepo pincodeRepostory;

    @Override
    public List<PincodeEntity> findByCityy(int id) {
        return pincodeRepostory.findByCityy(id);
    }

}