package com.example.demo.Dto;

public class CityBasicDto {

    private int cityId;
    private String cityName;

    public CityBasicDto(int cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }

    public CityBasicDto() {

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
}
