package edu.miu.cs.najeeb.spring.eafinal.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Movie {
    @Id@GeneratedValue
    private Long id;

    private String title;
    private int year;
    private int rating;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @OneToMany
    @JoinColumn(name = "movie_id")
    private List<Actor> actors;

    public Movie() {
    }

    public Movie(Long id, String title, int year, int rating, Genre genre) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                ", genre=" + genre +
                '}';
    }
}
