package com.example.ddbb.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ddbb.dao.CityDao;
import com.example.ddbb.domain.City;
import com.example.ddbb.service.CityService;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Transactional(readOnly = true)
    @Override
    public List<City> citiesList() {
        return ((List<City>) cityDao.findAll());
    }

    @Transactional
    @Override
    public void save(City city) {
        cityDao.save(city);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        cityDao.deleteById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<City> getCity(Long id) {
        return cityDao.findById(id);
    }

}
