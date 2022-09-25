package io.ms.bookcatalogservice.models;

public class CatalogItem {
    private  String bookname;
    private  String description;
    private  double rating;

    public CatalogItem() {
    }

    public CatalogItem(String bookname, String description, double rating) {
        this.bookname = bookname;
        this.description = description;
        this.rating = rating;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
