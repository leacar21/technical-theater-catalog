package com.leacar21.technical.theater.catalog.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TheaterDTO {

    private String code;
    private String name;
    private boolean enabled;
    private List<AuditoriumDTO> auditoriums;

}
