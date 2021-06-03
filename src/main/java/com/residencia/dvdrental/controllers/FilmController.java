package com.residencia.dvdrental.controllers;

import java.util.List;

import com.residencia.dvdrental.entities.Film;
import com.residencia.dvdrental.services.FilmService;

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

public class FilmController {
    
    @Autowired
    private FilmService filmService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Film> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(filmService.findById(id), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Film>> findAll() 
					throws Exception {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(filmService.findAll(), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping("/count")
	public Long count() {
		return filmService.count();
	}

	@PostMapping
	public ResponseEntity<Film> save(@RequestBody Film film){
		//return Filmervice.save(film);
		HttpHeaders headers = new HttpHeaders();
		Film newFilm = filmService.save(film);
		if(null != newFilm)
			return new ResponseEntity<>(newFilm, headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(newFilm, headers, HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
    public Film update(@RequestBody Film film, @PathVariable Integer id){
       return filmService.update(film,id);
    }

	@DeleteMapping
	public void deleteById(@RequestParam Integer id){
		filmService.deleteById(id);
	}
}
