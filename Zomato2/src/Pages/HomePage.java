package Pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Locators.ContLoc;
import Locators.GetZomatoLoc;
import Locators.HeaderLoc;
import Locators.LoginLoc;
import Locators.MenuSelectLoc;
import Locators.PopAreaLoc;
import Locators.PopularCousinsLoc;
import Locators.XtraLoc;
import Utils.SeleUtils;

public class HomePage extends SeleUtils{

	public static void login(WebDriver driver, String email) throws InterruptedException 
	{	
		LoginLoc.loginEle(driver).click();
		LoginLoc.contiEmail(driver).click();
		LoginLoc.enterEmailLoc(driver).sendKeys(email);
		LoginLoc.sendOTPLoc(driver).click();
		waitt(35);
		LoginLoc.getAppLoc(driver).click();
		waitt(5);
		snap(driver, "GetApp");
		driver.navigate().back();
		HeaderLoc.acceptpop(driver).click();
		waitt(2);
	}
	
	
	
	public static void searchItem(WebDriver wd, String item) throws Exception 
	{
		waitt(3);
		HeaderLoc.selectLocationLoc(wd).click();
		//HeaderLoc.dropLocationLoc(wd).click();
		HeaderLoc.searchRestLoc(wd).sendKeys(item);
		HeaderLoc.searchRestLoc(wd).click();
		waitt(3);
		HeaderLoc.searchButtonLoc(wd).click();
		menu(wd);
		//wd.navigate().back();
	}
	
	
	public static void getZomatoApp(WebDriver driver, String em) throws Exception
	{		
		scr(driver, 1500);
		GetZomatoLoc.phone(driver).click();	waitt(2);
		GetZomatoLoc.email(driver).click(); waitt(2);
		GetZomatoLoc.emailSend(driver).sendKeys(em);		waitt(2);
		GetZomatoLoc.shareAppLink(driver).click();
		waitt(2);
//		GetZomatoLoc.downloadApp(driver).click();
//		redir(driver,"downloadapp");
//		waitt(2);
//		GetZomatoLoc.getOnGoogle(driver).click();
//		redir(driver,"getongoogle");
//		waitt(2);
		
	}
	
	public static void accPop(WebDriver driver) throws InterruptedException 
	{
		scr(driver, 1300);								waitt(2);
		PopAreaLoc.connaughtPlace(driver).click();		waitt(0.8);
		snap(driver, "Connaught");						waitt(0.8);
		driver.navigate().back();
		waitt(0.8);

		hover(driver, PopAreaLoc.gurgaon(driver));		waitt(0.8);
		hover(driver, PopAreaLoc.noida(driver));		waitt(0.8);
		hover(driver, PopAreaLoc.rajouri(driver));		waitt(0.8);
		hover(driver, PopAreaLoc.saket(driver));		waitt(0.8);
		hover(driver, PopAreaLoc.cyberCity(driver));	waitt(0.8);
		hover(driver, PopAreaLoc.golfcourse(driver));	waitt(0.8);
		hover(driver, PopAreaLoc.dlfPhase4(driver));	waitt(0.8);
		hover(driver, PopAreaLoc.delhiUniversity(driver));		waitt(0.8);
		hover(driver, PopAreaLoc.indirapuram(driver));		waitt(0.8);
		hover(driver, PopAreaLoc.vasantKunj(driver));		waitt(0.8);
		hover(driver, PopAreaLoc.greaterKailash1(driver));	waitt(0.8);
		hover(driver, PopAreaLoc.chanakyapuri(driver));		waitt(0.8);
		hover(driver, PopAreaLoc.rohini(driver));			waitt(0.8);
		hover(driver, PopAreaLoc.janpath(driver));	  		waitt(0.8);
		
		scr(driver, 200);
		hover(driver, PopAreaLoc.hauzkhas(driver));			waitt(0.8);
		hover(driver, PopAreaLoc.sector38(driver));			waitt(0.8);
		hover(driver, PopAreaLoc.janakpuri(driver));		waitt(0.8);
		hover(driver, PopAreaLoc.sector50(driver));			waitt(0.8);
		hover(driver, PopAreaLoc.mgRoad(driver));			waitt(0.8);
		hover(driver, PopAreaLoc.dlfPhase3(driver));		waitt(0.8);
		hover(driver, PopAreaLoc.punjabiBagh(driver));		waitt(0.8);
		hover(driver, PopAreaLoc.netajiSubhash(driver));	waitt(0.8);
		hover(driver, PopAreaLoc.malviyaNagar(driver));		waitt(0.8);
		
		scr(driver, 300);
		hover(driver, PopAreaLoc.khanMarket(driver));		waitt(0.8);
		hover(driver, PopAreaLoc.karolBagh(driver));		waitt(0.8);
		hover(driver, PopAreaLoc.nehruPlace(driver));		waitt(0.8);
		hover(driver, PopAreaLoc.sohnaRoad(driver));		waitt(0.8);
		hover(driver, PopAreaLoc.greaterKailash2(driver));	waitt(0.8);
		hover(driver, PopAreaLoc.pitampura(driver));
	}
	public static void container(WebDriver driver) throws Exception
	{
		waitt(1.5);
		scr(driver, 300);								waitt(2);
		
		hover(driver, ContLoc.orderFoodOnline(driver));	waitt(2);
		ContLoc.orderFoodOnline(driver).click();		waitt(2);
		
		driver.navigate().back();						waitt(2);
		
		hover(driver, ContLoc.goOutForMeal(driver));	waitt(2);
		hover(driver, ContLoc.nightwayClub(driver));	waitt(2);
		hover(driver, ContLoc.zomatoPro(driver));
		
		waitt(2);
		scr(driver, 800);								waitt(1.5);
		
		ContLoc.trendingThisWeek(driver).click();       waitt(2);
		driver.navigate().back();
		ContLoc.bestOfDelhiNcr(driver).click();      	waitt(2);
		driver.navigate().back();
		ContLoc.workFriendlyPlaces(driver).click();		waitt(2);
		driver.navigate().back();
		ContLoc.forTheFamily(driver).click();			waitt(2);
		driver.navigate().back();
		ContLoc.allDelhiNcr(driver).click();			waitt(2);
		driver.navigate().back();
		
		
	}
	
	public static void popCos1(WebDriver wd) throws InterruptedException {
		
		
		scr(wd,3000);
		
		XtraLoc.pop1(wd).click();
		redir(wd, "hgh");

		List<WebElement> ele = PopularCousinsLoc.popCousinL(wd);
		
		Iterator<WebElement> it = ele.iterator();
		
		while(it.hasNext()){
			waitt(.5);
			hover(wd, it.next());
				
	}
		scr(wd,-3000);
	}
	
		public static void popCos2(WebDriver wd) throws InterruptedException {
			
			scr(wd,3000);
			XtraLoc.pop2(wd).click();
			redir(wd, "hghgk");

			List<WebElement> ele = PopularCousinsLoc.popCousin2L(wd);
			
			Iterator<WebElement> it = ele.iterator();
			
			while(it.hasNext()){
				waitt(0.5);
				hover(wd, it.next());
					
		}
	
			scr(wd,-3000);
	}
		
		public static void popCos3(WebDriver wd) throws InterruptedException {
					
			scr(wd,3500);
			XtraLoc.pop3(wd).click();
			redir(wd, "hghhhg");
		
			List<WebElement> ele = PopularCousinsLoc.popCousin3L(wd);
			
			Iterator<WebElement> it = ele.iterator();
			
			while(it.hasNext()){
				waitt(0.5);
				hover(wd, it.next());
						
			}
			scr(wd,-3500);
	}
		
		public static void popCos4(WebDriver wd) throws InterruptedException {
			
			scr(wd,4000);
			XtraLoc.pop4(wd).click();
			redir(wd, "hghgvhv");

			List<WebElement> ele = PopularCousinsLoc.popCousin4L(wd);
			
			Iterator<WebElement> it = ele.iterator();
			
			while(it.hasNext()){
				waitt(0.5);
				hover(wd, it.next());
		
						
			}
			scr(wd,-4000);
	}
public static void popCos5(WebDriver wd) throws InterruptedException {
			
	scr(wd,4600);
	XtraLoc.pop5(wd).click();
	

	List<WebElement> ele = PopularCousinsLoc.popCousin5L(wd);
	
	Iterator<WebElement> it = ele.iterator();
	int i=0;
	while(it.hasNext()){
		
		
			waitt(1);
			hover(wd, it.next());
		
			if(i==16)
				break;
		
		i++;
		
				
	}
	scr(wd,-4600);
	}


public static void menu(WebDriver driver) throws Exception
{
	MenuSelectLoc.menuHeader(driver);
	waitt(0.2);
	MenuSelectLoc.zomatoDining(driver).click();
	waitt(0.2);
	snap(driver,"dining out");
	waitt(0.1);
	MenuSelectLoc.zomatoNightlife(driver).click();
	waitt(0.2);
	snap(driver,"Night life");
	waitt(0.1);
	MenuSelectLoc.zomatoDelivery(driver).click();
	waitt(0.2);
	snap(driver,"Delivery");
	waitt(0.1);
	MenuSelectLoc.zomatoRating(driver).click();
	waitt(0.2);
	scr(driver,200);
	waitt(0.1);
	snap(driver,"Rating");
	waitt(0.1);
	MenuSelectLoc.zomatoSafeAndHygine(driver).click();
	waitt(0.2);
	scr(driver,200);
	waitt(0.1);
	snap(driver,"safeand hygiene");
	waitt(0.1);
	MenuSelectLoc.zomatoDeliveryTime(driver).click();
	waitt(0.2);
	scr(driver,200);
	waitt(0.1);
	snap(driver,"deliverytime");
	waitt(0.1);
	MenuSelectLoc.zomatoGreatOffer(driver).click();
	waitt(0.2);
	scr(driver,200);
	waitt(0.1);
	snap(driver,"greatoffers");
	waitt(0.1);
	scr(driver,1000);
	waitt(0.1);
	MenuSelectLoc.menuFooterCompany(driver);
	waitt(0.2);
	MenuSelectLoc.zomatoCodeOfConduct(driver).click();
	waitt(0.2);
	snap(driver,"codeofconduct");
	waitt(0.1);
	driver.navigate().to("https://www.zomato.com/ncr/delivery?dishv2_id=a67f32086fafd9bcf7de057bd9fe516f_2");
	waitt(0.4);
	//scr(driver,100);
	MenuSelectLoc.zomatoHotel(driver).click();
	waitt(0.2);
	snap(driver,"zomatohotel");
	waitt(0.1);
	
	
}

		
		
}
