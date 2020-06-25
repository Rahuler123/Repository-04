package com.csc.entity;

import java.io.Serializable;

public class CityEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer city_id;
    private String city_name;

    public CityEntity() {
    }

    
    
    public CityEntity(Integer city_id, String city_name) {
		this.city_id = city_id;
		this.city_name = city_name;
		
	}

	public Integer getCity_id() {
        return city_id;
    }

    public void setId(Integer city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
   
    

}