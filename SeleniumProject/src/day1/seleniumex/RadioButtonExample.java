package day1.seleniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");	
		
	System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		
		
		
		int count = driver.findElements(By.xpath("//input[@type='radio']")).size();
		
		for(int i=0;i<count;i++)
		
		{
			//driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value"));
			
		String text = driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value");
		
		if(text.equals("1"))
		{
			driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
		}
		
	
		
		}
			
			
			
		
			//driver.findElement(By.xpath("//*[@id='oneWay']/form/div[1]/div/div/ul/li[2]/div/div[1]")).click();
		
	}

	
	
}
