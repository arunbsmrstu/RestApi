/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.idm.service;

import com.restapi.restApi.idm.entity.User;
import com.restapi.restApi.idm.payload.UserReq;
import com.restapi.restApi.idm.payload.UserRes;
import com.restapi.restApi.idm.repository.UserRepository;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepoaitory;

    @Override
    public UserRes createUser(UserReq userReq) {
        UserRes returnValue= new UserRes();
        if(userReq!=null){
            User user=new User();
            BeanUtils.copyProperties(userReq, user);
            user=userRepoaitory.save(user);
            BeanUtils.copyProperties(user, returnValue);
        }
        return returnValue;
    }

    @Override
    public UserRes updateUser(UserReq user) {
        return null;
    }

    @Override
    public void deleteUser(UserReq user) {

    }

    @Override
    public UserRes getUserByEmail(String email) {
        return null;
    }

    @Override
    public UserRes getUserById(Integer id) {
        return null;
    }

    @Override
    public List<UserRes> getAllUser() {
        return null;
    }

    @Override
    public List<UserRes> searchUser(UserReq user) {
        return null;
    }

}
