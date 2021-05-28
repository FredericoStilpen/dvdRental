package com.residencia.dvdrental.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.residencia.dvdrental.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Integer> {
	
	public List<Customer> findAll();

}
