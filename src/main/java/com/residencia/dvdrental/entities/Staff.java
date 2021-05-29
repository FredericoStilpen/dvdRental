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
@Table(name = "staff")
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "staff_id") // chave
	private Integer staff_id;

	@OneToMany(mappedBy = "staff")
    private List<Payment> payment;

	@OneToMany(mappedBy = "staff")
    private List<Rental> rental;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name= "last_name")
	private String last_name;
	
	@OneToOne // Aceita que dói menos.
	@JoinColumn (name = "address_id", referencedColumnName = "address_id")
	private Address address;
	
	@Column(name = "email")
	private String email;
	
	@OneToOne // Aceita que dói menos.
	@JoinColumn (name = "store_id", referencedColumnName = "store_id")
	private Store store;
	
	@Column(name = "active")
	private boolean active;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "last_update")
	private Calendar last_update; 
	
	@Column(name="picture")
	private byte[] picture;


	public Integer getStaff_id() {
		return this.staff_id;
	}

	public void setStaff_id(Integer staff_id) {
		this.staff_id = staff_id;
	}

	public List<Payment> getPayment() {
		return this.payment;
	}

	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}

	public List<Rental> getRental() {
		return this.rental;
	}

	public void setRental(List<Rental> rental) {
		this.rental = rental;
	}

	public String getFirst_name() {
		return this.first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return this.last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public boolean isActive() {
		return this.active;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Calendar getLast_update() {
		return this.last_update;
	}

	public void setLast_update(Calendar last_update) {
		this.last_update = last_update;
	}

	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	
}