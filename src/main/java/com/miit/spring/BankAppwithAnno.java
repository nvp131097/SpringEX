package com.miit.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//ONLY ANNOTATION
public class BankAppwithAnno {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Manager employee = context.getBean(Manager.class);
		
		employee.dowork();
		context.close();

	}

}
