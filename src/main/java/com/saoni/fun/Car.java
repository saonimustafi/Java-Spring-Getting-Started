package com.saoni.fun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
//	The Autowired annotation sees that if we need a tyre, it goes to the spring.xml 
//	and resolves the class (from annotation/xml based configuration - whatever is used)
	@Autowired
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() {		
		System.out.println("Car is running " + tyre);
//		"tyre" over here will call the toString method of the Tyre class
	}

}
