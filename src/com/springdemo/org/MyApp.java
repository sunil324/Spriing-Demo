package com.springdemo.org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
	
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Coach thecoach =context.getBean("myCoach", Coach.class);
	
	System.out.println(thecoach.getDailyworkout());
	context.close();
	}
}