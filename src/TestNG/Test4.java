//package TestNG;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Date;
//import java.util.Iterator;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import com.microsoft.schemas.office.visio.x2012.main.CellType;
//
//public class Test4 {
//
//	public static void main(String[] args) throws IOException
//	{
//		DesiredCapabilities dc = DesiredCapabilities.chrome();
//		DesiredCapabilities dc1 = DesiredCapabilities.internetExplorer();
//		
//		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		dc.acceptInsecureCerts();
//		
//		ChromeOptions c = new ChromeOptions();
//		c.merge(dc);
//		
//		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Selenium files\\Drivers\\chromedriver.exe");
////		WebDriver driver = new ChromeDriver(c);
////		
////		driver.manage().window().maximize();
////		driver.manage().deleteAllCookies();
////		//driver.manage().deleteCookieNamed("example"); //to delete any single cookie
//		
//		FileInputStream fis = new FileInputStream("D:\\Personal\\SeleniumDevelopment\\Workspace1\\PractiseSession\\config\\Data.xlsx");
//		XSSFWorkbook xf = new XSSFWorkbook(fis);
//		int count = xf.getNumberOfSheets();
//		
//		for(int i=0;i<count;i++)
//		{
//			if(xf.getSheetName(i).equalsIgnoreCase("Sheet1"))
//			{
//				XSSFSheet sheetName = xf.getSheetAt(i);
//				int lastRow = sheetName.getLastRowNum();
//				System.out.println(lastRow);
//				
//				Iterator<Row> rows= sheetName.iterator();
//				Row firstRow= rows.next();
//			
//				
//				Iterator<Cell> cells = firstRow.cellIterator();
//				int k=0;
//				int col=0;
//				while(cells.hasNext())
//				{
//					Cell cellvalue =cells.next();
//					if(cellvalue.getStringCellValue().equalsIgnoreCase("Origin"))
//					{
//						col=k;
//					}
//					k++;
//				}
//				System.out.println(col);
//				
//				while(rows.hasNext())
//				{
//					Row rowvalue = rows.next();
//					if(rowvalue.getCell(col).getStringCellValue().equalsIgnoreCase("mumbai"))
//					{
//						Iterator<Cell> c1 =rowvalue.cellIterator();
//						while(c1.hasNext())
//						{
//							Cell cellData= c1.next();
////							for(cellData c: CellType.val)
////							{
////								
//					}
//						}
//					}
//				}
//				
//			}
//		}
//		
//		
//		
//		
////		driver.get("https://www.goibibo.com/");
////		
////		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("abc");
////		driver.close();
//				
//	}
//	
//}
////	
////	@Test()
////	public static void datePick()
////	{
////		
////		 String dot="10/June/2020";
////String date,month,year;
////String caldt,calmonth,calyear;
////
//////Spliting the String into String Array
////String dateArray[]= dot.split("/");
////date=dateArray[0];
////month=dateArray[1];
////year=dateArray[2];
////
////       // System Property for Firefox Driver   
////System.setProperty("webdriver.gecko.driver","F:\\drivers\\geckodriver.exe");
////
////       // Instantiate a FirefoxDriver class.      
////    WebDriver driver = new FirefoxDriver();
////   
////       //Launch the Website
////driver.get("http://cleartrip.com");
////driver.findElement(By.id("DepartDate")).click();
////
////WebElement cal;
////cal=driver.findElement(By.className("calendar"));
////calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
////
//////Select the year
////
////while (!calyear.equals(year)) 
////{
////driver.findElement(By.className("nextMonth")).click();
////calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
////System.out.println("The Displayed Year::" + calyear);
////}
////
////calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
////
//////Select the Month
////
////while (!calmonth.equalsIgnoreCase(month)) 
////{
////driver.findElement(By.className("nextMonth ")).click();
////calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
////}
////
////cal=driver.findElement(By.className("calendar"));
////
//////Select the Date
////
////List<WebElement> rows,cols;
////rows=cal.findElements(By.tagName("tr"));
////for (int i = 1; i < rows.size(); i++) 
////{
////cols=rows.get(i).findElements(By.tagName("td"));
////for (int k = 0; k < cols.size(); k++) 
////{
////caldt=cols.get(k).getText();
////if (caldt.equals(date)) 
////{
////cols.get(k).click();
////break;
////}
////}
////}
////
////}
////
////}
////	}
////	
////	
////	}
////
