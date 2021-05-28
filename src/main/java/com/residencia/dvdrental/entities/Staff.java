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

	
}