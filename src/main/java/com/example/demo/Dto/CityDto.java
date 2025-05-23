package com.example.demo.Dto;


public class CityDto extends CityBasicDto {
    private StateBasicDto state;

    public StateBasicDto getState() {
        return state;
    }

    public void setState(StateBasicDto state) {
        this.state = state;
    }
}
