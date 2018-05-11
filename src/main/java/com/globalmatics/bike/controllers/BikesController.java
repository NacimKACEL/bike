package com.globalmatics.bike.controllers;

import com.globalmatics.bike.models.Bikes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    @GetMapping
    public List<Bikes> list() {
        List<Bikes> bikes = new ArrayList<>();
        return bikes;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bikes bkies) {

    }

    @GetMapping("/{id}")
    public Bikes get(@PathVariable long id) {
        return new Bikes();
    }
}
