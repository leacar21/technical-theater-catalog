package com.leacar21.technical.theater.catalog.services;

import java.util.List;

import com.leacar21.technical.theater.catalog.dto.TheaterDTO;

public interface TheaterCatalogService {

    List<TheaterDTO> getAll(Boolean enable);

    TheaterDTO create(TheaterDTO enable);

}
