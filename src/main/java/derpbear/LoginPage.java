package derpbear;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

/**
 * Created with IntelliJ IDEA.
 * User: bisbot
 * Date: 8/10/13
 * Time: 10:45 PM
 */
public class LoginPage extends LandingPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //elements
    By usernameLocator = By.id("username");
    By passwordLocator = By.id("password");
    By loginButtonLocator = By.id("submit");

//page methods
    public LandingPage enterUserName(String username){
        driver.findElement(usernameLocator).sendKeys(username);
        return this;
    }
    public LandingPage enterPassword(String password){
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public LandingPage submitLogin() {
        driver.findElement(loginButtonLocator).click();
        return new LandingPage(driver);
    }

    //page flows
    public LandingPage loginAs(String username, String password){
        enterUserName(username);
        enterPassword(password);

        return submitLogin();
    }







}
