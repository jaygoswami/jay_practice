package co.pragra.delaytest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public abstract class FunListner implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("This is awesome");
    }

    @Override
    public void onTestFailure(ITestResult result) {

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
