package com.residencia.dvdrental.services;

import java.util.List;

import com.residencia.dvdrental.entities.FilmCategory;
import com.residencia.dvdrental.entities.FilmCategoryId;
import com.residencia.dvdrental.repositories.FilmCategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class FilmCategoryService {
    
    @Autowired
    public FilmCategoryRepository filmCategoryRepository;

    public FilmCategory findById(FilmCategoryId id){
        return filmCategoryRepository.findById(id).get();
    }

    public List<FilmCategory> findAll(){ //Integer pages, Integer qtdRegistros
        return filmCategoryRepository.findAll();
    }

    public Long count() {
        return filmCategoryRepository.count();
    }

    public FilmCategory save(FilmCategory filmCategory) {
        FilmCategory novoFilmCategory = filmCategoryRepository.save(filmCategory);
            return novoFilmCategory;
    }

    public FilmCategory update(FilmCategory filmCategory, FilmCategoryId id){
        filmCategory.setId(id);
        return filmCategoryRepository.save(filmCategory);
    }

    public void deleteById(FilmCategoryId id) {  
        filmCategoryRepository.deleteById(id); 
    }
}
