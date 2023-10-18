import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class FirstTesting {
    @Test
    public void Testing(){
        System.out.println("This is a testing framework");
        Assert.assertTrue(true);
    }
    @Test
    public void LaunchingBrowser() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        TakesScreenshot ts=(TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        File dest=new File("D:\\IntelliJ_IDEA\\CodeAnalyzing\\src\\test\\Resources\\screenshot.png");
        FileUtils.copyFile(source,dest);
        driver.close();
    }
}
