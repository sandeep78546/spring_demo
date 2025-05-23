package com.example.demo.mapper;

import com.example.demo.Dto.CityDto;
import com.example.demo.entity.City;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityMapper {

    CityDto toDto(City city);
    City toEntity(CityDto cityDto);
}
