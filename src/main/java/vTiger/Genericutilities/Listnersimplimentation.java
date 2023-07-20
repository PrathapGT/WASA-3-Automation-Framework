package vTiger.Genericutilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listnersimplimentation implements ITestListener {

	
	ExtentReports report;
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		String METHODNAME = result.getMethod().getMethodName();
		System.out.println(METHODNAME+" Execution started");
		
		test=report.createTest(METHODNAME);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		
		String METHODNAME = result.getMethod().getMethodName();

		System.out.println(METHODNAME+ "---pass---");
		
		test.log(Status.PASS,METHODNAME+ "---pass---" );
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		JavaUtility jUtil=new JavaUtility();
		
		WebdriverUtility wUtil=new WebdriverUtility();

 
		String METHODNAME = result.getMethod().getMethodName();
		

		test.log(Status.FAIL,METHODNAME+"--Fail--" );
		
		
		
		String Screenshotname=METHODNAME+"-"+jUtil.getsystemDateInFormat();
		
		try {
			
			
		String path	=wUtil.Takescreenshot(Baseclass.sDriver, Screenshotname);
		
		test.addScreenCaptureFromPath(path);
			
			
		}catch(IOException e) {
		
		e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String METHODNAME = result.getMethod().getMethodName();
		
		System.out.println(METHODNAME+"---skipped---");

		test.log(Status.SKIP,METHODNAME+"---skipped---" );
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
		WebdriverUtility wUtil=new WebdriverUtility();

		JavaUtility jUtil=new JavaUtility();
		String METHODNAME = result.getMethod().getMethodName();
		System.out.println(METHODNAME+"---Failed---");

		String Screenshotname = METHODNAME+"--"+jUtil.getsystemDateInFormat();
		
		try {
			wUtil.Takescreenshot(Baseclass.sDriver, Screenshotname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onStart(ITestContext context) {
		
		System.out.println("suite excecuted started");
		
		ExtentSparkReporter htmlreport= new ExtentSparkReporter(".\\ExtentReport\\Report-"+new JavaUtility().getsystemDateInFormat()+" .html");
		
		
		htmlreport.config().setDocumentTitle("Vtiger Execution Reports");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("VTIGER EXECUTION REPORT");
		
		ExtentReports report= new ExtentReports();
		
		report.attachReporter(htmlreport);
		
		report.setSystemInfo("Base URL", "http://localhost:8888");
		
		report.setSystemInfo("Base BROWSER", "edgedriver");
		
		report.setSystemInfo("Reporter Name", "Prathap");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		System.out.println("suite execution finished");
		
		report.flush();
	}

	
	
	
}
