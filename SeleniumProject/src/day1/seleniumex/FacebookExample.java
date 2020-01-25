package day1.seleniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();

		  //driver.get("https://www.facebook.com");
		  
		 
		/* 
		  driver.findElement(By.name("email")).sendKeys("HelloAshish");
		  driver.findElement(By.name("pass")).sendKeys("PassAshish");
		  driver.findElement(By.id("u_0_b")).click();*/
		 
		  //driver.findElement(By.linkText("Forgotten account?")).click();

		 /* driver.findElement(By.cssSelector("input#email.inputtext.login_form_input_box")).sendKeys("HelloAshishNikumbh");
		 
		  //driver.findElement(By.xpath("//*[@id='email']")).sendKeys("HelloAshishNikumbh");
		  driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("HelloAshishNikumbh");
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		*/
		 
		  //driver.findElement(By.xpath("//*[@id='pageFooter']/div/ul/li[8]/a")).click();
		  
		  //Sign up button 
		 
		  //driver.findElement(By.xpath("//*[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
		 
		 
		  //driver.findElement(By.xpath("//*[@id='reg_form_box']/div[10]/button")).click();
		 
		//*[@id='reg_form_box']/div[10]/button
		//*[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']

		 
		//*[@id='pageFooter']/div/ul/li[5]/following-sibling::li[11]/a  
		 
		// driver.findElement(By.xpath("//*[@id='pageFooter']/div/ul/li[10]/following-sibling::li[11]/a")).click();

		/* */
		 
		 //driver.get("https://www.spicejet.com");
		 
		  /*driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 
		  driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[2]/a")).click();
		 
		  driver.findElement(By.xpath("(//*[@id='dropdownGroup1']/div/ul[3]/li[11]/a)[2]")).click();

		  driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[1]/td[5]/a")).click();
		  Thread.sleep(2000);
		 
		  driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		 
		 
		  System.out.println(driver.findElements(By.className("ui-state-default")).size());
		 
		  int count = driver.findElements(By.className("ui-state-default")).size();
		 
		  for(int i = 0; i< count; i++)
		  {
		 
		 String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
		 
		 //22 Oct
		 if(text.equals("22"))
		 {
		 driver.findElements(By.className("ui-state-default")).get(i).click();
		 break;
		 }
		 
		 
		 
		 
		  }
		 */
		 
		 
		 
		 
		/*driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for(int i =0; i<4;i++)  
		{
		 driver.findElement(By.id("hrefIncAdt")).click();
		}

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.findElement(By.id("btnclosepaxoption")).click();

		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));

		s.selectByIndex(1);
		s.selectByValue("USD");*/
		 
		//driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		  driver.get("https://ui.freecrm.com");
		  driver.findElement(By.name("email")).sendKeys("ashish.nikumbh@gmail.com");
		  driver.findElement(By.name("password")).sendKeys("Arnav1234");
		  driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		  System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Ashish Nikumbh')]")).getText());
		  
	}

}
