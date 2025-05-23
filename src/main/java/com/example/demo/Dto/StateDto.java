package com.example.demo.Dto;

import java.util.List;

public class StateDto {
    private int stateId;
    private String stateName;
    private List<CityDto> cities;


    public StateDto(int stateId, String stateName) {
        this.stateId = stateId;
        this.stateName = stateName;
    }

    public StateDto() {

    }

    public List<CityDto> getCities() {
        return cities;
    }

    public void setCities(List<CityDto> cities) {
        this.cities = cities;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
