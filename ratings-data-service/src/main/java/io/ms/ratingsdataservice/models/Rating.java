package io.ms.ratingsdataservice.models;

public class Rating {

    private String Bookid;
    private  double rating;

    public Rating(String bookid, double rating) {
        this.Bookid = bookid;
        this.rating = rating;
    }

    public String getBookid() {
        return Bookid;
    }

    public void setBookid(String bookid) {
        Bookid = bookid;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
