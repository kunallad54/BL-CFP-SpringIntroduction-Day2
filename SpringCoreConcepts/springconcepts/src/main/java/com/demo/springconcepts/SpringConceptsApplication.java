/********************************************************************************************
 * 
 * Purpose : UC2 : Add Logger to Log Messages
 * 				   - Use Built In SLF4J – Simple Logging Framework
 * 
 * @author Krunal Lad
 * @since 08-08-2021
 * 
 *********************************************************************************************/
package com.demo.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.demo.springconcepts.component.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {
	
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);
	/**
	 *  Purpose : Printing the logging message based on the pattern provided in logback.xml
	 * 			  Since logger.debug is mentioned, so it will display the logging message from and above
	 * 			  the DEBUG level.
	 * 		
	 * @param args
	 */
	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concepts Demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println("Demo Bean = "+demoBean.toString());
		logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
		logger.debug("\n*** Example Using @Autowire annotation on property ***");
	}

}
