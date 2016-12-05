package pageobjectsTask7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class AppTest {


    private WebDriver driver = new FirefoxDriver();

    private String url = "https://192.168.100.26/";
    private String username = "AnastasiaShumskaya";
    private String password = "1";

    private LoginPage rmSysPage = new LoginPage(driver);
    private HomePage homePage = new HomePage(driver);

    @BeforeMethod(alwaysRun = true)
    public void setUpTest() {
        rmSysPage.setUp();
    }

    @AfterClass
    private void tearsDown() {
        rmSysPage.close();
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
        Assert.assertTrue(homePage.inputSearch.isDisplayed());
    }

}
