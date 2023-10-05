package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2c {

	public static void main (String[]args) throws InterruptedException {


System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\ananna barua\\Desktop\\workspace-eclipse\\driver\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		
		Thread.sleep(2000);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		WebElement username = driver.findElement(By.id("user-name"));
		
		username.sendKeys("performance_glitch_user");
		
		
         Thread.sleep(2000);
		
		  WebElement password = driver.findElement(By.id("password"));
				password.sendKeys("secret_sauce");
		
				Thread.sleep(2000);
				WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
				

               login.click();
				
				String getUrl = driver.getCurrentUrl();
				
				System.out.println(getUrl);
				
				String title = driver.getTitle();
				
				
				System.out.println(title);
				
		
		
	



}
}