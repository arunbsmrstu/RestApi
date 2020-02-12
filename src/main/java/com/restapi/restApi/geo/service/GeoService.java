
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.geo.service;

import com.restapi.restApi.geo.dto.DistrictDto;
import com.restapi.restApi.geo.dto.DivisionDto;
import com.restapi.restApi.geo.dto.UpazilaDto;
import java.util.List;


public interface GeoService {
  public List<DistrictDto> getAllDistrict();
  public List<DivisionDto> getAllDivision();
  public List<UpazilaDto> getAllUpazila();
  public List<DistrictDto> getDistrict(int id);
  public List<DivisionDto> getDivision(int id);
  public List<UpazilaDto> getUpazila(int id);
  public List<DistrictDto> getDistrictByDistrict(DivisionDto divisionDto);
  public List<UpazilaDto> getUpazilaByDistrict(DistrictDto districtDto);
  
}
