package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PopAreaLoc {
	static WebElement location = null;
	static Actions hover = null;

	public static WebElement connaughtPlace(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Connaught Place')]"));

		return location;
	}

	public static WebElement gurgaon(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Sector 29, Gurgaon')]"));

		return location;
	}

	public static WebElement noida(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Sector 18, Noida')]"));

		return location;
	}

	public static WebElement rajouri(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Rajouri Garden')]"));

		return location;
	}

	public static WebElement saket(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Saket')]"));

		return location;
	}

	public static WebElement cyberCity(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'DLF Cyber City')]"));

		return location;
	}

	public static WebElement golfcourse(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Golf Course Road')]"));

		return location;
	}

	public static WebElement dlfPhase4(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'DLF Phase 4')]"));

		return location;
	}

	public static WebElement delhiUniversity(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Delhi University-GTB Nagar')]"));

		return location;
	}

	public static WebElement indirapuram(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Indirapuram')]"));

		return location;
	}

	public static WebElement vasantKunj(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Vasant Kunj ')]"));

		return location;
	}

	public static WebElement greaterKailash1(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Greater Kailash 1 (GK1)')]"));

		return location;
	}

	public static WebElement chanakyapuri(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Chanakyapuri')]"));

		return location;
	}

	public static WebElement rohini(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(), 'Rohini')]"));

		return location;
	}

	public static WebElement janpath(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Janpath')]"));

		return location;
	}

	public static WebElement hauzkhas(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Hauz Khas Village')]"));

		return location;
	}

	public static WebElement sector38(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Sector 38, Noida')]"));

		return location;
	}

	public static WebElement janakpuri(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(), 'Janakpuri ')]"));

		return location;
	}

	public static WebElement sector50(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Sector 50, Gurgaon')]"));

		return location;
	}

	public static WebElement mgRoad(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'MG Road, Gurgaon')]"));

		return location;
	}

	public static WebElement dlfPhase3(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'DLF Phase 3')]"));

		return location;
	}

	public static WebElement punjabiBagh(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Punjabi Bagh')]"));

		return location;
	}

	public static WebElement netajiSubhash(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Netaji Subhash Place')]"));

		return location;
	}

	public static WebElement malviyaNagar(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Malviya Nagar')]"));

		return location;
	}

	public static WebElement khanMarket(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Khan Market')]"));

		return location;
	}

	public static WebElement karolBagh(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Karol Bagh')]"));

		return location;
	}

	public static WebElement nehruPlace(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Nehru Place ')]"));

		return location;
	}

	public static WebElement sohnaRoad(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Sohna Road')]"));

		return location;
	}

	public static WebElement greaterKailash2(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Greater Kailash 2 (GK2)')]"));

		return location;
	}

	public static WebElement pitampura(WebDriver driver) {
		location = driver.findElement(By.xpath("//h5[contains(text(),'Pitampura')]"));

		return location;
	}

}
