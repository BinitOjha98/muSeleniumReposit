package Pages;

import java.util.Iterator;
import java.util.List;

import javax.activation.ActivationDataFlavor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Locators.PopularCousinsLoc;
import Utils.SeleUtils;

public class btmchk extends SeleUtils {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
	WebDriver wd = new ChromeDriver();
	wd.navigate().to("https://www.zomato.com/ncr");
	wd.manage().window().maximize();
	
	scr(wd,4600);

	List<WebElement> ele = PopularCousinsLoc.popCousin5L(wd);
	
	Iterator<WebElement> it = ele.iterator();
	int i=0;
	while(it.hasNext()){
		
		if(i==3){
			it.next().click();
			waitt(3);
			wd.navigate().back();
			waitt(4);
		}
		else{
			waitt(1);
			hover(wd, it.next());
		}
		
		
		i++;
		
				
	}
	
}
}
