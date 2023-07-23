package com.springcore;

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
        System.out.println( "Lets learn how to use Dependency injection" );
        //to use the student class we can create object of Student manually but here we will not do it as we will 
        //use spring IOC by providing spring config file
        
        ApplicationContext context =
        		new ClassPathXmlApplicationContext("config.xml");
        
        Student student1  = (Student)context.getBean("student1");
        
        System.out.println(student1);
    }
}
