package edu.miu.cs.najeeb.spring.eafinal.repository;

import edu.miu.cs.najeeb.spring.eafinal.entity.Genre;
import edu.miu.cs.najeeb.spring.eafinal.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByGenre(Genre genre);

    List<Movie> findMoviesByYearAndRating(int year, int rating);

    @Query(value = "select m from Movie m where m.rating = (select max(m2.rating) from Movie m2) and size(m.actors) = (select min(size(m1.actors)) from Movie m1 where m1.rating = m.rating)")
    Movie highestRatedMovieWithLeastNumberOfActors();
}
