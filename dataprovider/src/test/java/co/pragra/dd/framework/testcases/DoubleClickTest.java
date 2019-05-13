package co.pragra.dd.framework.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DoubleClickTest {

    WebDriver driver;

    @BeforeSuite
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://pragra.co/sel.html");

    }


    @Test
    public void doubleClick(){

        WebDriverWait wait=new WebDriverWait(driver,10);//explicit wait
        Actions actions=new Actions(driver);
        WebElement elementD=driver.findElement(By.id("dblclik"));

        actions.doubleClick(elementD).build().perform();
        driver.switchTo().alert().dismiss();

        WebElement label=driver.findElement(By.id("msg"));
        WebElement element1= wait.until(ExpectedConditions.elementToBeClickable(label));


        Assert.assertEquals(label.getText(),"Just Double Clicked");

    }
}
