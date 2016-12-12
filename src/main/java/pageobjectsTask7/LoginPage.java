package pageobjectsTask7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    @FindBy(id = "Username")
    private WebElement username;

    @FindBy(id = "Password")
    private WebElement password;

    @FindBy(id = "SubmitButton")
    private WebElement submitButton;

    private final WebDriver DRIVER;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.DRIVER = driver;
    }

    public HomePage login(String name, String pass) {
        username.sendKeys(name);
        password.sendKeys(pass);
        submitButton.click();

        return new HomePage(DRIVER);
    }

}
