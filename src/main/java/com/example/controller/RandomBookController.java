package com.infoshareacademy.controller;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomBookController {

    private final BookService bookService;

    public RandomBookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book-for-today")
    public Book showRandomBook(){
        return bookService.getRandomBook();
    }
}
