package co.pragra.selboot;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.mcap.com/");

    }
}
