package com.residencia.dvdrental.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "store")
public class Store {

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

}
