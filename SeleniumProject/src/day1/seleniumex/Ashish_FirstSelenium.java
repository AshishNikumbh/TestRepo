package day1.seleniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ashish_FirstSelenium {

	public static void main(String[] args) throws InterruptedException {
		
/*		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

		ChromeDriver C1 = new ChromeDriver();

		C1.get("http://www.facebook.com");
		
		 System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");

		 FirefoxDriver F1=new FirefoxDriver();
		 
		 F1.get("http://www.bbc.com");
		
		


		 System.setProperty("webdriver.edge.driver", "D:\\selenium\\msedgedriver.exe");

		EdgeDriver IE1=new EdgeDriver();
		
		IE1.get("http://www.bbc.com");
		
		
		
		String path= System.getProperty("user.dir");

		System.out.println(path);

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

*/
		/*
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver F1 = new FirefoxDriver();

		F1.get("http://www.facebook.com");


		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver F1 = new FirefoxDriver();D:\\Development_Avecto\msedgedriver.exe*/


/*		String browser = "Fire";


		WebDriver driver = null;

		if(browser.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		}else if(browser.equals("IE"))
		{
		System.setProperty("webdriver.edge.driver", "E:\\selenium\\msedgedriver.exe");

		driver=new EdgeDriver();

		}else if(browser.equals("Fire"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");

		driver=new FirefoxDriver();

		}

		driver.get("http://www.bbc.com")*/;

		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();

		  driver.get("https://ui.freecrm.com");
		  driver.findElement(By.name("email")).sendKeys("ashish.nikumbh@gmail.com");
		  driver.findElement(By.name("password")).sendKeys("Arnav1234");
		  driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='main-nav']/a[3]/span")).click();
		  driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a/button")).click();
		
		  
	}

}
