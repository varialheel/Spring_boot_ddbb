package com.example.ddbb.domain;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "country")

public class Country implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Code")
    private String code;

    @Column(name="Name")
    private String name;

    @Column(name="Region")
    private String region;

    @Column(name="SurfaceArea")
    private Float surfaceArea;

    @Column(name="IndepYear")
    private Integer indepYear;

    @Column(name="Population")
    private Integer population;

    @Column(name="LifeExpectancy")
    private Float lifeExpectancy;

    @Column(name="GNP")
    private Float gnp;

    @Column(name="GNPOld")
    private Float gnpOld;

    @Column(name="LocalName")
    private String localName;

    @Column(name="GovernmentForm")
    private String governmentForm;

    @Column(name="HeadOfState")
    private String headOfState;

    @Column(name="Capital")
    private Integer capital;

    @Column(name="Code2")
    private String code2;

    public String getCode() {
        return this.code;
    }

    public String getRegion() {
        return this.region;
    }

    public Float getSurfaceArea() {
        return this.surfaceArea;
    }

    public Integer getIndepYear() {
        return this.indepYear;
    }

    public Integer getPopulation() {
        return this.population;
    }

    public Float getLifeExpenctancy() {
        return this.lifeExpectancy;
    }
    
    public Float getGnp() {
        return this.gnp;
    }
    
    public Float getGnpOld() {
        return this.gnpOld;
    }
    
    public String getLocalName() {
        return this.localName;
    }
    
    public String getGovernmentForm() {
        return this.governmentForm;
    }
    
    public String getHeadOfState() {
        return this.headOfState;
    }
    
    public Integer getCapital() {
        return this.capital;
    }
    
    public String getCode2() {
        return this.code2;
    }

}
