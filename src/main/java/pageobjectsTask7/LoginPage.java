package pageobjectsTask7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    private WebElement Username;
    private WebElement Password;
    private WebElement SubmitButton;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void login(String name, String pass) {
        Username.sendKeys(name);
        Password.sendKeys(pass);
        SubmitButton.click();
    }

}
