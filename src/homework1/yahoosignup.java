package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoosignup {

	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\ananna barua\\Desktop\\workspace-eclipse\\driver\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://login.yahoo.com/account/create");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		WebElement firstname = driver.findElement(By.id("usernamereg-firstName"));
		
		firstname.sendKeys("Ananna");
		
		
         Thread.sleep(2000);
		
		  WebElement lastname = driver.findElement(By.id("usernamereg-lastName"));
		
		lastname.sendKeys("Barua");
		
		
		Thread.sleep(2000);
		
		
		
      WebElement emailaddress = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
		
		emailaddress.sendKeys("ananna.bgc");
		
		
		
		
		 Thread.sleep(2000);
			
		  WebElement password = driver.findElement(By.id("usernamereg-password"));
				  
		password.sendKeys("1254665");
		
		
		
		
		 Thread.sleep(2000);
			
		  WebElement phonenum = driver.findElement(By.xpath("//*[@id=\"usernamereg-phone\"]"));
				  
		phonenum.sendKeys("125426665");
		
		
		
		
		
		 Thread.sleep(2000);
			
		  WebElement phonenumber = driver.findElement(By.xpath("//*[@id=\"usernamereg-phone\"]"));
				  
		phonenumber.sendKeys("125426665");
		
		
		
		
		
		 Thread.sleep(2000);
			
		  WebElement continuebutton = driver.findElement(By.id("reg-submit-button"));
				  
		  continuebutton.click();
		  
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
