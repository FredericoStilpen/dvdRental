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
	private Calendar  last_update;


	public Integer getAddress_id() {
		return this.address_id;
	}

	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public List<Customer> getCustomer() {
		return this.customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	public List<Store> getStore() {
		return this.store;
	}

	public void setStore(List<Store> store) {
		this.store = store;
	}

	public List<Staff> getStaff() {
		return this.staff;
	}

	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}

	public String getPostal_code() {
		return this.postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Calendar getLast_update() {
		return this.last_update;
	}

	public void setLast_update(Calendar last_update) {
		this.last_update = last_update;
	}

}