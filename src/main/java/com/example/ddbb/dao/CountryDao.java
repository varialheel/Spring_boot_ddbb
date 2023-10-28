package com.example.ddbb.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.ddbb.domain.Country;

public interface CountryDao extends CrudRepository<Country, String>{
    
}
