package SeleniumPlusJava;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Selenium files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	List<WebElement> li= driver.findElements(By.xpath("//div[@class='tableFixHead']/table[@id='product']//tbody/tr/td[position()=4]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)");
		//js.executeScript("arguments[0].scrollintoView(true);", li);
		
	int sum=0;
	for(int i=0; i<li.size();i++)
	{
		
	int in=	Integer.parseInt(li.get(i).getText());
		
		sum =sum+in;
		
	}
	System.out.println(sum);
	
	String exp =driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
	
	String[] arr= exp.split(":");
//	System.out.println(Arrays.toString(arr));
	String exStr = arr[1].trim();
	System.out.println(exStr);
	int exVal = Integer.parseInt(exStr);
	
	
	for(String arr1:arr)
	{
		System.out.println(arr1);
		
	}
	
	

	
	if(exVal==sum)
	{
		System.out.println("pass");
	}
	}


}
