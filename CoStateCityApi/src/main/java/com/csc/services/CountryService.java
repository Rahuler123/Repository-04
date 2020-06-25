package com.csc.services;
import com.csc.entity.Country;

public interface CountryService {

    public Iterable<Country> findAll();

    public Country find(int id);
    
    
    

}