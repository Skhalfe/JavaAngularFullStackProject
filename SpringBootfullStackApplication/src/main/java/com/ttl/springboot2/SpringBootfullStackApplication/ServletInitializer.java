package com.ttl.springboot2.SpringBootfullStackApplication;



import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



public class ServletInitializer extends SpringBootServletInitializer {



@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
System.out.println("Configure method called");
return application.sources(SpringBootfullStackApplication.class);
}



}