package com.residencia.dvdrental.entities;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer category_id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_update")
    private Calendar last_update;
    
    @OneToMany(mappedBy = "category")
    private Set<FilmCategory> filmCategory = new HashSet<>();
    

    public Integer getCategory_id() {
        return this.category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
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

    public Set<FilmCategory> getFilmCategory() {
        return this.filmCategory;
    }

    public void setFilmCategory(Set<FilmCategory> filmCategory) {
        this.filmCategory = filmCategory;
    }
    
}
