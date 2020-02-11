/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.books.dto;

/**
 *
 * @author ASUS
 */
public class BookDto {
    
    private String bookId;
    private String name;
    private String authors;
    private String description;

    public BookDto() {
    }

    public BookDto( String bookId, String name, String authors, String description) {
        this.bookId = bookId;
        this.name = name;
        this.authors = authors;
        this.description = description;
    }
    
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
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
