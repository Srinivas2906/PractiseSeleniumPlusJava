package SeleniumPlusJava;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class AmazonTest {
	WebDriver driver ;
	@SuppressWarnings("deprecation")
//	@BeforeMethod
//	public void launchHome()
//	{
//		System.setProperty("webdriver.chrome.driver","D:\\Personal\\Selenium files\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://www.amazon.in/");
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		String expected = driver.getTitle();
//		String actual = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
//		Assert.assertEquals(expected, actual);
//		
//	}
	
	@Test
	public void faceBook() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Personal\\Selenium files\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('firstname').value='abc'");
		String name= (String)js.executeScript("return document.getElementsByName('firstname').value");
		System.out.println(name);
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select sel = new Select(day);
		List<WebElement> days = sel.getOptions();
		sel.selectByValue("10");
		
		for(int i=0;i<days.size();i++)
		{
			String s =days.get(i).getText();
			System.out.println(s);
		}
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select sel1 = new Select(month);
		List<WebElement> months = sel1.getOptions();
		//sel1.selectByValue("May");
		Iterator<WebElement> monthNames = months.iterator();
		String actMonth = monthNames.toString();
		while(monthNames.hasNext())
		{
			monthNames.next();
			if(actMonth.equalsIgnoreCase("May"))
			{
				sel1.selectByVisibleText("May");
			}
		}
	}
	
	@Test(enabled=false)
	public void searchBox()
	{
		WebElement serachBox=driver.findElement(By.id("twotabsearchtextbox"));
		serachBox.click();
		serachBox.sendKeys("apple");
		WebElement hoverSignin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions action = new Actions(driver);
		action.moveToElement(hoverSignin);
		driver.findElement(By.xpath("//span[contains(text(),'Create a Wish List')]")).click();
		
	}
		@Test(priority=2,dependsOnMethods="fibnocci")
		public void leapYear()
		{
			int leapYear =2008;
			boolean leap = false;
			
			if(leapYear%4==0){
				if(leapYear%100==0){
					if(leapYear%400==0)
						leap=true;
					else
						leap=false;
				}
				else
					leap=true;
			}	else
				leap=false;
			if(leap)
			{
				System.out.println(leapYear+"is a leap year");
			}
			else
			{
				System.out.println(leapYear+"is not a leap year");
			}
		}
			
	
			@Test(priority=1)
			public void fibnocci()
			{
				int num=4;
				int i=1;
				int temp=1;
				while(i<=4)
				{
					
					temp=temp*i;
					i++;
				}
				
				System.out.println(temp);
			}
			@Test
			public void primeNum()
			{
				
			}
			@Test
			public void desiredCap()
			{
				DesiredCapabilities sslcert = DesiredCapabilities.chrome();
				sslcert.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				driver.findElement(By.id("ahk/[position()=4]"));
			}
			@AfterTest
			public void tearDown() throws InterruptedException
			{
				Thread.sleep(5000);
				driver.quit();
			}
			
}
		

