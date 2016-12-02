package pageobjectsTask7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebElement Username;
    public WebElement Password;
    public WebElement SubmitButton;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public void load(String url) {
        this.driver.get(url);
    }

    public void close() {
        this.driver.close();
    }

    public void login(String name, String pass) {
        Username.sendKeys(name);
        Password.sendKeys(pass);
        SubmitButton.click();
    }

    public String getTitle() {
        return this.driver.getTitle();
    }

}
