package com.miit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee{
	
	@Override
	public void dowork() {
		System.out.println("Manager the branch office...");
		
	}

}
