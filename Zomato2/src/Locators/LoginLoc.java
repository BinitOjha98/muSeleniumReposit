package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLoc {
	public static WebElement loginEle(WebDriver Driver){
		WebElement Element = Driver.findElement(By.xpath("//*[@class='sc-3o0n99-5 bCkRtP' and text()='Login']"));
		return Element;
	}
	public static WebElement contiEmail(WebDriver Driver){
		WebElement Element = Driver.findElement(By.xpath("//*[@aria-label='Continue with Email']"));
		return Element;
	}
	
	public static WebElement enterEmailLoc(WebDriver Driver){
		WebElement Element = Driver.findElement(By.xpath("//div[@aria-hidden='false' and @role='dialog']//input[@class='sc-1yzxt5f-9 bbrwhB']"));
		return Element;
	}
	
	public static WebElement sendOTPLoc(WebDriver Driver){
		WebElement Element = Driver.findElement(By.xpath("//button[@class='sc-1kx5g6g-1 elxuhW sc-kVrTmx dxgcDk']"));
		return Element;
	}
	
	public static WebElement getAppLoc(WebDriver Driver){
		WebElement Element = Driver.findElement(By.xpath("//a[@href='/mobile']"));
		return Element;
	}
}
