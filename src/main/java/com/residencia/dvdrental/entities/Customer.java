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
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Aceita que dói menos.
	@Column(name = "customer_id")
	private Integer customer_id;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "email")
	private String email;

	@OneToOne
	@JoinColumn (name = "address_id", referencedColumnName = "address_id")
	private Address address;
	
	@OneToMany(mappedBy = "customer")
    private List<Payment> payment;

	@OneToOne(mappedBy = "customer")
	private Rental rental;

	@OneToOne
	@JoinColumn (name = "store_id", referencedColumnName = "store_id")
	private Store store;

	@Column(name = "activbool")
	private boolean activeBool;

	@Column(name = "create_date")
	private Calendar create_date;

	@Column(name = "last_update")
	private Calendar last_update;

	@Column(name = "active")
	private String active;


	public Integer getCustomer_id() {
		return this.customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getLast_name() {
		return this.last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Payment> getPayment() {
		return this.payment;
	}

	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}

	public Rental getRental() {
		return this.rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public boolean isActiveBool() {
		return this.activeBool;
	}

	public boolean getActiveBool() {
		return this.activeBool;
	}

	public void setActiveBool(boolean activeBool) {
		this.activeBool = activeBool;
	}

	public Calendar getCreate_date() {
		return this.create_date;
	}

	public void setCreate_date(Calendar create_date) {
		this.create_date = create_date;
	}

	public Calendar getLast_update() {
		return this.last_update;
	}

	public void setLast_update(Calendar last_update) {
		this.last_update = last_update;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

}
