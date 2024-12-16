package edu.miu.cs.najeeb.spring.eafinal.service;

import edu.miu.cs.najeeb.spring.eafinal.entity.Actor;
import edu.miu.cs.najeeb.spring.eafinal.exceptions.NotFoundException;
import edu.miu.cs.najeeb.spring.eafinal.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {
    
    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> findAll() {
        return actorRepository.findAll();
    }

    public Actor findByName(String name) {
        return actorRepository.findActorByName(name).orElse(null);
    }

    public Actor findById(Long id) {
        return actorRepository.findById(id).orElseThrow(() -> new NotFoundException("Actor with id " + id + " not found"));
    }

    public Actor save(Actor actor) {
        return actorRepository.save(actor);
    }

    public void updateById(Long id, Actor actor) {
        Actor a = actorRepository.findById(id).orElseThrow(() -> new NotFoundException("Actor with id " + id + " not found"));
        a.setName(actor.getName());
        a.setCountry(actor.getCountry());
        a.setDob(actor.getDob());
        a.setYearOfExperience(actor.getYearOfExperience());
        actorRepository.save(a);
    }

    public void deleteById(Long id) {
        actorRepository.deleteById(id);
    }

    public List<Actor> getActorsByCountryAndYearOfExperienceGreaterThan() {
        return actorRepository.americanWithThreeYearsExperience();
    }
}
