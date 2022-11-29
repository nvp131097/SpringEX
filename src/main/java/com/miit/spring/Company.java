package com.miit.spring;

import org.springframework.stereotype.Component;

@Component
public class Company {
	
	private String cname;

	public String getName() {
		return cname;
	}

	public void setName(String name) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Company [cname=" + cname + "]";
	}
	
	

}
