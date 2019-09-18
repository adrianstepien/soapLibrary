package com.stock.book.controller;

import com.adrianbooks.springsoap.gen.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BookEndpoint {

    private static final String NAMESPACE_URI = "http://www.adrianBooks.com/springsoap/gen";

    @Autowired
    public BookEndpoint() {
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addBookRequest")
    @ResponsePayload
    public AddBookResponse getBooks(@RequestPayload AddBookRequest request) {
        AddBookResponse response = new AddBookResponse();
        response.setRespCode(200);
        /*Book book = new Book();
        book.setId(1);
        book.setAuthors("J.R.R. Tolkien");
        book.setDescription("Ksiazka o pierscieniu");
        book.setTitle("Wladca pierscieni");
        response.setBook(book);*/

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBooksRequest")
    @ResponsePayload
    public GetBooksResponse getBooks(@RequestPayload GetBooksRequest request) {
        GetBooksResponse response = new GetBooksResponse();
        response.setBook(null);

        return response;
    }
}
