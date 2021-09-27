package com.springcore.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
  
    	ApplicationContext context =
    			 new ClassPathXmlApplicationContext("config.xml");
    	Student student = (Student) context.getBean("student");
    	Student student1 = (Student) context.getBean("student1");
    	System.out.println("student id "+student);
    	System.out.println("student id "+student1);
    	Student student3 = (Student) context.getBean("student3");
    	System.out.println("student id "+student3);
    }
}
