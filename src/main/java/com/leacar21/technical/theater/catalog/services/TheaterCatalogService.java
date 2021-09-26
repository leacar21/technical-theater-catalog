package com.leacar21.technical.theater.catalog.services;

import java.util.List;

import com.leacar21.technical.theater.catalog.dto.TheaterDTO;

public interface TheaterCatalogService {

    List<TheaterDTO> getAllAdditionalsServicesConfigurations(Boolean enable);

}
