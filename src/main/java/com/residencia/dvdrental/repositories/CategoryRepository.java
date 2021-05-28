package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
