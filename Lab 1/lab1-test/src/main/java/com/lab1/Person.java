package com.lab1;

public class Person {
	String name;
	String surname;
	public void sayHello() {
		System.out.println("Hello from Person");
	}
	
	public Person(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + "]";
	}

	
	
}
