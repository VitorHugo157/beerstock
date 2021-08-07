package com.vitor.beerstockbackend.mapper;

import com.vitor.beerstockbackend.dto.BeerDTO;
import com.vitor.beerstockbackend.model.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);
    BeerDTO toDTO(Beer beer);
}
