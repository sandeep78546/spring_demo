package com.example.demo.controller;

import com.example.demo.Dto.CityDto;
import com.example.demo.entity.City;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/{cityId}")
    public ResponseEntity<?> returnCityDetails(@PathVariable int cityId){
        CityDto cityDto = cityService.returnCityDetails(cityId);
        return ResponseEntity.ok().body(cityDto);
    }

    @PostMapping
    public ResponseEntity<?> createCity(@RequestBody City city, @RequestParam int stateId){
        CityDto cityDto = cityService.createCity(city, stateId);
        return ResponseEntity.status(HttpStatus.OK).body(cityDto);
    }

}
