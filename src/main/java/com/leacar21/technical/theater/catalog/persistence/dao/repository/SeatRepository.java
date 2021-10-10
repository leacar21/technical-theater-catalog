package com.leacar21.technical.theater.catalog.persistence.dao.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leacar21.technical.theater.catalog.persistence.model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {

    Optional<Seat> findByCode(UUID reservationCode);

}