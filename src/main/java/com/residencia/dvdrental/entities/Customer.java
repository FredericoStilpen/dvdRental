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

	@OneToOne (mappedBy = "customer")
	private Integer rental_id;

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

}
