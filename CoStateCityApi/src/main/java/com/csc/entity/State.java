package com.csc.entity;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "state")
public class State implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer state_id;
    private Country country;
    private String state_name;
    private Set<City> cities = new HashSet<City>(0);

    public State() {
    }

    public State(Country country, String state_name) {
        this.country = country;
        this.state_name = state_name;
    }

    public State(Country country, String state_name, Set<City> cities) {
        this.country = country;
        this.state_name = state_name;
        this.cities = cities;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "state_id", unique = true, nullable = false)
    public Integer getState_id() {
        return this.state_id;
    }

    public void setState_id(Integer state_id) {
        this.state_id = state_id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "countryId", nullable = false)
    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Column(name = "state_name", nullable = false, length = 250)
    public String getState_name() {
        return this.state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "state")
    public Set<City> getCities() {
        return this.cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }
}