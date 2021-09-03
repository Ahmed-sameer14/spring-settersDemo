package com.vco.spring.setterdemo.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vco.spring.setterdemo.beans.Pen;


public class MainPen {

	public static void main(String[] args) 
	{
		// create a container
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		// 2.Get beans(s)
		
		Pen p = (Pen) context.getBean("Pen1");
		
		System.out.println("Pen p1---->"+p);
		
		// 3.close the container
		
		context.close();

	}

}
