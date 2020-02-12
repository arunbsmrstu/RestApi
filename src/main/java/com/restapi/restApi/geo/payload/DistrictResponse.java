/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.geo.payload;

import com.restapi.restApi.geo.dto.DistrictDto;
import com.restapi.restApi.util.payload.ServiceResponse;
import java.util.List;

/**
 *
 * @author Arun
 */
public class DistrictResponse extends ServiceResponse{
    private List<DistrictDto> districtList;
    private int total;

    public DistrictResponse() {
    }

    public DistrictResponse(List<DistrictDto> districtList, int total) {
        this.districtList = districtList;
        this.total = total;
    }
    
    

    public List<DistrictDto> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<DistrictDto> districtList) {
        this.districtList = districtList;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isOperationResult() {
        return operationResult;
    }

    public void setOperationResult(boolean operationResult) {
        this.operationResult = operationResult;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
    
    
}
