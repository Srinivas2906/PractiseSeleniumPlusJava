package DataDriven;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Personal\\Selenium files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
			
		for(int i=0;i<allLinks.size();i++)
		{
			String linkAtt= allLinks.get(i).getAttribute("href");
			if(linkAtt==null||linkAtt.isEmpty())
			{
				System.out.println("linkNotPresent");
				continue;
			}
			try{
				URL url = new URL(linkAtt);
				URLConnection uc = url.openConnection();
				HttpURLConnection hc = (HttpURLConnection)uc;
				hc.getResponseCode();
			}
			catch(Exception IOException)
			{
				//e.printStackTrace();
				System.out.println("");
			}
		}
		List<WebElement> images= driver.findElements(By.tagName("img"));
		for(int i=0; i<images.size();i++)
		{
			String imageSrc= images.get(i).getText();
			if(imageSrc!=null)
			{
				//verifyimgSrcActive(imageSrc);
			}
		}
	}

}
