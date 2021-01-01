package com.saoni.fun;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	private String brand;

//	We can assign values to properties (like brand over here) of a class object using:
//	i) Using default values in bean definition in spring.xml
//	ii) Setters - setter injection
//	iii) constructors - constructor injection
	
//	public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
//		return "Tyre [brand=" + brand + "]";
		return "Tyre is rotating";
	}

}
