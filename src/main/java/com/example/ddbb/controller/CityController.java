package com.example.ddbb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ddbb.dao.CityDao;
import com.example.ddbb.domain.City;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CityController {

    @Autowired
    private CityDao dao;

    @GetMapping("/")
    public String main(Model model){
        Iterable<City> cities = dao.findAll();
        model.addAttribute("cities", cities);
        return "index";
    }
}
