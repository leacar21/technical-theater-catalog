package com.leacar21.technical.theater.catalog.persistence.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "auditorium")
public class Auditorium extends AbstractEntityJPA {

    @Column(name = "code", columnDefinition = "BINARY(16)")
    private UUID code;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "auditorium")
    private List<Seat> seats;

    @ManyToOne(optional = false)
    @JoinColumn(name = "theater_id", nullable = false)
    private Theater theater;

}
