package com.globalmatics.bike.controllers;

import com.globalmatics.bike.models.Bikes;
import com.globalmatics.bike.repositories.BikesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    @Autowired
    BikesRepository bikesRepository;

    @GetMapping
    public List<Bikes> list() {
        return bikesRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bikes bike) {
        bikesRepository.save(bike);
    }

    @GetMapping("/{id}")
    public Bikes get(@PathVariable("id") long id) {
        return bikesRepository.getOne(id);
    }
}
