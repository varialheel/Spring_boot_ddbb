package com.example.ddbb.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.ddbb.domain.City;

public interface CityDao extends CrudRepository<City, Long>{
    
}
