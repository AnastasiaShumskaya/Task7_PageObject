package pageobjectsTask7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver DRIVER;

    @FindBy(id = "officeMenu")
    public WebElement officeTab;


    @FindBy(css = "#input-search")
    public WebElement inputSearch;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.DRIVER = driver;
    }

    public HomePage manageProfile() {
        return new HomePage(DRIVER);
    }

    public String getTitle() {
        return DRIVER.getTitle();
    }

    public boolean inputSearchDisplayed() {
        return inputSearch.isDisplayed();
    }

    public void goToOfficeTab() {
        officeTab.click();
    }
}
