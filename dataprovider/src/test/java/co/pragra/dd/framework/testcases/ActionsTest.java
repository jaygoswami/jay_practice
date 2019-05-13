package co.pragra.dd.framework.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class ActionsTest {

    WebDriver driver;

            @BeforeSuite
            public void setup(){
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                driver.get("https://www.cn.ca/en/");

            }

            @Test
    public void test1(){

                Actions actions=new Actions(driver);
                WebElement topLvElement=driver.findElement(By.id(""));
                WebElement grainLvElement=driver.findElement(By.id(""));





    }


}
