package co.pragra.rogerstest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class RogersTest {

    WebDriver driver;

    @Parameters("url")
    @BeforeSuite
    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        //driver.get("https://pragra.co/sel.html");
        driver.get(url);
    }

    @Test
    public void viewOffersTest(){

        //WebDriverWait wait=new WebDriverWait(driver,10);

        String title= driver.getTitle();
        Assert.assertEquals(title,"Rogers: Wireless, Internet, TV, Home Monitoring, and Home phone");

        String urlR=driver.getCurrentUrl();
        Assert.assertEquals(urlR,"https://www.rogers.com/consumer/home");

        WebElement viewOffersBtn=driver.findElement(By.xpath("//button[@class='a-btnSecondary']"));
        viewOffersBtn.click();



        String airopods=driver.findElement(By.xpath("//*[@id=\"iphone-xr\"]/div/div/div/div[2]/div/h2")).getText();

        Assert.assertEquals(airopods,"AirPods, a gift on us");



        // WebElement element= wait.until(ExpectedConditions.elementToBeClickable(btn));

        //element.click();

        //Alert alert= driver.switchTo().alert();
       // Assert.assertEquals("Clicked",alert.getText());
       // alert.dismiss();


    }



    @AfterSuite
    public void destroySetup(){
        sleep(21000);

        driver.quit();
    }
    public void sleep( long sleepTime){
        try{
            Thread.sleep(sleepTime);
        }catch (InterruptedException ex){

        }

    }

}