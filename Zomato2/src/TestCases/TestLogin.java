package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Pages.HomePage;


import Pages.Order;
import Utils.ExcelUtils;
import Utils.Log4j;
import Utils.SeleUtils;


public class TestLogin extends SeleUtils
{
	public static WebDriver driver;
	
	
	@BeforeClass
	public void initBrow()
	{

		System.out.println("Launching In Chrome...\n");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IQA\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		// MAXIMIZING THE SCREEN
		driver.manage().window().maximize();
		
		// LOGIN TO THE SYSTEM
		driver.navigate().to("http://www.zomato.com/ncr"); 
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	
	@Test(dataProvider= "testData", dataProviderClass=ExcelUtils.class)
	public void main(String[] data) throws Exception 
	{
		
		Log4j.log().debug("start login");
		HomePage.login(driver, data[0]);
		
		Log4j.log().info("login done");
		
		HomePage.container(driver);
		
		Log4j.log().debug("start getzomato");
		scr(driver, 2500);
		HomePage.getZomatoApp(driver,data[2]);
			Log4j.log().info("getzomatoapp done");
		HomePage.accPop(driver);
		scr(driver, -2200);
		waitt(2.0);
		
		HomePage.popCos1(driver);
		
		HomePage.popCos2(driver);
		
		HomePage.popCos3(driver);
		
		HomePage.popCos4(driver);
		
		
		HomePage.popCos5(driver);
		Log4j.log().debug("search item");
		HomePage.searchItem(driver, data[1]);
		Log4j.log().info("item found");
		Log4j.log().debug("do order");
		Order.doOrder(driver);
		
		System.out.println("Success!!!");
	}
	
	
	@org.testng.annotations.AfterClass
	public void closeBrow() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
