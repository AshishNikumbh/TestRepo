package day1.seleniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticMenuProg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByIndex(2);
		s.selectByValue("5");
		s.selectByVisibleText("4");
		
		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s1.selectByValue("2");
		
		/*driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	
		driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[3]/a")).click();
		//driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("(//*[@id='dropdownGroup1']/div/ul[3]/li[8]/a)[2]")).click();
		*/
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		
	}

}
