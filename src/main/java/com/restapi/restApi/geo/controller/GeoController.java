/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.geo.controller;

import com.restapi.restApi.geo.dto.DistrictDto;
import com.restapi.restApi.geo.dto.DivisionDto;
import com.restapi.restApi.geo.dto.UpazilaDto;
import com.restapi.restApi.geo.payload.DistrictResponse;
import com.restapi.restApi.geo.payload.DivisionResponse;
import com.restapi.restApi.geo.payload.UpazilaResponse;
import com.restapi.restApi.geo.service.GeoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/geo/")
public class GeoController {

    @Autowired
    private GeoService geoService;

    @GetMapping("allDistrict")
    public DistrictResponse getALlDistrict() {
        List<DistrictDto> list = geoService.getAllDistrict();
        return new DistrictResponse(list, list.size());
    }

    @GetMapping("allDivision")
    public DivisionResponse getALlDivision() {
        List<DivisionDto> list = geoService.getAllDivision();
        return new DivisionResponse(list, list.size());
    }

    @GetMapping("allUpazila")
    public UpazilaResponse getALlUpazila() {
        List<UpazilaDto> list = geoService.getAllUpazila();
        return new UpazilaResponse(list, list.size());
    }

}
