package com.leacar21.technical.theater.catalog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.leacar21.technical.theater.catalog.dto.TheaterDTO;
import com.leacar21.technical.theater.catalog.services.TheaterCatalogService;

@RestController()
@RequestMapping(TheaterCatalogController.THEATERS_RESOURCE)
public class TheaterCatalogController {

    public static final String THEATERS_RESOURCE = "theaters";

    @Autowired
    private TheaterCatalogService theaterCatalogService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TheaterDTO> getAll(@RequestParam(value = "enabled", required = false) Boolean enabled) {
        return this.theaterCatalogService.getAll(enabled);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public TheaterDTO create(@RequestBody(required = true) TheaterDTO theaterDTO) {
        return this.theaterCatalogService.create(theaterDTO);
    }

}
