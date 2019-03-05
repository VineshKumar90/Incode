package TestNGListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListner implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println("Test Execution Started...");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Execution completed SuccessFully...");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test Execution Failed...");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Execution Skipped...");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {
        System.out.println("Test Execution ...");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Test Execution ...");
    }
}
