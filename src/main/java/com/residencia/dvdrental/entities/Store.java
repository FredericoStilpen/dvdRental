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
@Table(name = "store")
public class Store {

	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "store_id") // chave
	private Integer store_id;
	
	@OneToOne
	@JoinColumn (name = "staff_id", referencedColumnName = "staff_id")
	private Staff manager_staff;

	@OneToOne(mappedBy = "store")
    private Staff staff;

	@OneToOne
	@JoinColumn (name = "address_id", referencedColumnName = "address_id")
	private Address address;
	
	@Column(name = "last_update")
	private Calendar last_update;

	public Integer getStore_id() {
		return this.store_id;
	}

	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}

	public Staff getManager_staff() {
		return this.manager_staff;
	}

	public void setManager_staff(Staff manager_staff) {
		this.manager_staff = manager_staff;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Calendar getLast_update() {
		return this.last_update;
	}

	public void setLast_update(Calendar last_update) {
		this.last_update = last_update;
	}
}
