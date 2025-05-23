package com.example.demo.mapper;

import com.example.demo.Dto.StateBasicDto;
import com.example.demo.Dto.StateDto;
import com.example.demo.entity.State;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = CityMapper.class)
public interface StateMapper {
    StateBasicDto toBasicDto(State state);        // minimal state info
    @Mapping(source = "cityList", target = "cities", qualifiedByName = "toBasic")
    StateDto toDto(State state);                  // full state with basic cities

    @Mapping(target = "cityList", source = "cities")
    State toEntity(StateDto stateDto);
}
