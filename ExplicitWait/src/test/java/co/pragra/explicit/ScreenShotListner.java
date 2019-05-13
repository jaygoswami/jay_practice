package co.pragra.explicit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ScreenShotListner {


    public static void captureScreenShot(WebDriver driver) {

        Path path = Paths.get("target", "screenshot");
        try {
            FileUtils.forceMkdir(path.toFile());
            File screenFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File localFile=new File("target/screenshot/scrreenshot.png");
            FileUtils.copyFile(screenFile,localFile);


        } catch (IOException ex) {

        }

    }
}