package com.residencia.dvdrental.controllers;

import java.util.List;

import com.residencia.dvdrental.entities.FilmCategory;
import com.residencia.dvdrental.entities.FilmCategoryId;
import com.residencia.dvdrental.services.FilmCategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class FilmCategoryController {
    
    @Autowired
    private FilmCategoryService filmCategoryService;
	
	@GetMapping("/{id}")
	public ResponseEntity<FilmCategory> findById(@PathVariable FilmCategoryId id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(filmCategoryService.findById(id), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<FilmCategory>> findAll() 
					throws Exception {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(filmCategoryService.findAll(), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping("/count")
	public Long count() {
		return filmCategoryService.count();
	}

	@PostMapping
	public ResponseEntity<FilmCategory> save(@RequestBody FilmCategory filmCategory){
		HttpHeaders headers = new HttpHeaders();
		FilmCategory newFilmCategory = filmCategoryService.save(filmCategory);
		if(null != newFilmCategory)
			return new ResponseEntity<>(newFilmCategory, headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(newFilmCategory, headers, HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
    public FilmCategory update(@RequestBody FilmCategory filmCategory, @PathVariable FilmCategoryId id){
       return filmCategoryService.update(filmCategory,id);
    }

	@DeleteMapping
	public void delete(@RequestParam FilmCategoryId id){
		filmCategoryService.deleteById(id);
	}
}
