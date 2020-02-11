/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.util.enums;

/**
 *
 * @author ASUS
 */
public enum ErrorCode {
    GENERAL_ERROR,
    REQUIRED_PARAMETER_MISSING,
    REQUIRED_PARAMETER_INVALID,
    DUPLICATE_ENTRY,
    AUTHENTICATION_ERROR,
    SERVICE_ERROR,
    UNSPECIFIED_ERROR,
    SERVICE_NOT_IMPLEMENTED,
    DATA_NOT_FOUND,
    AUTHORIZATION_ERROR,
    FILE_GENERATED_FOR_PAYMENT_CYCLE
    ;

    public static ErrorCode getValue(int index) {
        try {
            return values()[index];
        } catch (Exception ex) {
            return GENERAL_ERROR;
        }
    }
    
}
