package co.pragra.delaytest;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PragraDelayTest {
        WebDriver driver;


        @BeforeSuite
        public  void setUp(){
            System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        }

    @Parameters("url")
    @BeforeClass
    public void setUp2(String url){

        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
    }
    @Test
    public void delayTest(){
        WebElement textBox = driver.findElement(By.id("inner"));

        Assert.assertEquals(textBox.getText(),"Hello add later on dom action");

    }


//    @Parameters({"username","password"})
//    @Test
//    public void loginTest(String username,String password){
//
//        System.out.println("username:"+username);
//        System.out.println("password:"+ password);
//
//    }

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


