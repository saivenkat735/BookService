package com.demo.book_service.controller;

import java.util.List;

import com.demo.book_service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.book_service.model.Book;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return this.bookService.getAllBooks();
	}
	
	@GetMapping("/books/{bid}")
	public Book getABooks(@PathVariable int bid) {
		return this.bookService.getABooks(bid);
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book newBook) {
		return this.bookService.addBook(newBook);
	}
	
	@DeleteMapping("/books/{bid}")
	public void deleteBook(@PathVariable int bid) {
		this.bookService.deleteBook(bid);
	}
}
