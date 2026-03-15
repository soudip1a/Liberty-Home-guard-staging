package listener_package;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Reports.Extended_Reports;


public class Listen implements ITestListener {

	private static final ThreadLocal<ExtentTest> logreader = new ThreadLocal();
	Extended_Reports report = new Extended_Reports();
	
	public static ExtentTest print_in_report(){
		
		return logreader.get();
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
		String Methodname = result.getMethod().getMethodName();
		logreader.set(report.getReport().createTest(Methodname));
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		logreader.get().log(Status.PASS, "Testcase Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		logreader.get().log(Status.FAIL, result.getThrowable());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		report.getReport().flush();
	}
	
	
	
	

}
