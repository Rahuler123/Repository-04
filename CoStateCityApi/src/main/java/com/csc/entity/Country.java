package com.csc.entity;

	import java.util.HashSet;
	import java.util.Set;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import static javax.persistence.GenerationType.IDENTITY;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;

	@Entity
	@Table(name = "country")
	public class Country implements java.io.Serializable {

	    private static final long serialVersionUID = 1L;
	    private Integer country_id;
	    private String countries;
	    private Set<State> states = new HashSet<State>(0);

	    public Country() {
	    }

	    public Country(String countries) {
	        this.countries = countries;
	    }

	    public Country(String countries, Set<State> states) {
	        this.countries = countries;
	        this.states = states;
	    }

	    @Id
	    @GeneratedValue(strategy = IDENTITY)
	    @Column(name = "country_id", unique = true, nullable = false)
	    public Integer getCountry_id() {
	        return this.country_id;
	    }

	    public void setCountry_id(Integer country_id) {
	        this.country_id = country_id;
	    }

	    @Column(name = "countries", nullable = false, length = 250)
	    public String getCountries() {
	        return this.countries;
	    }

	    public void setCountries(String countries) {
	        this.countries = countries;
	    }

	    @OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
	    public Set<State> getStates() {
	        return this.states;
	    }

	    public void setStates(Set<State> states) {
	        this.states = states;
	    }

	}