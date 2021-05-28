package com.residencia.dvdrental.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.residencia.dvdrental.entities.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

	public List<Inventory> findAll();

}
