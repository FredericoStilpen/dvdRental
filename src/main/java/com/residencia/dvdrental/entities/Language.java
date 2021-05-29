package com.residencia.dvdrental.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "language_id")
    private Integer language_id;

    @OneToMany(mappedBy = "language")
    private List<Film> film;

    @Column(name = "name")
    private String name;

    @Column(name = "last_update")
    private Calendar last_update;

    public Integer getLanguage_id() {
        return this.language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public List<Film> getFilm() {
        return this.film;
    }

    public void setFilm(List<Film> film) {
        this.film = film;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getLast_update() {
        return this.last_update;
    }

    public void setLast_update(Calendar last_update) {
        this.last_update = last_update;
    }
}