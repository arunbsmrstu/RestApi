/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.util.payload;

import java.io.Serializable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ASUS
 */
public class ServiceResponse implements Serializable{
    protected boolean operationResult;
    protected String errorMsg;
    protected Integer errorCode;
    
     public ServiceResponse(){
        this.operationResult = true;
        this.errorMsg = null;
        this.errorCode = null;
    }

    public ServiceResponse(@NotNull ServiceError error){
        this.operationResult = false;
        this.errorMsg = error.getErrorMsg();
        this.errorCode = error.getErrorCode();
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
