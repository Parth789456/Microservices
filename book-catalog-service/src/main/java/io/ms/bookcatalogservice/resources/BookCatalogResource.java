package io.ms.bookcatalogservice.resources;

import io.ms.bookcatalogservice.models.Book;
import io.ms.bookcatalogservice.models.CatalogItem;
import io.ms.bookcatalogservice.models.Rating;
import io.ms.bookcatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController //Basically, it'll handle all the upcoming request from the different API
@RequestMapping("/catalog") // First, endpoint. So, whenever it'll get call then it'll load up below data.
public class BookCatalogResource {

@RequestMapping("/hello")
public String gethello(String name)
{
    return "Hello";
}
   @Autowired
   private RestTemplate restTemplate; // It's saying that some bean have this restTemplate, find it and inject that thing into me .


        @RequestMapping("/{Userid}") //Second Endpoint, When catalog gets called it'll get map with Userid, that returns respective data. And curly braces indicates that it's variable
    public List<CatalogItem> getCatalog(@PathVariable("Userid") String Userid){
                                        //PathVariable helps to pass that particular variable to this method
                                        // RestTemplate restTemplate = new RestTemplate();

     UserRating ratings = restTemplate.getForObject("http://localhost:8084/ratingsdata/users/" + Userid, UserRating.class);
                                        // A badhi hard coded value of book koi user ni vancheli  che je ane and ene rate apiya che. atle jiyre e user na id
                                        // nu serach thay to a badhi movieid and enu rating display thay, Je e particular user kariyu chr

                 return ratings.getUserRating().stream().map(rating ->
                {
                                        //2. Badhi movie na id mate movie info service ne call kari details levani.
                    Book book;
                   // book = restTemplate.getForObject("http://localhost:8082/books/Mahabharata" , Book.class);
                   book = restTemplate.getForObject("http://localhost:8082/books/" + rating.getBookid(), Book.class);
                                        //3. Badha ne ek sathe bind karvana.
                                        // 4. chelle badha dekhashe.
                    return new CatalogItem(book.getBookname(), "A book, teaches the lesson to how to live the life",rating.getRating());
                })
                      .collect(Collectors.toList());

       // return Collections.singletonList(new CatalogItem("Mahabharata", "A book, teaches the lesson to how to live the life",4.5) );
    }
}
/* Steps
    1. pela badhi movie na id levana.
    2. Badhi movie na id mate movie info service ne call kari details levani.
    3. Badha ne ek sathe bind karvana.
    4. chelle badha dekhashe.
 */