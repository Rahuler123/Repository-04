package com.csc.entity;
import java.io.Serializable;

public class StateEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer state_id;
    private String state_name;

    public StateEntity() {
    }

    public StateEntity(Integer state_id, String state_name) {
        this.state_id = state_id;
        this.state_name = state_name;
    }

    public Integer getState_id() {
        return state_id;
    }

    public void setId(Integer state_id) {
        this.state_id = state_id;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

}