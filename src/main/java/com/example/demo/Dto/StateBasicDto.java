package com.example.demo.Dto;

public class StateBasicDto {
    private int stateId;
    private String stateName;

    public StateBasicDto(int stateId, String stateName) {
        this.stateId = stateId;
        this.stateName = stateName;
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
