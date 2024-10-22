package com.demo.book_service.service;

import com.demo.book_service.dao.BookRepository;
import com.demo.book_service.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepo;
    public List<Book> getAllBooks() {
        return this.bookRepo.findAll();
    }

     public Book getABooks(int bid) {
        return this.bookRepo.findById(bid).get();
    }

   public Book addBook(Book newBook) {
        return this.bookRepo.saveAndFlush(newBook);
    }

    public void deleteBook(int bid) {
        this.bookRepo.deleteById(bid);
    }
}
