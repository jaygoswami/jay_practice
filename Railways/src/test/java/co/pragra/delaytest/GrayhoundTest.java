package co.pragra.delaytest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.xml.ws.WebEndpoint;
import java.util.concurrent.TimeUnit;

public class GrayhoundTest {

    WebDriver driver;

    @Parameters ("url")
    @BeforeSuite
    public void setUp(String url){

        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void TestForm(){

        WebElement leavingFrom=driver.findElement(By.name("ctl00$body$search$listOrigin"));
        leavingFrom.sendKeys("Toronto,On");
        sleep(2000);
        leavingFrom.sendKeys(Keys.ENTER);
        leavingFrom.sendKeys(Keys.TAB);

        WebElement goingTo=driver.findElement(By.name("ctl00$body$search$listDestination"));
        goingTo.sendKeys("New York, NY");
        sleep(2000);
        goingTo.sendKeys(Keys.ENTER);
        goingTo.sendKeys(Keys.TAB);


       WebElement adults= driver.findElement(By.name("ctl00$body$search$adults"));
       adults.sendKeys("2");
       sleep(2000);
       adults.sendKeys(Keys.TAB);
       adults.sendKeys(Keys.TAB);

       WebElement seniors=driver.findElement(By.name("ctl00$body$search$seniors"));
        seniors.sendKeys("2");
        sleep(2000);
        seniors.sendKeys(Keys.TAB);

        WebElement depDate = driver.findElement(By.name("ctl00$body$search$dateDepart$dateInput"));
        depDate.sendKeys("20/04/2019");
        sleep(2000);
        depDate.sendKeys(Keys.TAB);
        depDate.sendKeys(Keys.TAB);
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
