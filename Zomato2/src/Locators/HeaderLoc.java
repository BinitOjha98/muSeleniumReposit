package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderLoc {
	public static WebElement selectLocationLoc(WebDriver Driver){
		WebElement element = Driver.findElement(By.xpath("//input[@placeholder='Delhi NCR']"));
		return element;
	}
	
	public static WebElement dropLocationLoc(WebDriver Driver){
		WebElement element = Driver.findElement(By.xpath("//p[@class='sc-1hez2tp-0 sc-eopZyb eTHreG']"));
		return element;
	}
	
	public static WebElement searchRestLoc(WebDriver Driver){
		WebElement element = Driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
		return element;
	}
	
	public static WebElement searchButtonLoc(WebDriver Driver){
		WebElement element = Driver.findElement(By.xpath("//div[@class='sc-iNhVCk GSAgl']"));
		return element;
	}
	
	public static WebElement acceptpop(WebDriver Driver){
		WebElement element = Driver.findElement(By.xpath("//span[text()='Accept']"));
		return element;
	}

}
