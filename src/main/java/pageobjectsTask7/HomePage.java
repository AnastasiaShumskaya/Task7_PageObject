package pageobjectsTask7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver DRIVER;

    private static final By INPUT_SEARCH = By.cssSelector("#input-search");
    private static final By OFFICEMENU = By.id("officeMenu");

    public HomePage(WebDriver driver) {
        this.DRIVER = driver;
    }

    public String getTitle() {
        return DRIVER.getTitle();
    }

    public void goToOfficeTab() {
        DRIVER.findElement(OFFICEMENU).click();
    }

    public boolean inputSearchDisplayed() {
        return DRIVER.findElement(INPUT_SEARCH).isDisplayed();
    }

}
