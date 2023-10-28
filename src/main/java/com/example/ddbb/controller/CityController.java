package com.example.ddbb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ddbb.domain.City;
import com.example.ddbb.service.CityService;
import com.example.ddbb.service.CountryService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CityController {

    @Autowired
    private CityService service;

    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    public String main(Model model){
        Iterable<City> cities = service.citiesList();
        model.addAttribute("cities", cities);
        return "index";
    }

    @GetMapping("/addCityForm")
    public String addCityForm(Model model){
        model.addAttribute("countries", countryService.countriesList());
        return "addCityForm";
    }

    @PostMapping("/addCity")
    public String addCity(City city){
        service.save(city);
        return "redirect:/";
    }

    @PostMapping("/updateCity")
    public String updateCity(City city) {
        service.save(city);
        // log.info(city.toString());
        return "redirect:/";
    }

    @GetMapping("/deleteCity/{cityId}")
    public String deleteCity(@PathVariable Long cityId) {
        service.delete(cityId);
        // log.info(city.toString());
        return "redirect:/";
    }

    @GetMapping("/updateCityForm/{cityId}")
    public String updateCityForm(@PathVariable Long cityId, Model model) {
        model.addAttribute("city", service.getCity(cityId).get());
        model.addAttribute("countries", countryService.countriesList());
        return "updateCityForm";
    }
}
