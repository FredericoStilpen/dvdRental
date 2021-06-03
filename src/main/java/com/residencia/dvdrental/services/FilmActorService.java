package com.residencia.dvdrental.services;

import java.util.List;

import com.residencia.dvdrental.entities.FilmActor;
import com.residencia.dvdrental.entities.FilmActorId;
import com.residencia.dvdrental.repositories.FilmActorRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class FilmActorService {
    
    @Autowired
    public FilmActorRepository filmActorRepository;

    public FilmActor findById(FilmActorId id){
        return filmActorRepository.findById(id).get();
    }

    public List<FilmActor> findAll(){ //Integer pages, Integer qtdRegistros
        return filmActorRepository.findAll();
    }

    public Long count() {
        return filmActorRepository.count();
    }

    public FilmActor save(FilmActor filmActor) {
        FilmActor newFilmActor = filmActorRepository.save(filmActor);
            return newFilmActor;
    }

    public FilmActor update(FilmActor filmActor, FilmActorId id){
        filmActor.setId(id);
        return filmActorRepository.save(filmActor);
    }

    public void deleteById(FilmActorId id) {  
        filmActorRepository.deleteById(id); 
    }
}
