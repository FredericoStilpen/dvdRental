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
	@JoinColumn(name = "film_id", referencedColumnName = "film_id")
	private Film film;
	
	@OneToOne(mappedBy = "inventory")
	private Rental rental;

	@OneToOne
	@JoinColumn(name = "store_id", referencedColumnName = "store_id")
	private Store store;
	
	@Column(name= "last_update")
	private Calendar last_update;


	public Integer getInventory_id() {
		return this.inventory_id;
	}

	public void setInventory_id(Integer inventory_id) {
		this.inventory_id = inventory_id;
	}

	public Film getFilm() {
		return this.film;
	}

	public void setFilm(Film film) {
		this.film = film;
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

	public Calendar getLast_update() {
		return this.last_update;
	}

	public void setLast_update(Calendar last_update) {
		this.last_update = last_update;
	}

}
