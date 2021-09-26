package com.leacar21.technical.theater.catalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TheaterDTO {

    private String code;
    private String name;
    private boolean enabled;

}
