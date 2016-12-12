package com.selenium.task7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageobjectsTask7.HomePage;
import pageobjectsTask7.LoginPage;
import java.util.concurrent.TimeUnit;


public class AppTest {

    private WebDriver driver;

    private static final String URL = "https://192.168.100.26/";
    private static final String USERNAME = "AnastasiaShumskaya";
    private static final String PASSWORD = "1";
    private static final String TITLE = "Home";

    @BeforeMethod(alwaysRun = true)
    public void setUp() {

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(URL);
    }

    @Test
    public void seleniumTest() {
        LoginPage rmSysPage = new LoginPage(driver);
        HomePage homePage = rmSysPage.login(USERNAME, PASSWORD);

        Assert.assertTrue(homePage.getTitle().contains(TITLE), "Incorrect page!");
    }

    @Test
    public void testCase() {
        LoginPage rmSysPage = new LoginPage(driver);
        HomePage homePage = rmSysPage.login(USERNAME, PASSWORD);
        homePage.goToOfficeTab();

        Assert.assertTrue(homePage.inputSearchDisplayed(), "Input search is not on the page!");
    }

    @AfterMethod
    private void tearDown() {
        driver.close();
    }
}
