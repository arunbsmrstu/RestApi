/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.geo.payload;

import com.restapi.restApi.geo.dto.DivisionDto;
import com.restapi.restApi.util.payload.ServiceResponse;
import java.util.List;

/**
 *
 * @author Arun
 */
public class DivisionResponse extends ServiceResponse{
    private List<DivisionDto> divisionList;
    private int total;

    public DivisionResponse() {
    }

    public DivisionResponse(List<DivisionDto> divisionList, int total) {
        this.divisionList = divisionList;
        this.total = total;
    }
    
    

    public List<DivisionDto> getDivisionList() {
        return divisionList;
    }

    public void setDivisionList(List<DivisionDto> divisionList) {
        this.divisionList = divisionList;
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
