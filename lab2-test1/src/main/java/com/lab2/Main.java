package com.lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/beans/beans.xml");
		World w = (World) context.getBean("worldBean");
		w.helloWorld();

	}

}
