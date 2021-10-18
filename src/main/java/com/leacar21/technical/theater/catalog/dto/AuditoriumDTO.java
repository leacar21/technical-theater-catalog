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
public class AuditoriumDTO {

    private String code;
    private String name;
    private List<SeatDTO> seats;

}
