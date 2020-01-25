package day1.seleniumex;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest123 {
  @Test
  public void Login() 
  {System.out.println("I am in Login");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am in beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am in AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am in beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am in AfterClass");
  }

}
