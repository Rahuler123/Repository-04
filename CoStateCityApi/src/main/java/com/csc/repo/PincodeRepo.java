package com.csc.repo;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.csc.entity.City;
import com.csc.entity.CityEntity;
import com.csc.entity.Pincode;
import com.csc.entity.PincodeEntity;

@Repository("pincodeRepository")
public interface PincodeRepo extends CrudRepository<Pincode, Integer> {

    @Query("select new com.csc.entity.PincodeEntity(id, pin) from Pincode where city.id = :id")
    public List<PincodeEntity> findByCityy(@Param("id") int id);

}
