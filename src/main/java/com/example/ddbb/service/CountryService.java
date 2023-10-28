package com.example.ddbb.service;

import java.util.List;
import java.util.Optional;

import com.example.ddbb.domain.Country;

public interface CountryService {

    public List<Country> countriesList();

    public void save(Country country);

    public void delete(Country country);

    public Optional<Country> getCountry(String code);

}
