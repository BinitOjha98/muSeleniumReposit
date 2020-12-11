package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XtraLoc {
	
	public static WebElement pop1(WebDriver Driver){
		WebElement Element = Driver.findElement(By.xpath("//a[text()='Bakery food near me']"));
		return Element;
	}
	
	public static WebElement pop2(WebDriver Driver){
		WebElement Element = Driver.findElement(By.xpath("//a[text()='Bakeries near me']"));
		return Element;
	}
	
	public static WebElement pop3(WebDriver Driver){
		WebElement Element = Driver.findElement(By.xpath("//a[text()='Bikanervala']"));
		return Element;
	}
	
	public static WebElement pop4(WebDriver Driver){
		WebElement Element = Driver.findElement(By.xpath("//a[text()='Delhi NCR']"));
		return Element;
	}
	
	public static WebElement pop5(WebDriver Driver){
		WebElement Element = Driver.findElement(By.xpath("//p[text()='Careers']"));
		return Element;
	}

}
