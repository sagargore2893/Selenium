package com.mycompany.demoqt.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mycompany.demoqt.Pagelibrary.CreateAnAccount;
import com.mycompany.demoqt.Pagelibrary.Header;
import com.mycompany.demoqt.Pagelibrary.LogIn;
import com.mycompany.demoqt.testbase.TestBase;

public class TestCreateAccount extends TestBase {
	CreateAnAccount createaccount;
	
	@BeforeTest
	public void setUp() throws IOException, InterruptedException
	{
		init();
	    //closePopUp();
	}
	
	@Test
	public void testCreateAnAccountPageIsDisplayed() throws InterruptedException
	{
		Header header = new Header(driver);
		header.clickOnAccount();
		LogIn login = new LogIn(driver);
		login.clickOnSignIn();
		login.clickOnCreateAnAccount();
		Assert.assertEquals("Create Account – QTEE", driver.getTitle());
	}
	
	@Test
	public void testCreateAccount_With_New_Email_Id() throws InterruptedException
	{
		Header header = new Header(driver);
		header.clickOnAccount();
		LogIn login = new LogIn(driver);
		login.clickOnSignIn();
		login.clickOnCreateAnAccount();
		createaccount = new CreateAnAccount(driver);
		createaccount.enterFirstName("TEST");
		createaccount.enterLastName("TEST");
		createaccount.enterEmailId(randomEmailId());
		createaccount.enterPassword("test123");
		createaccount.clickOnCreateButton();
		Assert.assertEquals("Challenge – QTEE", driver.getTitle());
		//driver.findElement(By.xpath("//div/div[3]/div[1]/div/div/span[@id='recaptcha-anchor']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@class='shopify-challenge__button btn']")).click();
		Assert.assertEquals("Account – QTEE",driver.getTitle());
	}
	
	
	
	@Test
	public void testCreateAccount_With_Existing_EmailID() throws InterruptedException
	{
		Header header = new Header(driver);
		header.clickOnAccount();
		LogIn login = new LogIn(driver);
		login.clickOnSignIn();
		login.clickOnCreateAnAccount();
		createaccount = new CreateAnAccount(driver);
		createaccount.enterFirstName("TEST");
		createaccount.enterLastName("TEST");
		createaccount.enterEmailId("test1@mailinator.com");
		createaccount.enterPassword("test123");
		createaccount.clickOnCreateButton();
		Assert.assertEquals("Challenge – QTEE", driver.getTitle());
		//driver.findElement(By.xpath("//div/div[3]/div[1]/div/div/span[@id='recaptcha-anchor']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@class='shopify-challenge__button btn']")).click();
		Assert.assertEquals("Create Account – QTEE", driver.getTitle());
		Assert.assertEquals("This email address is already associated with an account. If this account is yours, you can", driver.findElement(By.xpath("//div[@class='errors']/ul/li")));
	}
	@AfterTest
	public void closeBrowser()
	{
	browserQuite();
	}
	

}
