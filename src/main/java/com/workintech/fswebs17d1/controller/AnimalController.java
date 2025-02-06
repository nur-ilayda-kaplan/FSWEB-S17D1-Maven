package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workintech/animal")
public class AnimalController {
    private Map<Integer, Animal> animals = new HashMap<>();

    @GetMapping()
    public List<Animal> findAllAnimals()
    {
        return animals.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Animal getAnimal(@PathVariable int id)
    {
        return animals.get(id);
    }

    @PostMapping()
    //@RequestBody bu requestin bodysinde taşınacak bir data var demek
    public Animal save(@RequestBody Animal animal)
    {
        animals.put(animal.getId(),animal);
        return animals.get(animal.getId());
    }

    @PutMapping("/{id}")
    public Animal update(@PathVariable int id,@RequestBody Animal animal)
    {
        animals.put(id,animal);
        return animals.get(id);
    }

    @DeleteMapping("/{id}")
    public Animal delete(@PathVariable int id)
    {
        Animal animal = animals.get(id);
        animals.remove(animal.getId());
        return animal;
    }
}