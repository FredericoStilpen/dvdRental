package com.residencia.dvdrental.services;

import java.util.List;

import com.residencia.dvdrental.entities.Film;
import com.residencia.dvdrental.repositories.FilmRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class FilmService {
    
    @Autowired
    public FilmRepository filmRepository;

    public Film findById(Integer id){
        return filmRepository.findById(id).get();
    }

    public List<Film> findAll(){ //Integer pages, Integer qtdRegistros
        return filmRepository.findAll();
    }

    public Long count() {
        return filmRepository.count();
    }

    public Film save(Film film) {
        Film newFilm = filmRepository.save(film);
            return newFilm;
    }

    public Film update(Film film, Integer id){
        film.setFilm_id(id);
        return filmRepository.save(film);
    }

    public void deleteById(Integer id) {  
        filmRepository.deleteById(id); 
    }
}
