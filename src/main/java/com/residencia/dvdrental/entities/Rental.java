
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


    public Integer getRental_id() {
        return this.rental_id;
    }

    public void setRental_id(Integer rental_id) {
        this.rental_id = rental_id;
    }

    public Calendar getRental_date() {
        return this.rental_date;
    }

    public void setRental_date(Calendar rental_date) {
        this.rental_date = rental_date;
    }

    public List<Payment> getPayment() {
        return this.payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Calendar getReturn_date() {
        return this.return_date;
    }

    public void setReturn_date(Calendar return_date) {
        this.return_date = return_date;
    }

    public Staff getStaff() {
        return this.staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Calendar getLast_update() {
        return this.last_update;
    }

    public void setLast_update(Calendar last_update) {
        this.last_update = last_update;
    }

}
