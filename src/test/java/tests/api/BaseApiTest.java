package tests.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.ExtentReportManager;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestResult;

public class BaseApiTest {
	protected RequestSpecification request;
	protected ExtentTest test; // Extent Report instance

	@BeforeClass
	public void setupApi() {
		RestAssured.baseURI = "https://fakestoreapi.com"; // API Base URL
		request = RestAssured.given();
		ExtentReportManager.setupReport(); // Initialize Extent Reports
	}

	@BeforeMethod
	public void startTestMethod(ITestResult result) {
		test = ExtentReportManager.createTest(result.getMethod().getMethodName());
		ExtentReportManager.setTest(test); // Explicitly assign to Extent Manager
		test.info("Starting API test: " + result.getMethod().getMethodName());
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

	@AfterSuite
	public void flushReports() {
		ExtentReportManager.flushReport(); //Ensuring reports are being saved at the end
	}


	protected void logResponse(Response response) {
		test.info("Response: " + response.prettyPrint()); // Log API Response
	}
}
