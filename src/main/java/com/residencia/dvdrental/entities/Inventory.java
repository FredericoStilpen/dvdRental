package com.residencia.dvdrental.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")

public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Aceita que dói menos.
	@Column(name = "inventory_id")
	private Integer inventory_id;
	
	@OneToOne // Aceita que dói menos.
	@JoinColumn (name = "film_id", referencedColumnName = "film_id")
	private Film film;
	
	@OneToOne (mappedBy = "inventory")
	private Integer rental_id;

	@OneToOne
	@JoinColumn (name = "store_id", referencedColumnName = "store_id")
	private Store store;
	
	@Column(name= "last_update")
	private Calendar last_update;

}
