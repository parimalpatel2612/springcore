package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Somosa {
	public void display() {
		System.out.println("Price is very high");
	}

	public Somosa() {
		System.out.println("Called");
	}
	
	
}
