package com.residencia.dvdrental.controllers;

import java.util.List;

import com.residencia.dvdrental.entities.FilmActor;
import com.residencia.dvdrental.entities.FilmActorId;
import com.residencia.dvdrental.services.FilmActorService;

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

public class FilmActorController {
    
    @Autowired
    private FilmActorService filmActorService;
	
	@GetMapping("/{id}")
	public ResponseEntity<FilmActor> findById(@PathVariable FilmActorId id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(filmActorService.findById(id), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<FilmActor>> findAll() 
					throws Exception {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(filmActorService.findAll(), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping("/count")
	public Long count() {
		return filmActorService.count();
	}

	@PostMapping
	public ResponseEntity<FilmActor> save(@RequestBody FilmActor filmActor){
		HttpHeaders headers = new HttpHeaders();
		FilmActor newFilmActor = filmActorService.save(filmActor);
		if(null != newFilmActor)
			return new ResponseEntity<>(newFilmActor, headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(newFilmActor, headers, HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
    public FilmActor update(@RequestBody FilmActor filmActor, @PathVariable FilmActorId id){
       return filmActorService.update(filmActor,id);
    }

	@DeleteMapping
	public void delete(@RequestParam FilmActorId id){
		filmActorService.deleteById(id);
	}
}
