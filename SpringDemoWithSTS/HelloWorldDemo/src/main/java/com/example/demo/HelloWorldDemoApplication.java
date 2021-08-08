/**
 * Purpose : Create a Helloworld Spring App to 
 * 			 display “Hello from BridgeLabz”
 * 			 using STS
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
