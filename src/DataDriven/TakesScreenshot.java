package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TakesScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","D:\\Personal\\Selenium files\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		
//		TakesScreenshot ts1 = ((TakesScreenshot)driver);
	
//	File src=	ts1.getScreenshotAs(OutputType.FILE);
//	String path = System.setProperty("user.dir")+"//screen";
//	FileUtils.copyFile(src, new File(path));
		TakesScreenshot.method1("abc123***jjhaefld");
		System.getProperty("user.dir");
		Actions act = new Actions(driver);
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream("jgkhj");
		prop.load(fi);
	}

public static void method1(String str)
{
	StringBuffer alpha = new StringBuffer(),
	digits = new StringBuffer(),
	special = new StringBuffer();
	
	for(int i=0;i<str.length();i++)
	{
		if(Character.isDigit(str.charAt(i)))
		{
			alpha.append(str.charAt(i));
		}
		else if(Character.isAlphabetic(str.charAt(i))){
			digits.append(str.charAt(i));
		}
		else
		{
			special.append(str.charAt(i));
		}	
	}
	System.out.println(alpha);
	System.out.println(digits);
	System.out.println(special);
}


	}

