package com.leacar21.technical.theater.catalog.persistence.dao.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leacar21.technical.theater.catalog.persistence.model.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long> {

    Optional<Theater> findByCode(UUID code);

    List<Theater> findByEnabled(boolean enabled);

}