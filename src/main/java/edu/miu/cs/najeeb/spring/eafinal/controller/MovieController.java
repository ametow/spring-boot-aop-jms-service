package edu.miu.cs.najeeb.spring.eafinal.controller;

import edu.miu.cs.najeeb.spring.eafinal.entity.Movie;
import edu.miu.cs.najeeb.spring.eafinal.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAll(@RequestParam(value = "year", required = false) Integer year, @RequestParam(value = "rating", required = false) Integer rating) {
        if (year != null && rating != null){
            return movieService.findAllByYearAndRating(year, rating);
        }
        return movieService.findAll();
    }

    @GetMapping("/{id}")
    public Movie findById(@PathVariable("id") Long id) {
        return movieService.findById(id);
    }

    @PostMapping
    public Movie save(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Movie movie, @PathVariable("id") Long id) {
        movieService.updateById(id, movie);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        movieService.deleteById(id);
    }

}
