package edu.spring.dao;

import java.util.List;

import model.Book;

public interface BookDao {
	public List<Book> getAllBooks();
	public Book findByISBN(int isbn);
	public Book findByName(String name);
	public void saveBook(Book book);
}
