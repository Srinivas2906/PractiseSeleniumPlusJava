package InterviewPrep;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Personal\\\\Selenium files\\\\Drivers\\\\ChromeDriver90\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Dimension d = driver.manage().window().getSize();
		System.out.println(d);
		driver.manage().window().maximize();
		
		driver.get("https://freecrm.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("D://Personal//Selenium files//Drivers//ChromeDriver90//image.png"));
		
		
		driver.findElement(By.xpath("//a[@href='https://ui.cogmento.com']")).click();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("srinivas60.yerala@gmail.com");
		
		
		WebElement pass= driver.findElement(By.xpath("//input[@name='password']"));
		
		String attri =pass.getAttribute("type");

		System.out.println(attri);
		String css= pass.getCssValue("font-size");
		String tag = pass.getTagName();
		String text= pass.getText();

		System.out.println(css);
		System.out.println(tag);
		System.out.println(text);
		
		pass.sendKeys("Freecrm@123");
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].value='Freecrm@123';", pass);
		
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		//driver.switchTo().frame(1);
		
		
		
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();
		
		Actions action = new Actions(driver);
		WebElement box= driver.findElement(By.xpath("//div[@role= 'listbox']"));
		//action.moveToElement(box).click().build().perform();
		Select sel = new Select(pass);
		
		List<WebElement> links = driver.findElements(By.tagName("//a"));
		links.size();
		
		
		//driver.close();
	}

}
