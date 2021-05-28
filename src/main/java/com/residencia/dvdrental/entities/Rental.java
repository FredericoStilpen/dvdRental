
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
@Table (name = "rental")
public class Rental {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer rental_id;
    
    @Column (name = "rental_date")
    private Calendar rental_date;

    @OneToMany(mappedBy = "rental")
    private List<Payment> payment;
    
    @OneToOne // Aceita que dói menos.
	@JoinColumn (name = "inventory_id", referencedColumnName = "inventory_id")
	private Inventory inventory;

    @OneToOne // Aceita que dói menos.
	@JoinColumn (name = "customer_id", referencedColumnName = "customer_id")
	private Customer customer;
    
    @Column (name = "return_date")
    private Calendar return_date;
    
    @OneToOne // Aceita que dói menos.
	@JoinColumn (name = "staff_id", referencedColumnName = "staff_id")
	private Staff staff;

    @Column (name = "last_update")
    private Calendar last_update;

}
