package SeleniumPlusJava;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Selenium files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.cricbuzz.com/");
		
//		List<WebElement> link1 = driver.findElements(By.tagName("a"));
//		System.out.println(link1.size());
//		
//	WebElement link1a=	driver.findElement(By.tagName("a"));
//	System.out.println(link1a.getAttribute("href"));
//	System.out.println(link1a.getAttribute("rel"));
//	System.out.println(link1a.getText());
//	
//		
//		driver.findElement(By.xpath("//a[contains(text(),'IND vs ENG - IND Won')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Scorecard')]")).click();
		
		driver.get("https://jqueryui.com/droppable/");
		
		Actions action =new Actions(driver);
		System.out.println(driver.findElements(By.tagName("a")).size());
		driver.switchTo().frame(0);
		
		
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(src, des).build().perform();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		try{
			File ss = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ss,new File("D://Personal//Selenium files//image.png"));	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		driver.switchTo().defaultContent();
		WebElement wb = driver.findElement(By.xpath("//a[contains(text(),'Position')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView();", wb);
		Thread.sleep(5000);
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		WebElement footerDriver = driver.findElement(By.xpath("//div[@class='six columns offset-by-three']"));
		
		List<WebElement> footerLinks = footerDriver.findElements(By.tagName("a"));
		System.out.println(footerLinks.size());
		
		for(int i=0; i<footerLinks.size();i++)
		{
			footerLinks.get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
			
		}
			Set<String> wh = driver.getWindowHandles();
			Iterator<String> it = wh.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				
				System.out.println(driver.getTitle());
			}
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
