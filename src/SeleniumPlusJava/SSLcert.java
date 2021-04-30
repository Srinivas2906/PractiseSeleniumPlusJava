package SeleniumPlusJava;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLcert {

	public static void main(String[] args) throws IOException {
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.acceptInsecureCerts();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		c.merge(dc);
	
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Selenium files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("example"); //to delete any single cookie
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement firstLink =driver.findElement(By.tagName("a"));
		String linkUrl = firstLink.getAttribute("href");
		firstLink.sendKeys(Keys.CONTROL,Keys.ENTER);
		System.out.println(linkUrl);
		
		List<WebElement> allLinks =driver.findElements(By.tagName("a"));
		for(int i=0;i<allLinks.size();i++)
		{
			String s = allLinks.get(i).getAttribute("href");
			
			URL url1 = new URL(s);
			URLConnection uc1 = url1.openConnection();
			HttpURLConnection hc1 = (HttpURLConnection)uc1;
			
			int res = hc1.getResponseCode();
			if(res==200)
			{
				System.out.println(allLinks.get(i).getAttribute("href"));
			}
			else{
				System.out.println("broken links are" +"/n"+ allLinks.get(i).getAttribute("href"));
			}
		}
		
		//StatusCode check
		URL url = new URL(linkUrl);
		URLConnection uc = url.openConnection();
		HttpURLConnection hc = (HttpURLConnection)uc;
		int i = hc.getResponseCode();
		System.out.println(i);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("D://Personal//Selenium files//image1.png"));
		
		ChromeOptions co = new ChromeOptions();
		co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		co.setAcceptInsecureCerts(true);
		
		
		
	
	driver.quit();
	}

}
