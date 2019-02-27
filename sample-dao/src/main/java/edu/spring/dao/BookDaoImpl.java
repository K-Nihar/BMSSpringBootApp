package edu.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import model.Book;
@Component
public class BookDaoImpl implements BookDao{
	JdbcTemplate jdbcTemplate;
	List<Book> bookList = new ArrayList<Book>(); 
	
	
	public BookDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		/*
		 * Collections.addAll(bookList, new Book(1,"Harry Potter"), new
		 * Book(2,"5 am Club"), new Book(3,"Becoming Michelle Obama") );
		 */
	}

	public List<Book> getAllBooks() {
		return jdbcTemplate.query("select * from books;", (ResultSetExtractor<List<Book>>) rs -> {
			List<Book> bookList = new ArrayList<>();
			Book book;
			while(rs.next()) {
				book = new Book(rs);
				bookList.add(book);
			}
			return bookList;
		});
	}

	public Book findByISBN(int isbn) {
		return bookList.stream().filter(book  -> book.getISBN()==isbn).findAny().orElse(null);
	}

	public Book findByName(String name) {
		return bookList.stream().filter(book  -> name.equals(book.getName())).findAny().orElse(null);
	}

	@Override
	public void saveBook(Book book) {
		bookList.add(book);
	}
}
