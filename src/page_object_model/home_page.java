package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class home_page {

	WebDriver driver;
	
	public home_page(WebDriver driver) {
		
		this.driver= driver;
	}
	
	
	public WebElement gethome() {
		
	WebElement home = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
	
	return home;
	}
	
	
	
	public WebElement getcontact() {
		
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a"));
		
		return contact;
		}
		
	
	
public WebElement getabout_us() {
		
		WebElement about_us = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a"));
		
		return about_us;
		}
		
	
public WebElement getcart() {
	
	WebElement cart = driver.findElement(By.id("cartur"));
	
	return cart;
	}
	
	
public WebElement getlogin() {
	
	WebElement login = driver.findElement(By.id("login2"));
	
	return login;
	}
	
	
public WebElement getsignup() {
	
	WebElement signup = driver.findElement(By.id("signin2"));
	
	return signup;
	}
	
	
public WebElement getimage() {
	
	WebElement image = driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/div/div[3]/img"));
	
	return image;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

