package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ananna barua\\Desktop\\workspace-eclipse\\driver\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://login.yahoo.com/account/create");
		
		
		Thread.sleep(2000);
		WebElement Helplink = driver.findElement(By.linkText("Help"));
		
		Helplink.click();
		
		String HelppageUrl =driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(HelppageUrl);
		System.out.println(title);
		
		
		WebElement FAQbutton = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[1]/a"));
		
		boolean FAQdisplay = FAQbutton.isDisplayed();
		
		System.out.println(FAQdisplay);
		
		String text1 = FAQbutton.getText();
		
		System.out.println(text1);
		
		
		WebElement Passwordandsignin = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[2]/a"));
		
		boolean Passsignindisplay = Passwordandsignin.isDisplayed();
		
		System.out.println(Passsignindisplay);
		
		String text2 = Passwordandsignin.getText();
		
		System.out.println(text2);
		
		
		WebElement Accountkey = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[3]/a"));
		
		boolean Accountkeydisplay = Accountkey.isDisplayed();
		
		System.out.println(Accountkeydisplay);
		
		String text3 = Accountkey.getText();
		
		System.out.println(text3);
		
		
		WebElement Accountsecurity = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[4]/a"));
		
		boolean accountsecdisplay = Accountsecurity.isDisplayed();
		
		System.out.println(accountsecdisplay);
		
		String text4 = Accountsecurity.getText();
		
		System.out.println(text4);
		
		
		WebElement createordelete = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[5]/a"));
		
		boolean createdisplay = createordelete.isDisplayed();
		
		System.out.println(createdisplay);
		
		String text5 = createordelete.getText();
		
		System.out.println(text5);
		
		
		WebElement manage = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[6]/a"));
		
		boolean managedisplay = manage.isDisplayed();
		
		System.out.println(managedisplay);
		
		String text6 = manage.getText();
		
		System.out.println(text6);
		
		
		WebElement Accessibility = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[7]/a"));
		
		boolean accessibilitydisplay = Accessibility.isDisplayed();
		
		System.out.println(accessibilitydisplay);
		
		String text7 = Accessibility.getText();
		
		System.out.println(text7);
		
		
		WebElement policy = driver.findElement(By.xpath("//*[@id=\"pltpcs\"]/ul/li[8]/a"));
		
		boolean policydisplay = policy.isDisplayed();
		
		System.out.println(policydisplay);
		
		
		String text8 = policy.getText();
		
		System.out.println(text8);
		
		
		

	}

}
