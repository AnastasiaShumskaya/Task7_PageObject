package pageobjectsTask7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by AnastasiaShumskaya on 12/2/2016.
 */
public class HomePage {
    public WebElement officeMenu;
    public WebElement Password;
    public WebElement SubmitButton;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "a[title='Sign out']")
    public WebElement signout;

    @FindBy(css = "#input-search")
    public WebElement inputSearch;

    public void goToOfficeTab() {
        officeMenu.click();
        return;
    }

    public String getTitle() {
        return this.driver.getTitle();
    }

}
