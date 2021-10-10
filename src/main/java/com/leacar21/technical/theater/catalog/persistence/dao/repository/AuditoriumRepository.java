package com.leacar21.technical.theater.catalog.persistence.dao.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leacar21.technical.theater.catalog.persistence.model.Auditorium;

public interface AuditoriumRepository extends JpaRepository<Auditorium, Long> {

    Optional<Auditorium> findByCode(UUID code);

}