package com.residencia.dvdrental.entities;

import java.sql.Timestamp;
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
	private Timestamp last_update;


}
