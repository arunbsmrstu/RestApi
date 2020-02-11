/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restapi.restApi.books.payload;

import com.restapi.restApi.books.dto.BookDto;
import com.restapi.restApi.util.payload.ServiceResponse;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class BookResponse extends ServiceResponse{
    private List<BookDto> bookList;
    private Integer totalBook;

    
    public BookResponse() {
    }
    
    public BookResponse(List<BookDto> bookList, Integer totalBook) {
        this.bookList = bookList;
        this.totalBook = totalBook;
    }

    public List<BookDto> getBookList() {
        return bookList;
    }

    public void setBookList(List<BookDto> bookList) {
        this.bookList = bookList;
    }

    public Integer getTotalBook() {
        return totalBook;
    }

    public void setTotalBook(Integer totalBook) {
        this.totalBook = totalBook;
    }

    public boolean isOperationResult() {
        return operationResult;
    }

    public void setOperationResult(boolean operationResult) {
        this.operationResult = operationResult;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
    
    

    
    
}
