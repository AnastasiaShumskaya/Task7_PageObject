package pageobjectsTask7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    private WebElement Username;
    private WebElement Password;
    private WebElement SubmitButton;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void load(String url) {
        this.driver.get(url);
    }

    protected void setUp() {
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    protected void close() {
        this.driver.close();
    }

    public void login(String name, String pass) {
        Username.sendKeys(name);
        Password.sendKeys(pass);
        SubmitButton.click();
    }

    public String getTitle() {
        return driver.getTitle();
    }

}
