/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.idm.service;

import com.restapi.restApi.idm.entity.User;
import com.restapi.restApi.idm.payload.UserReq;
import com.restapi.restApi.idm.payload.UserRes;
import java.util.List;

/**
 *
 * @author Arun
 */
public interface UserService {
   public UserRes createUser(UserReq user);
   public UserRes updateUser(UserReq user);
   public void deleteUser(UserReq user);
   public UserRes getUserByEmail(String email);
   public UserRes getUserById(Integer id);
   public List<UserRes> getAllUser();
   public List<UserRes> searchUser(UserReq user);
   
}
