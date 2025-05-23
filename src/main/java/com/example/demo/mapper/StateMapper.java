package com.example.demo.mapper;

import com.example.demo.Dto.StateDto;
import com.example.demo.entity.State;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = CityMapper.class)
public interface StateMapper {
    @Mapping(target = "cities", source = "cityList")
    StateDto toDto(State state);

    @Mapping(target = "cityList", source = "cities")
    State toEntity(StateDto stateDto);
}
