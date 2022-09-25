package io.ms.bookinfoservice.resources;

import io.ms.bookinfoservice.models.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookResources {

    @RequestMapping("/{Bookid}") // If you don't put curly braces then it'll take not value as variable and shows a white error page
    public Book getBook(@PathVariable("Bookid") String Bookid) {

        return new Book(Bookid,"bookname");
// Now we will configure the diffrent PORT number from application.properties file in (Project->src->resources.). In matter to not get conflict with the other running microservice on Port 8080
    }
}
