package com.springcore.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = con.getBean("getStudent", Student.class);
//		System.out.println(student);
		student.study();
		con.close();
	}
}
