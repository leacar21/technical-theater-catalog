package com.leacar21.technical.theater.catalog.persistence.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.leacar21.technical.theater.catalog.persistence.dao.repository.AuditoriumRepository;
import com.leacar21.technical.theater.catalog.persistence.model.Auditorium;

@Repository
public class AuditoriumDAO {

    @Autowired
    private AuditoriumRepository repository;

    @Transactional(readOnly = true)
    public Auditorium findByCode(UUID code) {
        Optional<Auditorium> optionalAuditorium = this.repository.findByCode(code);
        return optionalAuditorium.isPresent() ? optionalAuditorium.get() : null;
    }

    @Transactional(readOnly = false)
    public Auditorium save(Auditorium entity) {
        return this.repository.save(entity);
    }

    @Transactional(readOnly = true)
    public List<Auditorium> findAll() {
        return this.repository.findAll();
    }
}
