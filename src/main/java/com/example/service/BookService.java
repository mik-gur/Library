package com.infoshareacademy.service;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.repository.Books;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class BookService {

    private final Books books;

    public BookService(Books books) {
        this.books = books;
    }

    public List<Book> showBooks(){
        return books.getBooks();
    }

    public Book getRandomBook(){
        Random random = new Random();
        return books.getBooks().stream()
                .skip(random.nextInt(showBooks().size()))
                .findFirst().get();
    }

    public List<Book> getBooksContainingInTitle(String title) {
        return books.getBooks().stream()
                .filter(book -> book.getTitle().toUpperCase().contains(title.toUpperCase()))
                .toList();
    }
}
