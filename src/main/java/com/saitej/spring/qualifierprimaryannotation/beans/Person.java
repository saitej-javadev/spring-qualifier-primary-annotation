package com.saitej.spring.qualifierprimaryannotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String name;
	
	//@Qualifier("lamborghini")
	@Autowired
	private Car car;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + "]";
	}
	
	
	

}
