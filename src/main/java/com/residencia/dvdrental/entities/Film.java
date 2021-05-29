package com.residencia.dvdrental.entities;

import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Integer film_id;

    @OneToMany(mappedBy = "film")
    private Set<FilmCategory> filmCategory = new HashSet<>(); 

    @OneToMany(mappedBy = "film")
    private Set<FilmActor> filmActor = new HashSet<>(); 
    
    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private Integer release_year;

    @OneToOne
	@JoinColumn (name = "language_id", referencedColumnName = "language_id")
	private Language language;
    
    @Column(name = "rental_duration")
    private Integer rental_duration;

    @Column(name = "rental_rate")
    private Float rental_rate;

    @OneToMany(mappedBy = "film")
    private List<Inventory> inventory;

    @Column(name = "length")
    private Integer length;
    
    @Column(name = "replacement_cost")
    private Float replacement_cost;

    @Column(name = "rating")
    private String rating;

    @Column(name = "last_update")
    private Calendar last_update;

    @Column(name = "special_features")
    private String special_features;

    @Column(name = "fulltext")
    private String fulltext;


    public Integer getFilm_id() {
        return this.film_id;
    }

    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    public Set<FilmCategory> getFilmCategory() {
        return this.filmCategory;
    }

    public void setFilmCategory(Set<FilmCategory> filmCategory) {
        this.filmCategory = filmCategory;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRelease_year() {
        return this.release_year;
    }

    public void setRelease_year(Integer release_year) {
        this.release_year = release_year;
    }

    public Language getLanguage() {
        return this.language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Integer getRental_duration() {
        return this.rental_duration;
    }

    public void setRental_duration(Integer rental_duration) {
        this.rental_duration = rental_duration;
    }

    public Float getRental_rate() {
        return this.rental_rate;
    }

    public void setRental_rate(Float rental_rate) {
        this.rental_rate = rental_rate;
    }

    public List<Inventory> getInventory() {
        return this.inventory;
    }

    public void setInventory(List<Inventory> inventory) {
        this.inventory = inventory;
    }

    public Integer getLength() {
        return this.length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Float getReplacement_cost() {
        return this.replacement_cost;
    }

    public void setReplacement_cost(Float replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Calendar getLast_update() {
        return this.last_update;
    }

    public void setLast_update(Calendar last_update) {
        this.last_update = last_update;
    }

    public String getSpecial_features() {
        return this.special_features;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }

    public String getFulltext() {
        return this.fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }

}
