/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.payload.service;

import com.restapi.restApi.payload.Book;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Arun
 */
@Service
public class BookService {
    private static List<Book> books = new ArrayList<>();
  private static int idCounter = 0;

  static {
    books.add(new Book(++idCounter, "Head First Java", "Kathy Sierra, Bert Bates"));
    books.add(new Book(++idCounter, "Thinking in Java", " Bruce Eckel"));
    books.add(new Book(++idCounter, "Java: A Beginner's Guide", "Herbert Schildt"));
    books.add(new Book(++idCounter, "Head First Design Patterns","Kathy Sierra, Elisabeth Freeman"));
  }

  public List<Book> findAll() {
    return books;
  }
    
}
