package com.example.demo.mapper;

import com.example.demo.Dto.CityBasicDto;
import com.example.demo.Dto.CityDto;
import com.example.demo.entity.City;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface CityMapper {

    CityDto toDto(City city);                 // full city with state info
    @Named("toBasic")
    CityBasicDto toBasicDto(City city);     // basic city (for StateDto)
    City toEntity(CityDto cityDto);
}
