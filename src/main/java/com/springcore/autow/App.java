package com.springcore.autow;

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
    			 new ClassPathXmlApplicationContext("com/springcore/autow/auto_config.xml");
    	Emp student = (Emp) context.getBean("emp", Emp.class);
    	System.out.println(student);
    }
}
