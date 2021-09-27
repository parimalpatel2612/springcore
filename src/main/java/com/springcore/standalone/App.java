package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.demo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context =
    			 new ClassPathXmlApplicationContext("com/springcore/standalone/config.xml");
    	Person student = (Person) context.getBean("person", Person.class);
    	System.out.println(student);
    	System.out.println(student.getFriends().getClass().getName());
    }
}
