/********************************************************************************************
 * 
 * Purpose : UC1 : Create a Project to learn Spring Concepts 
 * 		 		   Use Spring Initializer to Create Project 
 * 				   - Here Development is done using VS Code IDE(Spring Boot Extension Pack)
 * 				   - Note - Important to add the Dependencies and the Property in order to 
 * 							Start Spring Application
 * 
 * @author Krunal Lad
 * @since 08-08-2021
 * 
 *********************************************************************************************/
package com.demo.springconcepts;

import com.demo.springconcepts.component.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {
	
	/**
	 * Purpose : To verify that run method is internally called during launch of project and it returns data in 
	 * 			 form of IOC Container also known as Application Context ..It internally create objects for the class 
	 * 		
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Spring Concepts Demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println("Demo Bean = "+demoBean.toString());
	}

}
