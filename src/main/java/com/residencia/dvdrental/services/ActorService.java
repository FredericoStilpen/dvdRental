package com.residencia.dvdrental.services;

import java.util.List;

import com.residencia.dvdrental.entities.Actor;
import com.residencia.dvdrental.repositories.ActorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorService {

    @Autowired
    public ActorRepository actorRepository;

    public Actor findById(Integer id){
        return actorRepository.findById(id).get();
    }

    public List<Actor> findAll(){ //Integer pages, Integer qtdRegistros
        return actorRepository.findAll();
    }

    public Long count() {
        return actorRepository.count();
    }

    public Actor save(Actor actor) {
        Actor novoActor = actorRepository.save(actor);
            return novoActor;
    }

    public Actor update(Actor actor, Integer id){
        actor.setActor_id(id);
        return actorRepository.save(actor);
    }

    public void deleteById(Integer id) {  
        actorRepository.deleteById(id); 
    }
}
