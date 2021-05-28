package com.residencia.dvdrental.entities;

import java.util.Calendar;
import java.util.List;

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
    private Integer film_ID;

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

}
