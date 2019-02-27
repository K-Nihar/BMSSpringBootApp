package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Book {
	
	private int ISBN;
	private String name;
		
	public Book(ResultSet rs) {
		super();
		try {
			this.ISBN = rs.getInt("isbn");
			this.name = rs.getString("name");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Book(int isbn, String bookName) {
		this.ISBN = isbn;
		this.name= bookName;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return ISBN+" "+name;
	}
}
