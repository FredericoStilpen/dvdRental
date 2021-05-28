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
@Table(name = "address")
public class Address {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private Integer address_id;
		
	@Column(name = "address")
	private String address;
	
	@Column(name = "address2")
	private String address2;
	
	@Column(name = "district")
	private String district;
	
	@OneToOne 
	@JoinColumn (name = "city_id", referencedColumnName = "city_id")
	private City city;
	
	@OneToMany(mappedBy = "address")
    private List<Customer> customer;

	@OneToMany(mappedBy = "address")
    private List<Store> store;

	@OneToMany(mappedBy = "address")
    private List<Staff> staff;

	@Column(name = "postal_code")
	private String postal_code;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "last_update")
	private Timestamp  last_update;

}