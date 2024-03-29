package com.bookapp.model;

public class Book {

	private String title;
    private String author;
    private int bookId;
    private double price;

    public Book() {
    }

    public Book(String title, String author,  int bookId, double price) {
        this.title = title;
        this.author = author;
      
        this.bookId = bookId;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

   

    public int getBookId() {
        return bookId;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

  
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
               
                ", bookId=" + bookId +
                ", price=" + price +
                '}';
    }
}
