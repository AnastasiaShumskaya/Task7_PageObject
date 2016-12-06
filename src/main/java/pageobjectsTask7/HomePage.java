package pageobjectsTask7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void goToOfficeTab() {
        driver.findElement(By.id("officeMenu")).click();
    }

    public WebElement inputSearch() {
        return driver.findElement(By.cssSelector("#input-search"));
    }

}
