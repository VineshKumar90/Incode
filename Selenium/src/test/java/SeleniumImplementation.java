import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.function.Function;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class SeleniumImplementation {
    WebDriver driver;
    JavascriptExecutor js;
    Actions action;
    @BeforeMethod
    public void setup(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.cleartrip.com/");
    }

    @Test
    public void inserTexBox(){
        js = (JavascriptExecutor)driver;
        action = new Actions(driver);
        js.executeScript("document.getElementById('FromTag').value='Mumbai';");
        WebElement destination = driver.findElement(By.id("ToTag"));
        action.moveToElement(destination).click().sendKeys("Delhi").build().perform();
    }

    @Test
    public void fluentWait(){
        action = new Actions(driver);
        WebElement destination = driver.findElement(By.id("ToTag"));
        action.moveToElement(destination).click().sendKeys("Delhi").build().perform();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .pollingEvery(1,TimeUnit.SECONDS)
                .withTimeout(10,TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
            return driver.findElement(By.xpath("//li[@class='list']/a[contains(text(),'Delhi')]"));
        }
        });
        element.click();
    }

    @Test
    public void takeScreenshot(){
        File fis = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(fis,new File("vinesh.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
