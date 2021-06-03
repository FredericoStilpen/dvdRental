package com.residencia.dvdrental.controllers;

import java.util.List;

import com.residencia.dvdrental.entities.Actor;
import com.residencia.dvdrental.services.ActorService;

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

public class ActorController {

    @Autowired
    private ActorService actorService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Actor> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(actorService.findById(id), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Actor>> findAll() 
					throws Exception {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(actorService.findAll(), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping("/count")
	public Long count() {
		return actorService.count();
	}

	@PostMapping
	public ResponseEntity<Actor> save(@RequestBody Actor actor){
		//return Actorervice.save(actor);
		HttpHeaders headers = new HttpHeaders();
		Actor newActor = actorService.save(actor);
		if(null != newActor)
			return new ResponseEntity<>(newActor, headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(newActor, headers, HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
    public Actor update(@RequestBody Actor actor, @PathVariable Integer id){
       return actorService.update(actor,id);
    }

	@DeleteMapping
	public void deleteById (@RequestParam Integer id){
		actorService.deleteById(id);
	}
}
