package com.csc.repo;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.csc.entity.City;
import com.csc.entity.CityEntity;

@Repository("cityRepository")
public interface CityRepo extends CrudRepository<City, Integer> {

    @Query("select new com.csc.entity.CityEntity(id, city_name) from City where state.id = :id")
    public List<CityEntity> findByState(@Param("id") int id);

}