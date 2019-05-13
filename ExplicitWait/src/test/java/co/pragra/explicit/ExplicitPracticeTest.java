package co.pragra.explicit;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class ExplicitPracticeTest {

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
    public void explicitTest(){

        WebDriverWait wait=new WebDriverWait(driver,10);

        WebElement btn= driver.findElement(By.id("btndisable"));
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(btn));

        element.click();

        Alert alert= driver.switchTo().alert();
        Assert.assertEquals("Clicked",alert.getText());
        alert.dismiss();

       WebElement btn1= driver.findElement(By.xpath("//div[@class='input-group']/input[@class='form-control']"));
        btn1.sendKeys("Learning");

        ScreenShotListner.captureScreenShot(driver);

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
