package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.Film;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {
    
}
