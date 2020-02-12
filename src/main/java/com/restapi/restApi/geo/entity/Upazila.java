package com.restapi.restApi.geo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "upazila")
public class Upazila {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
     
     @Column(name = "code")
    private int code;
    
    @NotBlank
    @Column(length = 30, name = "name")
    private String name;

    @Column(name = "status")
    private int status;

    @Column(name = "district_code")
    private int District;
    
     @Column(name = "division_code")
    private int division;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDistrict() {
        return District;
    }

    public void setDistrict(int District) {
        this.District = District;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

   
    
}
