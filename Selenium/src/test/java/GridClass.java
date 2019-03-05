import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridClass {
    String baseURL;
    String nodeURL;
    WebDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        baseURL = "https://www.cleartrip.com/";
        nodeURL = " http://10.22.94.133:4444/wd/hub";
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WIN10);
        driver = new RemoteWebDriver(new URL(nodeURL), cap);
    }


    @Test
    public void test() {
        System.out.println("Test started");
        driver.get(baseURL);
    }

    @Test
    public void test2() {
        System.out.println("Test2 started");
        driver.get(baseURL);
    }

}
