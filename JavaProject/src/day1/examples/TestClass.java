package day1.examples;

import java.util.Properties;

public class TestClass {
	
	static Properties prop;
	
	
	TestClass()
	{
		System.out.println("constructor is fired");
		prop = new Properties();
		
	}
	
	static void myMethod()
	{
		
		System.out.println("I am in myMethod");
	}
	

}
