package com.example.ddbb.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ddbb.dao.CityDao;
import com.example.ddbb.dao.CountryDao;
import com.example.ddbb.domain.City;
import com.example.ddbb.domain.Country;
import com.example.ddbb.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDao countryDao;

    @Transactional(readOnly = true)
    @Override
    public List<Country> countriesList() {
        return ((List<Country>) countryDao.findAll());
    }

    @Transactional
    @Override
    public void save(Country country) {
        countryDao.save(country);
    }

    @Transactional
    @Override
    public void delete(Country country) {
        countryDao.delete(country);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Country> getCountry(String code) {
        return countryDao.findById(code);
    }
}
