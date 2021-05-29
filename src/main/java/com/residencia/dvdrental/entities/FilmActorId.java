package com.residencia.dvdrental.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FilmActorId implements Serializable {
    

    
    @Column(name="film_id")
    private Integer film_id;

    @Column(name="actor_id")
    private Integer actor_id;


    public FilmActorId(Integer film_id, Integer actor_id) {
        this.film_id = film_id;
        this.actor_id = actor_id;
    }

    public Integer getFilm_id() {
        return this.film_id;
    }

    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    public Integer getActor_id() {
        return this.actor_id;
    }

    public void setActor_id(Integer actor_id) {
        this.actor_id = actor_id;
    }

}
