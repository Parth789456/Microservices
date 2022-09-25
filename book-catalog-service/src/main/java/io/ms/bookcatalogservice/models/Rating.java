package io.ms.bookcatalogservice.models;

public class Rating {

    private String Bookid;
    private  double rating;

    public Rating()
    {

    }

    public Rating(String Bookid, double rating) {
        this.Bookid = Bookid;
        this.rating = rating;
    }

    public String getBookid() {
        return Bookid;
    }

    public void setBookid(String Bookid)
    {
        this.Bookid = Bookid;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating)
    {
        this.rating = rating;
    }
}
