package com.example.demo.service;

import com.example.demo.Dto.CityDto;
import com.example.demo.Dto.StateDto;
import com.example.demo.entity.City;
import com.example.demo.entity.State;
import com.example.demo.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public StateDto returnStateDetails(int stateId){
        State state = stateRepository.findById(stateId).get();
        state.getCityList().forEach(city ->
                        System.out.println("- " + city.getCityId() + ": " + city.getCityName()));
        StateDto stateDto = new StateDto();
        stateDto.setStateId(state.getStateId());
        stateDto.setStateName(state.getStateName());
        List<CityDto> cityDtoList = state.getCityList().stream()
                .map(city -> new CityDto(city.getCityId(), city.getCityName()))
                .toList();
        stateDto.setCities(cityDtoList);
        return stateDto;
    }

    public State savedState(State state){
        return stateRepository.save(state);
    }

}
