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
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "country_id")
    private Integer country_id;

    @OneToMany(mappedBy = "country")
    private List<City> city;
    
    @Column(name = "country")
    private String country;

    @Column(name = "last_update")
    private Calendar last_update;

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public Calendar getLast_update() {
        return last_update;
    }

    public void setLast_update(Calendar last_update) {
        this.last_update = last_update;
    }

}
