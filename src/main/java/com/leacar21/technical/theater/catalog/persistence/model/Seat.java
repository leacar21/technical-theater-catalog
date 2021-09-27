package com.leacar21.technical.theater.catalog.persistence.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "seat")
public class Seat extends AbstractEntityJPA {

    @Column(name = "code", columnDefinition = "BINARY(16)")
    private UUID code;

    @Column(name = "row")
    private String row;

    @Column(name = "column")
    private String column;

    @ManyToOne(optional = false)
    @JoinColumn(name = "auditorium_id", nullable = false)
    private Auditorium auditorium;

}
