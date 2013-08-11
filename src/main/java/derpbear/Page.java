package derpbear;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

/**
 * Created with IntelliJ IDEA.
 * User: bisbot
 * Date: 8/7/13
 * Time: 10:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Page {


    protected WebDriver driver;
    protected WebDriverWait shortWait;
    protected WebDriverWait longWait;

    public Page(WebDriver driver) {
        this.driver = driver;
        shortWait = new WebDriverWait(driver, 15);
        longWait = new WebDriverWait(driver, 30);
    }

    public WebDriver driver() {
        return driver;
    }

    By notificationsLocator = By.id("flash");

    public WebElement notificationSection() {
        shortWait.until(presenceOfElementLocated(notificationsLocator));
        return driver.findElement(notificationsLocator);
    }






    public <T extends Page> T expectedPage(Class<T> type) {
        return getPage(type);
    }

    public Page ttPage(String pageName) {
        Class classz = null;
        try {
            classz = Class.forName("derpbear." + pageName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return getPage(classz);
    }


    public <T extends Page> T getPage(Class<T> type) {
        T page = null;

        try {
            page = type.getDeclaredConstructor(WebDriver.class).newInstance(driver);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return page;
    }

}