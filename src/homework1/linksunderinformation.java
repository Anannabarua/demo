package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksunderinformation {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ananna barua\\Desktop\\workspace-eclipse\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		WebElement information = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/h4"));
		
		Thread.sleep(2000);
		
		WebElement specials = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[1]/a"));
		
		specials.click();
		
		String Url = driver.getCurrentUrl();
		
		System.out.println(Url);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		
		
		Thread.sleep(2000);
		
		WebElement newproducts = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[2]/a"));
		
		newproducts.click();
		
		String Url1 = driver.getCurrentUrl();
		
		System.out.println(Url1);
		
		String title1 = driver.getTitle();
		
		System.out.println(title1);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		
		
		Thread.sleep(2000);
		
		WebElement bestsellers = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[3]/a"));
		
		bestsellers.click();
		
        String Url2 = driver.getCurrentUrl();
		
		System.out.println(Url2);
		
		String title2 = driver.getTitle();
		
		System.out.println(title2);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		
		
		
		Thread.sleep(2000);
		
		WebElement ourstores = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[4]/a"));
		
		ourstores.click();
		
        String Url3 = driver.getCurrentUrl();
		
		System.out.println(Url3);
		
		String title3 = driver.getTitle();
		
		System.out.println(title3);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		
		
		
		Thread.sleep(2000);
		
		WebElement contactus = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[5]/a"));
		
		contactus.click();
		
		 String Url4 = driver.getCurrentUrl();
			
			System.out.println(Url4);
			
			String title4 = driver.getTitle();
			
			System.out.println(title4);
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		
		
		
			Thread.sleep(2000);
			
			WebElement termsandconds = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[6]/a"));
			
			termsandconds.click();
			
			String Url5 = driver.getCurrentUrl();
			
			System.out.println(Url5);
			
			String title5 = driver.getTitle();
			
			System.out.println(title5);
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		
		
		
			Thread.sleep(2000);
			
		    WebElement aboutus = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[7]/a"));
		
		aboutus.click();
		
		String Url6 = driver.getCurrentUrl();
		
		System.out.println(Url6);
		
		String title6 = driver.getTitle();
		
		System.out.println(title6);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
	
	
		
		Thread.sleep(2000);
		
		WebElement sitemap = driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[8]/a"));
		
		sitemap.click();
		
        String Url7 = driver.getCurrentUrl();
		
		System.out.println(Url7);
		
		String title7 = driver.getTitle();
		
		System.out.println(title7);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		
		

	}

}
