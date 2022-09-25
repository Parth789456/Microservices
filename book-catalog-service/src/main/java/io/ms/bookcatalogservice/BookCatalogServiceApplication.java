package io.ms.bookcatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication //this annotation tells that, is a spring boot application, which have options of auto config and so on, auto config is usefull to bning all the dependecies whhen the application strt to run
//@ComponentScan(basePackages = {"bookcatalogservice"})
//@ComponentScan(basePackages = {"models"})
//@ComponentScan(basePackages = {"io.ms.bookcatalogservice.models"})


public class BookCatalogServiceApplication {

	@Bean // It'll stay on top of the method & matches to the type of it. It'll find the type then inject it and then brings to that method.
	public RestTemplate getRestTemplate() // This method will return the answer, specified in this method. Autowired will hold this funtion and return it, This executes only once.
	{
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(BookCatalogServiceApplication.class, args);
	}

}
