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
    private LoginPage rmSysPage;
    private HomePage homePage;

    private String url = "https://192.168.100.26/";
    private String username = "AnastasiaShumskaya";
    private String password = "1";



    @BeforeMethod(alwaysRun = true)
    public void setUp() {

        driver = new FirefoxDriver();
        rmSysPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    private void tearDown() {
        driver.close();
    }

    @Test
    public void seleniumTest() throws InterruptedException {

        driver.get(url);
        rmSysPage.login(username, password);

        Assert.assertTrue(homePage.getTitle().contains("Home"));
    }

    @Test
    public void testCase() {

        driver.get(url);
        rmSysPage.login(username, password);
        homePage.goToOfficeTab();

        Assert.assertTrue(homePage.inputSearch().isDisplayed());
    }

}
