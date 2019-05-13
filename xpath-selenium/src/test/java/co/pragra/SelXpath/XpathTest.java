package co.pragra.SelXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class XpathTest {
	
	
	WebDriver driver=null;

	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver1\\chromedriver.exe");
	
		driver = new ChromeDriver();
		//open chrome browser and go to given address
		driver.get("https://www.sunwing.ca/");
		
	}
	
	@Test
	public void testTitle() {
		
		
		// to test if the title contains word Sunwing
		Assert.assertTrue(driver.getTitle().contains("sunwing"));
	}
	
	/*
	 * @Test public void chechBusLink() {
	 * 
	 * String xpath="//nav/ul//a/span[contains(@class,'chBuses')]";
	 * 
	 * //Contains all the web HTML elements WebElement busLink=
	 * driver.findElement(By.xpath(xpath));
	 * 
	 * busLink.click();
	 * 
	 * //To check if title has buses
	 * Assert.assertTrue(driver.getTitle().contains("Buses"));
	 * 
	 * 
	 * }
	 */
	@Test
	public void TagNames() {
		
		//To check number of links(type of HTML element on that webpage
		List<WebElement> allLinks=	driver.findElements(By.tagName("a"));
		
		
		System.out.println("NO OF LINKS:"+allLinks.size());
		
		}
	
	@Test
	public void thingsToDo() {
		
		String xpath="";
		//Xpath ul[@class='secondary-section']/li[6]/a
		//CSS selector//ul[class=secondary-section]>li:nth-child(6)>a
	}
	
	
	@AfterSuite
	public void destroy() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}
	

	
	

}
