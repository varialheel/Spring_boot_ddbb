package com.example.ddbb.service;

import java.util.List;
import java.util.Optional;

import com.example.ddbb.domain.City;

public interface CityService {

    public List<City> citiesList();

    public void save(City city);

    public void delete(City city);

    public Optional<City> getCity(Long id);

}
