package com.infoshareacademy.controller;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindBookController {

    private final BookService bookService;

    public FindBookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/book/{title}/search")
    public List<Book> getBookByTitle(@PathVariable String title){
        return bookService.getBooksContainingInTitle(title);
    }
}
