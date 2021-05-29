package com.residencia.dvdrental.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id")
	private Integer city_id;
		
	@Column(name = "city")
	private String city;
	
	@OneToOne 
	@JoinColumn (name = "country_id", referencedColumnName = "country_id")
	private Country country;

	@OneToMany(mappedBy = "city")
    private List<Address> address;
	
	@Column(name = "last_update")
	private Calendar last_update;


	public Integer getCity_id() {
		return this.city_id;
	}

	public void setCity_id(Integer city_id) {
		this.city_id = city_id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<Address> getAddress() {
		return this.address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Calendar getLast_update() {
		return this.last_update;
	}

	public void setLast_update(Calendar last_update) {
		this.last_update = last_update;
	}

}
