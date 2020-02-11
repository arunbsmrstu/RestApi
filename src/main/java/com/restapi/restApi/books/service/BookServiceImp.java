/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.books.service;



import com.restapi.restApi.books.dto.BookDto;
import com.restapi.restApi.books.entity.Book;
import com.restapi.restApi.books.payload.BookRequest;
import com.restapi.restApi.books.repository.BookRepository;
import com.restapi.restApi.util.misc.Utils;
import com.restapi.restApi.util.payload.ServiceResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Arun
 */
@Service
public class BookServiceImp implements BookService{
    
    @Autowired
    private Utils utils;
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookDto> addBook(BookRequest book) {
        List<BookDto> returnList= new ArrayList<>();
        BookDto returnValue= new BookDto();
        if(book!=null){
            Book bookObject = new Book();
            BeanUtils.copyProperties(book, bookObject);
            bookObject.setBookId(utils.generateBookId(10));
            bookObject=bookRepository.save(bookObject);
            BeanUtils.copyProperties(bookObject, returnValue);
            returnList.add(returnValue);
        }
        return returnList;
    }

    @Override
    public List<BookDto> updateBook(BookRequest book) {
        return null;
    }

    @Override
    public ServiceResponse deleteBook(Integer id) {
        return null;
    }

    @Override
    public List<BookDto> searchBook(BookDto book) {
        return  null;
    }

    @Override
    public List<BookDto> searchBookById(Integer id) {
        return null;
    }

    @Override
    public List<BookDto> searchBookByBookId(String bookId) {
        return null;
    }

    @Override
    public List<BookDto> getAllBook() {
        List<BookDto> returnList= new ArrayList<>();
        List<Book> bookList=bookRepository.findAll();
        for(Book book:bookList){
            BookDto bookDto= new BookDto();
            BeanUtils.copyProperties(book, bookDto);
            returnList.add(bookDto);
        }
        return returnList;
    }
   
}
