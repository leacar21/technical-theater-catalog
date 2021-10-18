package com.leacar21.technical.theater.catalog.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.leacar21.technical.theater.catalog.converters.TheaterConverter;
import com.leacar21.technical.theater.catalog.dto.TheaterDTO;
import com.leacar21.technical.theater.catalog.persistence.dao.TheaterDAO;
import com.leacar21.technical.theater.catalog.persistence.model.Theater;
import com.leacar21.technical.theater.catalog.services.TheaterCatalogService;

@Service
public class TheaterCatalogServiceImpl implements TheaterCatalogService {

    Logger log = LoggerFactory.getLogger(TheaterCatalogServiceImpl.class);

    @Autowired
    private TheaterDAO theaterDAO;

    @Autowired
    private TheaterConverter theaterConverter;

    @Override
    @Transactional(readOnly = true)
    @Cacheable(value = "theaters", unless = "#result.size() == 0")
    public List<TheaterDTO> getAll(Boolean enabled) {
        List<Theater> listTheater = null;
        if (enabled == null) {
            listTheater = this.theaterDAO.findAll();
        } else {
            listTheater = this.theaterDAO.findAll(enabled);
        }

        return this.theaterConverter.toDTO(listTheater);
    }

    @Override
    @Transactional(readOnly = false)
    public TheaterDTO create(TheaterDTO theaterDTO) {
        var theater = this.theaterConverter.toEntity(theaterDTO);
        theater = this.theaterDAO.save(theater);
        return this.theaterConverter.toDTO(theater);
    }

}
