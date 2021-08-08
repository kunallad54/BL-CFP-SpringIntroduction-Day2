/**
 * UC 2 : Create a Helloworld Spring App to display “Hello from 
 * 		  BridgeLabz” in a Web Page
 * 		 - Use MVC Controller to invoke a View i.e. HTML 
 * 		   when request is received and also pass Model to be displayed. 
 * 		 - Use Thymeleaf to display the Model
 * 
 * @author Krunal Lad
 * @since 08-08-2021
 */
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello from BridgeLabz");
		SpringApplication.run(HelloWorldDemoApplication.class, args);
	}

}
