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
@Table(name = "film_category")
public class FilmCategory {
    
    @EmbeddedId
    private FilmCategoryId id;

    @ManyToOne
    @MapsId("film_id")
    @JoinColumn(name="film_id")
    private Film film;

    @ManyToOne
    @MapsId("category_id")
    @JoinColumn(name="category_id")
    private Category category;

    @Column(name="last_update")
    private Calendar last_update;

    public FilmCategory(FilmCategoryId id, Film film, Category category, Calendar last_update) {
        this.id = new FilmCategoryId(film.getFilm_id(), category.getCategory_id());
        this.film = film;
        this.category = category;
        this.last_update = last_update;
    }

    public FilmCategoryId getId() {
        return this.id;
    }

    public void setId(FilmCategoryId id) {
        this.id = id;
    }

    public Film getFilm() {
        return this.film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Calendar getLast_update() {
        return this.last_update;
    }

    public void setLast_update(Calendar last_update) {
        this.last_update = last_update;
    }

}
