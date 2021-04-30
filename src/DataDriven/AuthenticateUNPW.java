package DataDriven;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticateUNPW {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Personal\\Selenium files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.)
		DesiredCapabilities ds = new DesiredCapabilities();
		ChromeOptions chromeoptions = new ChromeOptions();
		//chromeoptions.
//		
		//WebDriverWait wait = (WebDriverWait)driver;
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
	//	driver.get("https://ysrinuvasu.i:KdQR4!&h3Jxn@admin.staging.atx.zynga.com/admin/#/abuse-reports");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		WebElement more = driver.findElement(By.xpath("//div[@class='padB10 lh1-2 iconText fmtTooltip']"));
		Actions action = new Actions(driver);
		action.moveToElement(more).build().perform();
		
		WebElement date = driver.findElement(By.xpath("//div[@aria-lable='Thu Mar 18 2021']"));
		WebElement next = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
		
		Select sel = new Select(date);
		List<WebElement> options = sel.getOptions();
	
		
		Set<String> winhand = driver.getWindowHandles();
		Iterator<String> st= winhand.iterator();
		while(st.hasNext())
		{
			st.next();
		}
		
		/*
		 String dot="10/June/2020";
String date,month,year;
String caldt,calmonth,calyear;

//Spliting the String into String Array
String dateArray[]= dot.split("/");
date=dateArray[0];
month=dateArray[1];
year=dateArray[2];

        // System Property for Firefox Driver   
System.setProperty("webdriver.gecko.driver","F:\\drivers\\geckodriver.exe");

        // Instantiate a FirefoxDriver class.      
     WebDriver driver = new FirefoxDriver();
    
        //Launch the Website
driver.get("http://cleartrip.com");
driver.findElement(By.id("DepartDate")).click();

WebElement cal;
cal=driver.findElement(By.className("calendar"));
calyear=driver.findElement(By.className("ui-datepicker-year")).getText();

//Select the year

while (!calyear.equals(year)) 
{
driver.findElement(By.className("nextMonth")).click();
calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
System.out.println("The Displayed Year::" + calyear);
}

calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();

//Select the Month

while (!calmonth.equalsIgnoreCase(month)) 
{
driver.findElement(By.className("nextMonth ")).click();
calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
}

cal=driver.findElement(By.className("calendar"));

// Select the Date

List<WebElement> rows,cols;
rows=cal.findElements(By.tagName("tr"));
for (int i = 1; i < rows.size(); i++) 
{
cols=rows.get(i).findElements(By.tagName("td"));
for (int k = 0; k < cols.size(); k++) 
{
caldt=cols.get(k).getText();
if (caldt.equals(date)) 
{
cols.get(k).click();
break;
}
}
}

}

}
		 */
	
	}
	
	

}
