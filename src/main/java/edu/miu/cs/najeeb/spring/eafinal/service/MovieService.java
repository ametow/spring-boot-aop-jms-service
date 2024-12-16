package edu.miu.cs.najeeb.spring.eafinal.service;

import edu.miu.cs.najeeb.spring.eafinal.entity.Movie;
import edu.miu.cs.najeeb.spring.eafinal.exceptions.NotFoundException;
import edu.miu.cs.najeeb.spring.eafinal.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Movie findById(Long id) {
        return movieRepository.findById(id).orElseThrow(() -> new NotFoundException("Movie with id " + id + " not found"));
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public void updateById(Long id, Movie movie) {
        Movie m = movieRepository.findById(id).orElseThrow(() -> new NotFoundException("Movie with id " + id + " not found"));
        m.setTitle(movie.getTitle());
        m.setYear(movie.getYear());
        m.setGenre(movie.getGenre());
        m.setRating(movie.getRating());
        movieRepository.save(m);
    }

    public void deleteById(Long id) {
        movieRepository.deleteById(id);
    }

    public List<Movie> findAllByYearAndRating(Integer year, Integer rating) {
        return movieRepository.findMoviesByYearAndRating(year, rating);
    }
}
