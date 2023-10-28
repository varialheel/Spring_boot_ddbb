package com.example.ddbb.domain;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "city")

public class City implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String Name;
    private String Country_code;
    private String District;
    private Integer Population;

    public Integer getID() {
        return this.ID;
    }

    public String getName() {
        return this.Name;
    }

    public String getCountryCode() {
        return this.Country_code;
    }

    public String getDistrict() {
        return this.District;
    }

    public Integer getPopulation() {
        return this.Population;
    }

}
