package SeleniumPlusJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver","D:\\Personal\\Selenium files\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to(driver.getCurrentUrl());
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("abe");
		e.sendKeys(Keys.CONTROL+"A");
		e.sendKeys(Keys.BACK_SPACE);	

	}

}
