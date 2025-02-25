package tests.ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;
import utils.ExtentReportManager;
import com.aventstack.extentreports.ExtentTest;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        ExtentTest test = ExtentReportManager.getTest();

        LoginPage loginPage = new LoginPage(driver);
        test.info("Navigating to login page");

        String username = ConfigReader.getProperty("username");
        String password = ConfigReader.getProperty("password");

        loginPage.enterUsername(username);
        test.info("Entered username: " + username);

        loginPage.enterPassword(password);
        test.info("Entered password");

        loginPage.clickLogin();
        test.info("Clicked login button");

        String expectedTitle = "Swag Labs"; // Update if needed
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            test.pass("Login successful - Page title matched.");
        } else {
            test.fail("Login failed - Expected: " + expectedTitle + ", Found: " + actualTitle);
        }

        Assert.assertEquals(actualTitle, expectedTitle, "Login failed: Page title mismatch!");
    }
}
