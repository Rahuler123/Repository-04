package com.csc.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.entity.Country;
import com.csc.repo.CountryRepo;



@Service("countryService")
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepo countryRepository;

    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country find(int id) {
        return countryRepository.findById(id).get();
    }

}