package com.csc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pincode")
public class Pincode implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer pin_id;
    private City city;
    private Integer pin;

    public Pincode() {
    }

    public Pincode(City city, Integer pin) {
        this.city = city;
        this.pin = pin;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "pin_id", unique = true, nullable = false)
    public Integer getPin_id() {
        return this.pin_id;
    }

    public void setPin_id(Integer pin_id) {
        this.pin_id = pin_id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cityId", nullable = false)
    public City getCity() {
        return this.city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Column(name = "pin", nullable = false, length = 250)
    public Integer getPin() {
        return this.pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

}