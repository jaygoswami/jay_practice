package co.pragra.hotels;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Set;

public class Hotels {

    WebDriver driver;


    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","C:\\webdriver\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.get("https://ca.hotels.com");
    }

    @BeforeClass
    public void popUp(){
        driver.findElement(By.cssSelector("div#managed-overlay>button.cta")).click();
    }

    @Test
    public void titleTest(){
        Assert.assertTrue(driver.getTitle().toUpperCase().contains("LUXURY"));

        //to delete cookies
        Set<Cookie> cookies =driver.manage().getCookies();

        for(Cookie cookie: cookies){
            driver.manage().deleteAllCookies();
        }



    }

    @AfterSuite
    public void quit(){

        sleep(20000);
        driver.quit();
    }

       public void sleep( long sleepTime){
        try{
            Thread.sleep(sleepTime);
        }catch (InterruptedException ex){

        }

    }

}
