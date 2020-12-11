package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContLoc {
	static WebElement element=null;
	

	public static WebElement orderFoodOnline(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//*[text()='Order Food Online']"));
		
		return element;
		
	}
	public static WebElement goOutForMeal(WebDriver driver)
	{
		
		
		element=driver.findElement(By.xpath("//*[text()='Go out for a meal']"));
		
		return element;
		
	}
	public static WebElement nightwayClub(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//*[text()='Nightlife & Clubs']"));
		
		return element;
		
	}
	public static WebElement zomatoPro(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//*[text()='Zomato Pro']"));
		
		return element;
		
	}
	public static WebElement trendingThisWeek(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//*[text()='Trending This Week']"));
	
		return element;
		
	}
	public static WebElement allDelhiNcr(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//a[@class = 'ks3f96-0 cFSkbc sc-lkqHmb hVZUc']"));
	
		return element;
		
	}
	public static WebElement bestOfDelhiNcr(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//*[text()='Best of Delhi NCR']"));
	
		return element;
		
	}
	public static WebElement workFriendlyPlaces(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//*[text()='Work Friendly Places!']"));
	
		return element;
		
	}
	public static WebElement forTheFamily(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//*[text()='For The Family']"));
	
		return element;
		
	}

}
