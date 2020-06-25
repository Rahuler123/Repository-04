package com.csc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer city_id;
    private State state;
    private String city_name;
    private Set<Pincode> pincodes = new HashSet<Pincode>(0);
    

    public City() {
    }

    public City(State state, String city_name, Set<Pincode> pincodes) {
        this.state = state;
        this.city_name = city_name;
        this.pincodes = pincodes;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "city_id", unique = true, nullable = false)
    public Integer getCity_id() {
        return this.city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stateId", nullable = false)
    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Column(name = "city_name", nullable = false, length = 250)
    public String getCity_name() {
        return this.city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    public Set<Pincode> getPincodes() {
        return this.pincodes;
    }

    public void setPincodes(Set<Pincode> pincodes) {
        this.pincodes = pincodes;
    }

}