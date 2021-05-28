
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
@Table (name = "payment")
public class Payment {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "payment_id")
    private Integer payment_id;
    
    @OneToOne // Aceita que dói menos.
	@JoinColumn (name = "customer_id", referencedColumnName = "customer_id")
	private Customer customer;
    
    @OneToOne // Aceita que dói menos.
	@JoinColumn (name = "staff_id", referencedColumnName = "staff_id")
	private Staff staff;
    
    @OneToOne // Aceita que dói menos.
	@JoinColumn (name = "rental_id", referencedColumnName = "rental_id")
	private Staff rental;
    
    @Column (name = "amount")
    private Double amount;
    
    @Column (name = "payment_date")
    private Calendar payment_date;

}
