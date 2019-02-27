package edu.spring.dao.sample;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.config.AppConfig;
import edu.spring.dao.BookDao;
import edu.spring.dao.BookDaoImpl;
import edu.spring.dao.SampleBean;
import model.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	SampleBean s = context.getBean(SampleBean.class);
    	System.out.println("---------" + s.toString());
    	BookDao bookDao = (BookDao) context.getBean(BookDao.class);//Need understanding
    	List<Book> bookList1 = bookDao.getAllBooks();
    	bookList1.stream().forEach(book -> System.out.println(book));
    	context.close();
		/*
		 * bookDao.saveBook(new Book(5, "breaking bad"));
		 * 
		 * bookList = bookDao.getAllBooks(); bookList.stream().forEach(book ->
		 * System.out.println(book));
		 * 
		 * System.out.println("Enter book isbn to be updated"); Scanner sc = new
		 * Scanner(System.in); int n = sc.nextInt();
		 * 
		 * Book obj = bookDao.findByISBN(n); System.out.println("got this obj"+obj);
		 * 
		 * obj.setName("newName");
		 * 
		 * System.out.println("modified obj"+obj);
		 * 
		 * //bookDao.saveBook(obj); List<Book> bookList1 = bookDao.getAllBooks();
		 * bookList1.stream().forEach(book -> System.out.println(book));
		 */
    	
    	
    	

    }
}
