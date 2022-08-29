package com.infoshareacademy.controller;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.repository.Books;
import com.infoshareacademy.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookcaseController {

    private final BookService bookService;

    public BookcaseController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> showBooks(){
        return bookService.showBooks();
    }

}
