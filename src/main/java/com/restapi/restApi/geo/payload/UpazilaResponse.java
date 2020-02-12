/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.geo.payload;

import com.restapi.restApi.geo.dto.UpazilaDto;
import com.restapi.restApi.util.payload.ServiceResponse;
import java.util.List;


public class UpazilaResponse extends ServiceResponse{
    private List<UpazilaDto> UpazilaList;
    private int total;

    public UpazilaResponse() {
    }

    public UpazilaResponse(List<UpazilaDto> UpazilaList, int total) {
        this.UpazilaList = UpazilaList;
        this.total = total;
    }
    
    

    public List<UpazilaDto> getUpazilaList() {
        return UpazilaList;
    }

    public void setUpazilaList(List<UpazilaDto> UpazilaList) {
        this.UpazilaList = UpazilaList;
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
