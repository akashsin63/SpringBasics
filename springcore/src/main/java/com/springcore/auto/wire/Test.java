package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		Employee emp1 = context.getBean("emp1",Employee.class);
		
		System.out.println(emp1);
	}

}
