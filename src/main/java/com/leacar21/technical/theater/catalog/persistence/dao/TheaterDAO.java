package com.leacar21.technical.theater.catalog.persistence.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.leacar21.technical.theater.catalog.persistence.dao.repository.TheaterRepository;
import com.leacar21.technical.theater.catalog.persistence.model.Theater;

@Repository
public class TheaterDAO {

    @Autowired
    private TheaterRepository repository;

    @Transactional(readOnly = true)
    public Theater findByCode(UUID code) {
        Optional<Theater> optionalTheater = this.repository.findByCode(code);
        return optionalTheater.isPresent() ? optionalTheater.get() : null;
    }

    @Transactional(readOnly = false)
    public Theater save(Theater entity) {
        return this.repository.save(entity);
    }

    @Transactional(readOnly = true)
    public List<Theater> findAll(boolean enabled) {
        return this.repository.findByEnabled(enabled);
    }

    @Transactional(readOnly = true)
    public List<Theater> findAll() {
        return this.repository.findAll();
    }
}
