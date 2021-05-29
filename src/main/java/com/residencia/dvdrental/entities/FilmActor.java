package com.residencia.dvdrental.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="film_actor")
public class FilmActor {
    
    @EmbeddedId
    private FilmActorId id;

    @ManyToOne
    @MapsId("film_id")
    @JoinColumn(name = "film_id")
    private Film film;

    @ManyToOne
    @MapsId("actor_id")
    @JoinColumn(name = "actor_id")
    private Actor actor;

    @Column(name="last_update")
    private Calendar last_update;


    public FilmActor(FilmActorId id, Film film, Actor actor, Calendar last_update) {
        this.id = new FilmActorId (film.getFilm_id(),actor.getActor_id());
        this.film = film;
        this.actor = actor;
        this.last_update = last_update;
    }
    

    public FilmActorId getId() {
        return this.id;
    }

    public void setId(FilmActorId id) {
        this.id = id;
    }

    public Film getFilm() {
        return this.film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Actor getActor() {
        return this.actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Calendar getLast_update() {
        return this.last_update;
    }

    public void setLast_update(Calendar last_update) {
        this.last_update = last_update;
    }

}
