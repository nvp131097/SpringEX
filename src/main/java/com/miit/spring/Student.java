package com.miit.spring;

public class Student {
	
//	public Student(String name) {
//		super();
//		this.name = name;
//	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void info()
	{
		System.out.println("Hello "+name);
	}

}
