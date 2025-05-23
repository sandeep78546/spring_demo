package com.example.demo.controller;

import com.example.demo.Dto.StateDto;
import com.example.demo.entity.State;
import com.example.demo.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/state")
public class StateController{

    @Autowired
    private StateService stateService;

    @GetMapping("/{stateId}")
    public ResponseEntity<?> returnStateDetails(@PathVariable int stateId){
        StateDto stateDto = stateService.returnStateDetails(stateId);
        return ResponseEntity.status(HttpStatus.OK).body(stateDto);
    }

    @PostMapping
    public ResponseEntity<?> savedState(@RequestBody State state){
        State savedState = stateService.savedState(state);
        return ResponseEntity.status(HttpStatus.OK).body(savedState);
    }
}
