package InterviewPrep;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;



public class Waits {

	public static void main(String[] args) throws IOException {
		String s= "12";
		String s12= "abc";
		System.out.println(s.concat(s12));
		StringBuffer sb = new StringBuffer(s12);
		StringBuffer sb1 = new StringBuffer(s);
		System.out.println(sb.append(sb1));
		System.out.println(sb.append(s));
		int i = Integer.parseInt(s);
		System.out.println(i);

		System.setProperty("webdriver.chrome.driver","D:\\Personal\\Selenium files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		
		

		
	driver.navigate().to("https://www.google.com/");
	
		Dimension d = new Dimension(800,800);
		driver.manage().window().setSize(d);
		WebElement search =driver.findElement(By.xpath("//input[@title='Search']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='abc';",search);
		WebElement a = driver.findElement(By.linkText("Gmail"));
		
		String link =a.getAttribute("href");
		String css = a.getCssValue("background-color");

		String css1 = a.getCssValue("font-size");
		
String tag=		a.getTagName();
System.out.println(link+"\n"+css+"\n"+css1+"\n"+tag);
		
		String ac = driver.getTitle();
		System.out.println(ac);
		String ex = "Goodle";
		SoftAssert sf = new SoftAssert();
		sf.assertEquals("goo", ac);
		//Assert.assertTrue(false,"test case failed");
		if(ac.equalsIgnoreCase(ex))
		{
			System.out.println("matched");
		}
		else{
			System.out.println("not matched");
		}
		//Assert.assertEquals("Googl", ac);
		
	String s1= driver.getCurrentUrl();
		System.out.println(s1);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f= ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C://Users//Indium Software//OneDrive//Desktop//ss//.png"));
	
		
		driver.close();
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//Select sel = new Select(a);
//Actions aca = new Actions(driver);
	
	
	}
	/*
public void meth1(){

	WebElement ex = driver.findElement(By.id("D"));
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("*")));
//	
//	Wait wait = new FluentWait<WebDriver>(driver)
//			.withTimeout(50, TimeUnit.SECONDS)
//			.pollingEvery(3, TimeUnit.SECONDS)
//			.ignoring(NoSuchElementException.class);
	
	driver.switchTo().frame("dkn");// switch to frame by id(int), name(String) or an webelement
	
	Actions action = new Actions(driver);
	action.moveToElement(ex);
	Select sel = new Select(ex);
	sel.deselectAll();
	List<WebElement> selLi= sel.getOptions();
	
}*/
}
