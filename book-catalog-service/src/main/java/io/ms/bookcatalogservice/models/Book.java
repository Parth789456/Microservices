package io.ms.bookcatalogservice.models;

public class Book {


    private String Bookid;
    private String bookname;

    public Book() {
    }

    public Book(String Bookid, String bookname) {
        this.Bookid = Bookid;
        this.bookname = bookname;
    }



    public String getBookid() {
        return Bookid;
    }

    public void setBookid(String Bookid) {
        this.Bookid = Bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
}


