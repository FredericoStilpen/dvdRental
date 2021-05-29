package com.residencia.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.residencia.dvdrental.entities.FilmCategory;
import com.residencia.dvdrental.entities.FilmCategoryId;

public interface FilmCategoryRepository extends JpaRepository<FilmCategory, FilmCategoryId> {
    
}
