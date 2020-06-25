package com.csc.entity;

import java.io.Serializable;

public class PincodeEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer pin;

    public PincodeEntity() {
    }

    
    
    public PincodeEntity(Integer id, Integer pin) {
		this.id = id;
		this.pin = pin;
		
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }
   
    

}