package com.leacar21.technical.theater.catalog.persistence.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.leacar21.technical.theater.catalog.persistence.dao.repository.SeatRepository;
import com.leacar21.technical.theater.catalog.persistence.model.Seat;

@Repository
public class SeatDAO {

    @Autowired
    private SeatRepository repository;

    @Transactional(readOnly = true)
    public Seat findByCode(UUID code) {
        Optional<Seat> optionalSeat = this.repository.findByCode(code);
        return optionalSeat.isPresent() ? optionalSeat.get() : null;
    }

    @Transactional(readOnly = false)
    public Seat save(Seat entity) {
        return this.repository.save(entity);
    }

    @Transactional(readOnly = true)
    public List<Seat> findAll() {
        return this.repository.findAll();
    }
}
