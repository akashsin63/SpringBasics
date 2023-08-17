package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext contexts =  new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		Employee emp1 = contexts.getBean("emp1",Employee.class);
		
		System.out.println(emp1);
	}

}
