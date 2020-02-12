/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.books.service;

import com.restapi.restApi.books.dto.BookDto;
import com.restapi.restApi.books.payload.BookRequest;
import com.restapi.restApi.util.payload.ServiceResponse;
import java.util.List;


public interface BookService {
    public List<BookDto> addBook(BookRequest book);
    public List<BookDto> updateBook(BookRequest book);
    public ServiceResponse deleteBook(String bookId);
    public List<BookDto> searchBook(BookDto book);
    public List<BookDto> searchBookById(Integer id);
    public List<BookDto> searchBookByBookId(String bookId);
    public List<BookDto> getAllBook();
}
