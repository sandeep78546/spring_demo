package com.example.demo.Dto;

import java.util.List;

public class StateDto extends StateBasicDto {
    private List<CityBasicDto> cities;

    public StateDto(int stateId, String stateName) {
        super(stateId, stateName);
    }

    public List<CityBasicDto> getCities() {
        return cities;
    }

    public void setCities(List<CityBasicDto> cities) {
        this.cities = cities;
    }
}
