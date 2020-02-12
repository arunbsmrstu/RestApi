/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.geo.service;

import com.restapi.restApi.geo.dto.DistrictDto;
import com.restapi.restApi.geo.dto.DivisionDto;
import com.restapi.restApi.geo.dto.UpazilaDto;
import com.restapi.restApi.geo.entity.District;
import com.restapi.restApi.geo.entity.Division;
import com.restapi.restApi.geo.entity.Upazila;
import com.restapi.restApi.geo.repository.DistrictRepository;
import com.restapi.restApi.geo.repository.DivisionRepository;
import com.restapi.restApi.geo.repository.UpzilaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Arun
 */
@Service
public class GeoServiceImp implements GeoService{
    
    @Autowired
    private DistrictRepository districtRepository;
    @Autowired
    private DivisionRepository divisionRepository;
    @Autowired
    private UpzilaRepository upzilaRepository;

    @Override
    public List<DistrictDto> getAllDistrict() {
        List<DistrictDto> returnList= new ArrayList();
        List<District> districtList=districtRepository.findAll();
        for(District district:districtList){
            DistrictDto districtDto = new DistrictDto();
            BeanUtils.copyProperties(district, districtDto);
            returnList.add(districtDto);
        }
        return returnList;
    }

    @Override
    public List<DivisionDto> getAllDivision() {
        List<DivisionDto> returnList= new ArrayList();
        List<Division> divisionList=divisionRepository.findAll();
        for(Division division:divisionList){
            DivisionDto divisionDto= new DivisionDto();
            BeanUtils.copyProperties(division, divisionDto);
            returnList.add(divisionDto);
        }
        return returnList;
    }

    @Override
    public List<UpazilaDto> getAllUpazila() {
        List<UpazilaDto> returnList= new ArrayList();
        List<Upazila> upazilaList=upzilaRepository.findAll();
        for(Upazila upazila:upazilaList){
            UpazilaDto upazilaDto= new UpazilaDto();
            BeanUtils.copyProperties(upazila, upazilaDto);
            returnList.add(upazilaDto);
        }
        return returnList;
    }

    @Override
    public List<DistrictDto> getDistrict(int id) {
        List<DistrictDto> returnList= new ArrayList();
        return returnList;
    }

    @Override
    public List<DivisionDto> getDivision(int id) {
       List<DivisionDto> returnList= new ArrayList();
       return returnList;
    }

    @Override
    public List<UpazilaDto> getUpazila(int id) {
        List<UpazilaDto> returnList= new ArrayList();
        return returnList;
    }

    @Override
    public List<DistrictDto> getDistrictByDistrict(DivisionDto divisionDto) {
        List<DistrictDto> returnList= new ArrayList();
        return returnList;
    }

    @Override
    public List<UpazilaDto> getUpazilaByDistrict(DistrictDto districtDto) {
       List<UpazilaDto> returnList= new ArrayList();
       return returnList;
    }
    
}
