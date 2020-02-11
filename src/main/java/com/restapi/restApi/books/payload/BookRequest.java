/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.books.payload;

import java.io.Serializable;

/**
 *
 * @author Arun
 */
public class BookRequest implements Serializable{
    private int id;
    private String name;
    private String authors;
    private String description;

    public BookRequest() {
    }

    public BookRequest(int id, String name, String authors, String description) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
    
}
