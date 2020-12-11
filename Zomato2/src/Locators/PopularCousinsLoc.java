package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopularCousinsLoc {

	public static List<WebElement> popCousinL(WebDriver driver) {
		List<WebElement> ele = driver.findElements(By.xpath("//p[text()='Popular cuisines near me']/../div//a"));

		return ele;
	}
	
	public static List<WebElement> popCousin2L(WebDriver driver) {
		List<WebElement> ele = driver.findElements(By.xpath("//p[text()='Popular restaurant types near me']/../div//a"));

		return ele;
	}
	public static List<WebElement> popCousin3L(WebDriver driver) {
		List<WebElement> ele = driver.findElements(By.xpath("//p[text()='Top Restaurant Chains']/../div//a"));

		return ele;
	}
	
	public static List<WebElement> popCousin4L(WebDriver driver) {
		List<WebElement> ele = driver.findElements(By.xpath("//p[text()='Cities We Deliver To']/../div//a"));

		return ele;
	}
	
	public static List<WebElement> popCousin5L(WebDriver driver) {
		List<WebElement> ele = driver.findElements(By.xpath("//div[@name='Company']/../div//a"));

		return ele;
	}
}
