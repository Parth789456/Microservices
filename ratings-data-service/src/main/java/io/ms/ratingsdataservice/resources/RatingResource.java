package io.ms.ratingsdataservice.resources;


import io.ms.ratingsdataservice.models.Rating;
import io.ms.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{Bookid}")
    public Rating getRating(@PathVariable("Bookid") String Bookid)
    {

        return new Rating(Bookid, 4.5);
    }
    @RequestMapping("users/{Userid}")
    public UserRating getUserRating(@PathVariable("Userid") String Userid)
    {
        List<Rating> ratings = Arrays.asList(
                        new Rating("2",4.3),
                        new Rating("3",3.9),
                        new Rating("4",3.2)
        );

        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;

    }
}
