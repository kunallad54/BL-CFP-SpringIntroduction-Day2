/**************************************************************************************************
 * 
 * UC3 : Create a Helloworld Spring App to display “Hello from BridgeLabz” in REST Call
 * 		 - Use REST Controller to respond to the REST
 * 			
 * 		RestController is a Spring annotation that is used to build REST API in a declarative way.
 * 	    RestController annotation is applied to a class to mark it as a request handler, 
 * 		and Spring will do the building and provide the RESTful web service at runtime Request.
 *
 * @author Krunal Lad
 * @since 08-08-2021
 * 
 **************************************************************************************************/
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	/**
	 * Purpose : The @RequestMapping annotation can be applied to class-level
	 * 			 and/or method-level in a controller. The class-level annotation
	 * 			 maps a specific request path or pattern onto a controller. You can then
	 * 			 apply additional method-level annotations to make mappings more specific 
	 * 			 to handler methods
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "Hello from BridgeLabz";
	}
}
