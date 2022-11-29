package com.miit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//with Annotation and Xml File(Hybrid)
public class BankAppwithXML {
	
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		//with Annotation and Xml File
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = (Employee) context.getBean("manager");
		
		e.dowork();
		
		
	}

}
