package com.leacar21.technical.theater.catalog.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.leacar21.technical.theater.catalog.dto.TheaterDTO;
import com.leacar21.technical.theater.catalog.services.TheaterCatalogService;

@Service
public class TheaterCatalogServiceImpl implements TheaterCatalogService {

    @Override
    public List<TheaterDTO> getAllAdditionalsServicesConfigurations(Boolean enable) {
        // TODO: implementar
        return List.of( //
                new TheaterDTO("MET", "Metro", true), //
                new TheaterDTO("ETI", "El Tinglado", true), //
                new TheaterDTO("SOL", "Solis", true) //
        );
    }

}
