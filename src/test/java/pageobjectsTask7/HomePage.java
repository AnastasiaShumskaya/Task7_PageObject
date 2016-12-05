package pageobjectsTask7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebElement officeMenu;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void goToOfficeTab() {
        officeMenu.click();
    }

    @FindBy(css = "a[title='Sign out']")
    @CacheLookup
    public WebElement signout;

    @FindBy(css = "#input-search")
    @CacheLookup
    public WebElement inputSearch;

}
