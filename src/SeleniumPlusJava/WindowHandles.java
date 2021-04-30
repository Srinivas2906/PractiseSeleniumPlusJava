package SeleniumPlusJava;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WindowHandles {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Personal\\Selenium files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String act = driver.getTitle();
		System.out.println(act);
		/*
	Set<String> windows = driver.getWindowHandles();
		Iterator<String> windowHand = windows.iterator();
		while(windowHand.hasNext()){
			String s = windowHand.next();
		}
		*/
		
		/*SceenShot code
		TakesScreenshot ss =((TakesScreenshot)driver);
	File src=	ss.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C://Users//Indium Software//Desktop//New folder"));
		driver.close();
	}
*/
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement linksUrl :links)
		{
			System.out.println(linksUrl.getAttribute("href"));
		}
		for(int i=0;i<links.size();i++)
		{
			String linksall = links.get(i).getAttribute("href");
			try{
				URL url = new URL(linksall);
				URLConnection uc = url.openConnection();
				HttpURLConnection h = (HttpURLConnection)uc;
				int code = h.getResponseCode();
				System.out.println(code);
				if(code>=400)
					
					System.out.println(links);
			
			}
			catch(Throwable e){
				System.out.println(links);
			}
				}
	

}
}
