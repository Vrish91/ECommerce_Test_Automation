package tests.ui;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import utils.ConfigReader;
import utils.DriverFactory;
import utils.ExtentReportManager;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestResult;

public class BaseTest {
    protected WebDriver driver;
    protected ExtentTest test;

    @BeforeClass
    public void setUp() {
        ExtentReportManager.setupReport(); // Initialize Extent Reports
        driver = DriverFactory.getDriver();
        driver.get(ConfigReader.getProperty("base_url"));
    }

    @BeforeMethod
    public void startTestMethod(ITestResult result) {
        test = ExtentReportManager.createTest(result.getMethod().getMethodName());
        test.info("Starting test: " + result.getMethod().getMethodName());
    }

    @AfterMethod
    public void captureTestResult(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.fail("Test Failed: " + result.getThrowable().getMessage());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test Passed");
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.skip("Test Skipped: " + result.getThrowable().getMessage());
        }
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.quitDriver();
        ExtentReportManager.flushReport(); // Save Extent Report
    }
}
