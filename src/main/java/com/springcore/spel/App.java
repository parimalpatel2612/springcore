package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

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
    			 new ClassPathXmlApplicationContext("com/springcore/spel/auto_config.xml");
    	Demo std = context.getBean("demo", Demo.class);
    	System.out.println(std);
    	
    	
    	SpelExpressionParser spel = new SpelExpressionParser();
    	Expression ex = spel.parseExpression("34-3+2");
    	System.out.println(ex.getValue());
    }
}
