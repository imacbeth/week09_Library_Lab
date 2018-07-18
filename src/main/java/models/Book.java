package models;

public class Book {

 private int id;
 private String title;
 private String author;
 private boolean onLoan;

    public Book() {
    }

    public Book(String title, String author, boolean onLoan) {
        this.title = title;
        this.author = author;
        this.onLoan = onLoan;
    }


}
