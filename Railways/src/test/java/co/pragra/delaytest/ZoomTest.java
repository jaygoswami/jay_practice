package co.pragra.delaytest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import javax.xml.ws.WebEndpoint;
import java.util.concurrent.TimeUnit;

public class ZoomTest {

    WebDriver driver;

    @Parameters("url")
    @BeforeSuite
    public  void setUp(String url){
        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void fillForm(){


        driver.findElement(By.cssSelector("#email")).sendKeys("pappu@gmail.com");
        driver.findElement(By.cssSelector("#company")).sendKeys("Pappu Corp");
        driver.findElement(By.cssSelector("#first_name")).sendKeys("Pappu Rahul");
        driver.findElement(By.cssSelector("#last_name")).sendKeys("Chor Gandhi");

        //driver.findElement(By.cssSelector("#employee_count")).sendKeys("2-10");
        //driver.findElement(By.cssSelector("#employee_count")).sendKeys(Keys.ENTER);
        //Another method
        WebElement element= driver.findElement(By.id("employee_count"));
        Select employeeSelect=new Select(element);
        employeeSelect.selectByValue("2-10");





        driver.findElement(By.id("phone")).sendKeys("+1657-244-3343");

        //driver.findElement(By.cssSelector("#country")).sendKeys("Italy");

        WebElement countrySelect=driver.findElement(By.id("country"));
        Select selectCountry=new Select(countrySelect);
        selectCountry.selectByVisibleText("Italy");



        driver.findElement(By.cssSelector("#country")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("#city")).sendKeys("62134");
        driver.findElement(By.id("description")).sendKeys("This is chor company");
        driver.findElement(By.id("btnSubmit")).submit();

    }
}
