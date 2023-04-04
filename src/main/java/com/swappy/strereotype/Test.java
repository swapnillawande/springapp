package com.swappy.strereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/swappy/strereotype/config.xml");
		Student student = context.getBean("st",Student.class);
		
		System.out.println(student.toString());
	}

}
