package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class steps {

    WebDriver driver;

    @Given("^user is on home page of application$")
    public void user_is_on_home_page_of_application() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.cleartrip.com/");
    }

    @Then("^user selects fromData$")
    public void user_selects_fromData() {

    }

    @Then("^user selects toDate$")
    public void user_selects_toDate()  {

    }


}
