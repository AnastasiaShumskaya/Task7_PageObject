package pageobjectsTask7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    private static final By USERNAME = By.id("Username");
    private static final By PASSWORD = By.id("Password");
    private static final By SUBMIT_BUTTON = By.id("SubmitButton");

    private WebDriver DRIVER;

    public LoginPage(WebDriver driver) {
        this.DRIVER = driver;
    }

    public HomePage login(String name, String pass) {
        DRIVER.findElement(USERNAME).sendKeys(name);
        DRIVER.findElement(PASSWORD).sendKeys(pass);
        DRIVER.findElement(SUBMIT_BUTTON).click();

        return new HomePage(DRIVER);
    }
}
