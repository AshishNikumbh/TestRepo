package day1.seleniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelFirstClass {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
/*	//driver.get("http://practice.teachmeselenium.com");
	driver.get("http://practice.teachmeselenium.com");
	WebElement searchbox = driver.findElement(By.name("s"));
	searchbox.sendKeys("OnePlus 5");
	driver.findElement(By.className("bgs-search-submit")).click();
	
	String price = driver.findElement(By.className("price")).getText();
	
	System.out.println("The price of phone is"+ price);
	driver.findElement(By.name("add-to-cart")).click();
	
	driver.findElement(By.linkText("View cart")).click();*/
	driver.get("https://facebook.com");
	
	/*driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("HelloAshish");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("xxxxx");
	driver.findElement(By.cssSelector("input[value*='Log In']")).click();
	
	System.out.println(driver.findElement(By.cssSelector("div[id='error']")).getText()); 
	*/

	driver.findElement(By.xpath("//*[@id='pageFooter']/div/ul/li[5]/following-sibling::li[11]/a")).click();
	
	
	//driver.quit();
	
	
	
	
	

	
		
	
		
		
		
	}

}
