package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	private static ExtentReports extent;
	private static ThreadLocal<ExtentTest> testThread = new ThreadLocal<>();

	public static void setupReport() {
		if (extent == null) {
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
			extent = new ExtentReports();
			extent.attachReporter(sparkReporter);
		}
	}

	public static ExtentTest createTest(String testName) {
		ExtentTest test = extent.createTest(testName);
		testThread.set(test);
		return test;
	}

	public static void setTest(ExtentTest test) {
		testThread.set(test);
	}

	public static ExtentTest getTest() {
		return testThread.get();
	}

	public static void flushReport() {
		if (extent != null) {
			extent.flush(); // Ensures report is saved
		}
	}
}
