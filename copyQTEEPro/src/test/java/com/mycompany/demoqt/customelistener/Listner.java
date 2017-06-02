package com.mycompany.demoqt.customelistener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.mycompany.demoqt.testbase.TestBase;

public class Listner extends TestBase implements ITestListener{

	public void onTestStart(ITestResult result) {
		Reporter.log("Test started running :  " + result.getName(),true);
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		if(!result.isSuccess()){
			String userDirector = System.getProperty("user.dir");
			String customeLocation = "//src//test//java//com//mycompany//demoqt//screenshots//";   //location for captured screenshots
			// name for captured screenshot with date and time 
			String failureImageFileName = userDirector+customeLocation + new SimpleDateFormat("MM-dd-yyyy_HH-ss").format( new GregorianCalendar().getTime())+"-"+result.getMethod().getMethodName()+".png"; 
			
			//take failure screenshot at run time
			
			//(TakesScreenshot) driver --- driver is casting to TakesScreenshot: In selenium no direct method to take screenshot hence we have to cast our driver
			
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);  
			try
			{
				//copy captured screenshot to required location with the help of FileUtils
				FileUtils.copyFile(	srcFile,new File(failureImageFileName));
			}catch(IOException e)
			{
				e.printStackTrace();
			}
			//To attach failure report to TestNG report 
			Reporter.log("<a href=\"" + failureImageFileName +"><img src=\"file:///"+failureImageFileName+"\" alt=\"\""+"height='100' width='100'/>"+"<br/>" );
			Reporter.setCurrentTestResult(null);
			Reporter.log(result.getName()+ "Test Method Fail\n");
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
		
	}
	

