package com.leacar21.technical.theater.catalog.converters;

import org.springframework.stereotype.Service;

import com.leacar21.technical.theater.catalog.dto.TheaterDTO;
import com.leacar21.technical.theater.catalog.persistence.model.Theater;

@Service
public class TheaterConverter extends AbstractConverter<TheaterDTO, Theater> {

    @Override
    protected Theater commonToEntity(TheaterDTO source) {
        return this.strictModelMapper.map(source, Theater.class);
    }

    @Override
    protected TheaterDTO commonToDTO(Theater source) {
        return this.strictModelMapper.map(source, TheaterDTO.class);
    }

    // public void dtoIntoEntity(TheaterDTO source, Theater entity) {
    // this.strictModelMapper.map(source, entity);
    // }
    //
    // public void entityIntoDto(Theater source, TheaterDTO dto) {
    // this.strictModelMapper.map(source, dto);
    // }
}