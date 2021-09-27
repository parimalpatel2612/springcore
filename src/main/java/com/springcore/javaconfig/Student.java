package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

//@Bean
public class Student {
	
	@Autowired
	private Somosa samosa;
	
	
	public void study() {
		samosa.display();
		System.out.println("student study");
	}


	public Somosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Somosa samosa) {
		this.samosa = samosa;
	}


	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}
	
	
}
