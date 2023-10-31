package TestScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class FindElementsAndFindElement {
    @Test
    public void newWindowTab()throws Throwable{

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.facebook.com/");
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.amazon.in/");
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.flipkart.com/");
        Set<String> windows=driver.getWindowHandles();
        for (String window:windows) {
            driver.switchTo().window(window);
            Thread.sleep(2000);
        }
        driver.close();
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void findElementException(){
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com/");
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.facebook.com/");
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.amazon.in/");
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.flipkart.com/");
        List<WebElement> webElement= driver.findElements(By.className("a"));;
        TreeSet<String> urls=new TreeSet<String>();
        Set<String> windowHandle=driver.getWindowHandles();
        for (String win:windowHandle) {
            driver.switchTo().window(win);
            urls.add(driver.getCurrentUrl());
        }
        Stack<String> Stacking=new Stack<String>();
        for (String url:urls) {
            System.out.println(url);
            Stacking.add(url);
        }
        for (String stacking:Stacking) {
            System.out.println(stacking);

        }
        for (String win:windowHandle) {

        }

        try{
            System.out.println(webElement.size());

        }catch (Exception e){
            System.out.println(webElement.size());
            System.out.println(e.getMessage());
        }finally {
            driver.quit();
        }
    }
    public void CloseWindow(String windowHandle,TreeSet<String> urls){
        for (String url:urls) {

        }
    }
}