package com.iyad.singleton;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

		obj.setMessage("I am obj A");
		obj.getMessage();
		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");

		objB.getMessage();
	}
}
