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
    //
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String Name;
    private String CountryCode;
    private String District;
    private Integer Population;
}
