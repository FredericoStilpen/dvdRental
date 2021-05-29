package com.residencia.dvdrental.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.residencia.dvdrental.entities.FilmActor;
import com.residencia.dvdrental.entities.FilmActorId;

public interface FilmActorRepository extends JpaRepository<FilmActor, FilmActorId> {
    
}
