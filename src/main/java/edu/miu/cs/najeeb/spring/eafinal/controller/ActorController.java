package edu.miu.cs.najeeb.spring.eafinal.controller;

import edu.miu.cs.najeeb.spring.eafinal.entity.Actor;
import edu.miu.cs.najeeb.spring.eafinal.producer.Producer;
import edu.miu.cs.najeeb.spring.eafinal.service.ActorService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/actors")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @Autowired
    private Producer producer;
    
    @GetMapping
    public List<Actor> findAll() {
        return actorService.findAll();
    }

    @GetMapping("/byName")
    public Actor getActorByName(@RequestParam(value = "name") String name) {
        return actorService.findByName(name);
    }

    @GetMapping("/{id}")
    public Actor findById(@PathVariable Long id) {
        return actorService.findById(id);
    }

    @GetMapping("/{id}/actorName")
    public String sendActorName(@PathVariable Long id) {
        String actorName = actorService.findById(id).getName();
        producer.produceMessage("final-actorName", actorName);
        return actorName;
    }

    @PostMapping
    public Actor save(@RequestBody Actor actor) {
        return actorService.save(actor);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Actor actor) {
        actorService.updateById(id, actor);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        actorService.deleteById(id);
    }
}
