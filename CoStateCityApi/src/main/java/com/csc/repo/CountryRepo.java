package com.csc.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csc.entity.Country;


@Repository("countryRepository")
public interface CountryRepo extends CrudRepository<Country, Integer> {
}