package com.saoni.fun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        Bike bike = new Bike();
//        bike.drive();
    	    	
    	//Load all configuration from spring.xml
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");    	    
    	
//    	Vehicle obj = (Vehicle) context.getBean("bike");
//    	obj.drive();
    	
    	
    	
//    	Tyre tyre = (Tyre) context.getBean("tyre");
//    	System.out.println(tyre);
    	
    	
    	Car car = (Car)context.getBean("car");
    	car.drive();
    	    	
    }
}
