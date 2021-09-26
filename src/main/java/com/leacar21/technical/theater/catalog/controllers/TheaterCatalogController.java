package com.leacar21.technical.theater.catalog.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.leacar21.technical.theater.catalog.dto.TheaterDTO;
import com.leacar21.technical.theater.catalog.services.TheaterCatalogService;

@RestController()
@RequestMapping("theaters")
public class TheaterCatalogController {

    Logger logger = LoggerFactory.getLogger(TheaterCatalogController.class);

    @Autowired
    private TheaterCatalogService theaterCatalogService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TheaterDTO> getAll(@RequestParam(value = "enable", required = false) Boolean enable) {
        this.logger.info("aaa");
        return this.theaterCatalogService.getAllAdditionalsServicesConfigurations(enable);
    }

}
