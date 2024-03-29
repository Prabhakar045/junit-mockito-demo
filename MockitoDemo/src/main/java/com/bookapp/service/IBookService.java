package com.bookapp.service;

import java.util.List;

import com.bookapp.model.Book;

public interface IBookService {

	List<Book> getByAuthor(String author);
	List<Book> getByLessPrice(Double proce);
	Book getById(int bookId);
	
}
