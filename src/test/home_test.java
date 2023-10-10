package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page_object_model.home_page;

public class home_test {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ananna barua\\Desktop\\workspace-eclipse\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		home_page hp = new home_page(driver);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		
		
		driver.get("https://www.demoblaze.com/index.html");
		
		Thread.sleep(2000);
		
		boolean home_displayed = hp.gethome().isDisplayed();
		
		System.out.println(home_displayed);
		
		Thread.sleep(2000);
		hp.getcontact().click();
		
		driver.getCurrentUrl();
		
		driver.navigate().back();
		
		
		
		
		Thread.sleep(2000);
		hp.getcart().click();
		
		driver.getCurrentUrl();
		
		driver.navigate().back();
		
		
		Thread.sleep(2000);
		hp.getlogin().click();
		
		driver.getCurrentUrl();
		
		driver.navigate().back();
		
		
		Thread.sleep(2000);
		hp.getsignup().click();
		
		driver.getCurrentUrl();
		
		driver.navigate().back();
		
		
		Thread.sleep(2000);
		boolean image_displayed= hp.getimage().isDisplayed();
		
		System.out.println(image_displayed);
		
		
		driver.quit();
		
	}

}
