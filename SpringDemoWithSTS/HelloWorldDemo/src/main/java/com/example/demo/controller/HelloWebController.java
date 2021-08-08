/**************************************************************************
 * 
 * UC 2 : Create a Helloworld Spring App to display “Hello from 
 * 		  BridgeLabz” in a Web Page
 * 		 - Use MVC Controller to invoke a View i.e. HTML 
 * 		   when request is received and also pass Model to be displayed. 
 * 		 - Use Thymeleaf to display the Model
 * 
 * @author Krunal Lad
 * @since 08-08-2021
 * 
 ***************************************************************************/

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
		
	/**
	 * Purpose :@GetMapping annotation maps HTTP GET requests onto specific handler methods. 
	 * 			It is a composed annotation that acts as a shortcut for
	 * 		    @RequestMapping(method = RequestMethod.GET).
	 * 
	 * @return hello.html page
	 */
	@GetMapping("/web")
	public String hello() {
		return "hello";
	}
	
	/**
	 * Purpose : Here we have used ThymeLeaf to display the model
	 * 
	 * @param model
	 * @return message.html page
	 */
	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("message", "This is a custom message");
		return "message";
	}
	
}
