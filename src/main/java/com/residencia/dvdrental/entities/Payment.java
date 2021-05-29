
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
	private Rental rental;
    
    @Column (name = "amount")
    private Double amount;
    
    @Column (name = "payment_date")
    private Calendar payment_date;


    public Integer getPayment_id() {
        return this.payment_id;
    }

    public void setPayment_id(Integer payment_id) {
        this.payment_id = payment_id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Staff getStaff() {
        return this.staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Rental getRental() {
        return this.rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Calendar getPayment_date() {
        return this.payment_date;
    }

    public void setPayment_date(Calendar payment_date) {
        this.payment_date = payment_date;
    }

}
