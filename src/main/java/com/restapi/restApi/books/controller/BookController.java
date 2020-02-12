/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.books.controller;

import com.restapi.restApi.books.dto.BookDto;
import com.restapi.restApi.books.payload.BookRequest;
import com.restapi.restApi.books.payload.BookResponse;
import com.restapi.restApi.books.service.BookService;
import com.restapi.restApi.util.payload.ServiceResponse;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Arun
 */
@RestController
@RequestMapping("/book/")
public class BookController {
    @Autowired
    private BookService bookService;
    
    @PostMapping("create_book")
    public BookResponse addBook(@RequestBody BookRequest book){
        List<BookDto> returnList=bookService.addBook(book);
        return new BookResponse(returnList,returnList.size());
    }
    
     @PostMapping("update_book")
    public BookResponse updateBook(@RequestBody BookRequest book){
        List<BookDto> returnList=bookService.updateBook(book);
        return new BookResponse(returnList,returnList.size());
    }
    
    
    @DeleteMapping("delete_book")
    public ServiceResponse deleteBook(@RequestBody BookRequest book){
        ServiceResponse returnValue=bookService.deleteBook(book.getBookId());
        return returnValue;
    }
    
    @GetMapping("all_book")
    public BookResponse getAllBookList(){
        List<BookDto> returnList=bookService.getAllBook();
        return new BookResponse(returnList, returnList.size());
    }
    
}
