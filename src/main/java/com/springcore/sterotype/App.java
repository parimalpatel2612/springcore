package com.springcore.sterotype;

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
    			 new ClassPathXmlApplicationContext("com/springcore/sterotype/auto_config.xml");
    	Student std = context.getBean("student", Student.class);
    	System.out.println(std.hashCode());
    	Student std1 = context.getBean("student", Student.class);
    	System.out.println(std1.hashCode());
    }
}
