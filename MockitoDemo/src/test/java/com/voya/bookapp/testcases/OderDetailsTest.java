package com.voya.bookapp.testcases;


import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.function.ThrowingRunnable;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import com.bookapp.service.OrderDetails;
import com.voya.bookapp.exception.BookNotFoundException;


@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
class OderDetailsTest {
	
	@Mock
	IBookService bookService;
	
	@InjectMocks
	OrderDetails orderDetails;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	
	List<Book> bookList;
	Book book1, book2, book3, book4, book5,book6;

	@BeforeEach
	void setUp() throws Exception {
//		orderDetails = new OrderDetails();
		book1 = new Book("bjava","kathy",1,2000);
		book2 = new Book("e","kathy",2,1500);
		book4 = new Book("cnode","kathy",4,1000);
		book5 = new Book("astotty","kathy",5,1200);
		book6= new Book("djava2","kathy",6,1200);
		
		bookList = Arrays.asList(book1,book2,book4,book5,book6);
	}

	@AfterEach
	void tearDown() throws Exception {
		orderDetails=null;
	}

	@Test
	void testShowBooks() {
		String author = "kathy";
		List<Book> booksByAuthor= Arrays.asList(book1,book2, book4, book5, book6);
		//calling method using proxy andassuming that we got 
		Mockito.when(bookService.getByAuthor(author)).thenReturn(booksByAuthor);
		
		List<Book> expected = Arrays.asList(book5, book1,book4,book6,book2);
		List<Book> actual = orderDetails.showBooks(author);
		assertEquals(expected,actual);
	}
	
	@Test
	void testShowNOBooks() {
		String author = "joe";

		//calling method using proxy andassuming that we got 
		Mockito.when(bookService.getByAuthor(author)).thenReturn(new ArrayList<>());
		
	//	assertThrows(BookNotFoundException.class, () -> orderDetails.showBooks(author));
		
		assertThrows(BookNotFoundException.class, () -> orderDetails.showBooks(author));
		
	}
	
	@Test
	void testExShowBooks() {
		String author = "kathy";

		//calling method using proxy andassuming that we got 
		Mockito.when(bookService.getByAuthor(author)).thenReturn(new ArrayList<>());
		
	//	assertThrows(BookNotFoundException.class, () -> orderDetails.showBooks(author));
		
		assertThrows(BookNotFoundException.class, () -> orderDetails.showBooks(author));
		

	}
	

}
