/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.util.misc;

import java.security.SecureRandom;
import java.util.Random;
import org.springframework.stereotype.Component;

/**
 *
 * @author ASUS
 */
@Component
public class Utils {
    private final Random RANDOM= new SecureRandom();
    private final String ALPHABET="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private final String NUMBER="0123456789";
    
    public  String  generateBookId(int length){
        return generateRandomNumberString(length);
    }
    
    
    public String generatedUserId(int length){
        return generateRandomString(length);
    }
    
    
    private String generateRandomNumberString(int length){
        StringBuilder reaturnValue= new StringBuilder(length);
        
        for(int i=0;i<length;i++){
            reaturnValue.append(NUMBER.charAt(RANDOM.nextInt(NUMBER.length())));
        }
        
        return new String(reaturnValue);
    }
    
    private String generateRandomString(int length){
        StringBuilder reaturnValue= new StringBuilder(length);
        
        for(int i=0;i<length;i++){
            reaturnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        
        return new String(reaturnValue);
    }
    
}
