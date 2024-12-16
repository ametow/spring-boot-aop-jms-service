package edu.miu.cs.najeeb.spring.eafinal.repository;

import edu.miu.cs.najeeb.spring.eafinal.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ActorRepository extends JpaRepository<Actor, Long> {

    Optional<Actor> findActorByName(String name);

    // jpql version
    @Query("select a from Actor a where a.country = \"America\" and a.yearOfExperience > 3")
    List<Actor> americanWithThreeYearsExperience();

    // query method version
    List<Actor> findByCountryAndYearOfExperienceGreaterThan(String country, int yearOfExperience);
}
