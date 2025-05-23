package com.example.demo.service;

import com.example.demo.Dto.StateDto;
import com.example.demo.entity.State;
import com.example.demo.mapper.StateMapper;
import com.example.demo.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    private final StateMapper stateMapper;

    @Autowired
    public StateService(StateMapper stateMapper) {
        this.stateMapper = stateMapper;
    }


    public StateDto returnStateDetails(int stateId){
        State state = stateRepository.findById(stateId).get();

        return stateMapper.toDto(state);
    }

    public State savedState(State state){
        return stateRepository.save(state);
    }

}
