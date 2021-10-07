package com.lumen.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lumen.demo.pojo.Book;
import com.lumen.demo.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService service;
	
	@GetMapping("/books/{bookId}")
	public Book getBook(@PathVariable("bookId") int bookId) {
		return service.getBook(bookId);
	}
}
