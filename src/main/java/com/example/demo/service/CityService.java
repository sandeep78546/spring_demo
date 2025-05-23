package com.example.demo.service;

import com.example.demo.Dto.CityDto;
import com.example.demo.entity.City;
import com.example.demo.entity.State;
import com.example.demo.mapper.CityMapper;
import com.example.demo.repository.CityRepository;
import com.example.demo.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private StateRepository stateRepository;

    private final CityMapper cityMapper;

    @Autowired
    public CityService(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    public CityDto returnCityDetails(int cityId){
        City city = cityRepository.findById(cityId).get();
        return cityMapper.toDto(city);
    }

    public CityDto createCity(City city, int stateId){
        State state = stateRepository.findById(stateId).get();
        city.setState(state);
        City saveCity = cityRepository.save(city);
        return cityMapper.toDto(saveCity);
    }
}
