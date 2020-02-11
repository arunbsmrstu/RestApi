/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.util.payload;

import com.restapi.restApi.util.enums.ErrorCode;
import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class ServiceError implements Serializable{
    private String errorMsg;
    private Integer errorCode;
    
    public ServiceError(Integer errorCode, String errorMsg){
        this.errorCode = errorCode;
        String name = ErrorCode.getValue(errorCode).name();
        this.errorMsg = name + " [" + errorMsg + "]";        
        
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
