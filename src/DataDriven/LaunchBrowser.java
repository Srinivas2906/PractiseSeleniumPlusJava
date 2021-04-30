package DataDriven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Personal\\Selenium files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		System.out.println(System.getProperty("user.dir"));
		TakesScreenshot ts = (TakesScreenshot)driver;
		
	File src=	ts.getScreenshotAs(OutputType.FILE);
	String path = System.getProperty("user.dir")+"\\projectScreenshots\\screenshot.png";
		try {
			FileUtils.copyFile(src, new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("failed");
		}
	}
	

}
