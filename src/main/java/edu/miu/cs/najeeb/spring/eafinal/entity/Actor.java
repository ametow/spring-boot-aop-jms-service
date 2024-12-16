package edu.miu.cs.najeeb.spring.eafinal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Actor {
    @Id@GeneratedValue
    private Long id;
    private String name;
    private Date dob;
    private int yearOfExperience;
    private String country;

    public Actor() {
    }

    public Actor(Long id, String name, Date dob, String country) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", country='" + country + '\'' +
                '}';
    }
}
