package com.restapi.restApi.geo.repository;


import com.restapi.restApi.geo.entity.Upazila;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpzilaRepository extends JpaRepository <Upazila,Integer>{
    
}
