package com.residencia.dvdrental.entities;

import java.io.Serializable;

import javax.persistence.Column;
// esse ta doendo mesmo aceitando
import javax.persistence.Embeddable;

@Embeddable
public class FilmCategoryId implements Serializable{
    @Column(name="film_id")
    private Integer film_id;

    @Column(name = "category_id")
    private Integer category_id;
    
    public FilmCategoryId(Integer film_id, Integer category_id) {
        this.film_id = film_id;
        this.category_id = category_id;
    }

    public Integer getFilm_id() {
        return this.film_id;
    }

    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    public Integer getCategory_id() {
        return this.category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

}
