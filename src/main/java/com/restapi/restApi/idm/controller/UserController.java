/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.idm.controller;

import com.restapi.restApi.idm.payload.UserReq;
import com.restapi.restApi.idm.payload.UserRes;
import com.restapi.restApi.idm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;
    
    @PostMapping("create")
    public UserRes createUser(@RequestBody UserReq user){
        UserRes res=userService.createUser(user);
        return res;
    }
    
}
