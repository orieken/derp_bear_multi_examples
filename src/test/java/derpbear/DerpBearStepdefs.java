package derpbear;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.matchers.JUnitMatchers;
import org.openqa.selenium.iphone.IPhoneDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Constructor;
import java.net.URL;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;


/**
 * Created with IntelliJ IDEA.
 * User: bisbot
 * Date: 8/7/13
 * Time: 10:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class DerpBearStepdefs {

    private WebDriver driver;
    private String derpBearUrl;

    //hooks i want to move this later
    @Before
    public void setUp() {
        derpBearUrl = "http://derp-bear.herokuapp.com/";
        //if you have the derp-bear codebase you can use this url instead
        //derpBearUrl = "http://localhost:9393/";

        //driver = new ChromeDriver();
        driver = new FirefoxDriver();

//        try {
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            //update these for your version of the ios simulator
//            capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
//            capabilities.setCapability(CapabilityType.VERSION, "6.1");
//            capabilities.setCapability(CapabilityType.PLATFORM, "Mac");//
//            driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("^I visit derpbear$")
    public void I_visit_derpbear() throws Throwable {
        driver.navigate().to(derpBearUrl);

    }

    @When("^I login$")
    public void I_login() throws Throwable {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.login();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("Bond", "007");

    }

    @Then("^I should see the logged in message$")
    public void I_should_see_the_logged_in_message() throws Throwable {
        LandingPage landingPage = new LandingPage(driver);
        String pageText = landingPage.notificationSection().getText();
        assertThat(pageText, is(equalTo("You are now Logged in.")));
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void I_should_see(String expectedString) throws Throwable {
        LandingPage landingPage = new LandingPage(driver);
        String pageText = landingPage.notificationSection().getText();
        assertThat(pageText, is(equalTo(expectedString)));
    }
}