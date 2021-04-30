package DataDriven;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Personal\\Selenium files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			String linkname = links.get(i).getText();
			String linkattribute = links.get(i).getAttribute("href");
			System.out.println(linkattribute);
			if(linkattribute==null||linkattribute.isEmpty())
			{
				System.out.println("URL is not present or linked");
				continue;
			}
			try{
				URL url = new URL(linkattribute);
				URLConnection uc = url.openConnection();
				
				HttpURLConnection h = (HttpURLConnection)uc;
				int code = h.getResponseCode();
				System.out.println(code);	
				if(code>=400)
				{
					System.out.println("broken link");
				}
				else
				{
					System.out.println(linkattribute+"valid link");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(linkname);
		}

	}
	


}
