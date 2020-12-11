package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetZomatoLoc {
	static WebElement element = null;		//* go for the tagname

	public static WebElement phone(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='djusq7-3 iszoyV']"));
		return element;
	}

	public static WebElement email(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@class='djusq7-3 iszoyV']"));

		return element;

	}

	public static WebElement emailSend(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@class='sc-1yzxt5f-9 bbrwhB']"));

		return element;

	}

	public static WebElement shareAppLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[text()='Share App Link']"));

		return element;

	}
	public static WebElement downloadApp(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[@class='sc-lppgPi jAebGU']/a[@class='sc-16nfz79-0 blTnzu']/div[@class='sc-16nfz79-1 fStFdQ'] "));

		return element;

	}
	public static WebElement getOnGoogle(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[@class='sc-knvRHU eFRdHx']/a[@class='sc-16nfz79-0 blTnzu']/div[@class='sc-16nfz79-1 eWrJHn']"));

		return element;

	}

}
