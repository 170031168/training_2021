package com.lumen.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lumen.demo.pojo.Book;

@Service
public class BookService {
	
	@Autowired
	private Book book;
	
	public Book getBook(int bookId) {
		if(bookId == 1)
			book = new Book(1,"Java","Nithish");
		
		else
			book = new Book(2,"C++","Naveen");
		return book;
	}
	
	
}
