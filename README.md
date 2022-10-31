# Microservices

In this project, I have established synchronous communication between multiple services.

  To make these services I used - 
  Technology – Spring Boot, IntelliJ and Language – Java
  
In this project, there are 3 services, and each service has its own functionality to perform.
  
  1. book-catalog-service is main service since it is responsible to call other services. And after establishing the connection with a couple of other services, it is        combining the output and displays it on the browser. Models contain the getters and setters information and Resources contains the Main file -                            https://github.com/Parth789456/Microservices/blob/main/book-catalog-service/target/classes/io/ms/bookcatalogservice/resources/BookCatalogResource.class 
  
  2. rating-data-service, will display the information of book id and ratings. Whereas information in resources and model packages remains the same                            https://github.com/Parth789456/Microservices/tree/main/ratings-data-service/target/classes/io/ms/ratingsdataservice

  3. book-info-service, will bring the information of book id and book name. Whereas information in resources and model packages remains the same 
     https://github.com/Parth789456/Microservices/tree/main/book-info-service/target/classes/io/ms/bookinfoservice
