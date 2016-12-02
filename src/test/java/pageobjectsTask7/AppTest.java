//package com.seleniumTask7.app;
package pageobjectsTask7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class AppTest {


    private WebDriver driver = new FirefoxDriver();

    private String url = "https://192.168.100.26/";
    private String username = "AnastasiaShumskaya";
    private String password = "1";
    private String loginTitle = "RMSys - Sign In";
    private WebElement element;

    LoginPage rmSysPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    @BeforeMethod(alwaysRun = true)
    public void setUpTest() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterClass
    private void tearsDown() {
        driver.close();
    }
    @Test
    public void seleniumTest() throws InterruptedException {

        rmSysPage.load(url);
        rmSysPage.login(username, password);

        Assert.assertTrue(homePage.signout.isDisplayed(), "Sign out link is not displayed!");
    }

    @Test
    public void testCase() {

        rmSysPage.load(url);
        rmSysPage.login(username, password);

        homePage.goToOfficeTab();

        Assert.assertTrue(homePage.getTitle().contains("Office"));
    }

}
