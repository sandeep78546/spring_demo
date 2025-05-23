package com.example.demo.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class CityDto {
    private int cityId;
    private String cityName;
    private StateDto state;

    public CityDto(int cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }

    public CityDto() {

    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public StateDto getState() {
        return state;
    }

    public void setState(StateDto state) {
        this.state = state;
    }
}
