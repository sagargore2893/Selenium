
package com.mycompany.demoqt.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mycompany.demoqt.Pagelibrary.Header;
import com.mycompany.demoqt.Pagelibrary.LogIn;
import com.mycompany.demoqt.testbase.TestBase;

public class CreateAccountAndSignInTest extends TestBase{

	LogIn logIn;
	
	@BeforeTest
	public void setUp() throws IOException, InterruptedException
	{
		init();
	    //closePopUp();
	}
	
	@Test(priority=1)
	public void testLoginPageIsDisplayed() throws InterruptedException
	{
		Header header = new Header(driver);
		header.clickOnAccount();
		Assert.assertEquals("Account – QTEE",driver.getTitle());
	}
	
	@Test(priority=2)
	public void testValidation() throws InterruptedException
	{
		Header header = new Header(driver);
		header.clickOnAccount();
		logIn = new LogIn(driver);
		logIn.clickOnSignIn();
		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.xpath("//form[@id='customer_login']/div[1]/ul/li")).getText());
		Assert.assertEquals("Invalid login credentials.", driver.findElement(By.xpath("//form[@id='customer_login']/div[1]/ul/li")).getText());
	}
	
	
	@Test(priority=3)
	public void testLogIn() throws InterruptedException
	{
		Header header = new Header(driver);
		header.clickOnAccount();
		logIn = new LogIn(driver);
		logIn.enterEmail("test@mailinator.com");
		logIn.enterPassword("test123");
		logIn.clickOnSignIn();
		Thread.sleep(3000);
		//System.out.println(driver.findElement(By.xpath(".//*[@id='main']/div/div/div[1]/h2")).getText());
		Assert.assertEquals("MY ACCOUNT", driver.findElement(By.xpath(".//*[@id='main']/div/div/div[1]/h2")).getText());
		driver.findElement(By.xpath("//a[@href='/account/logout']")).click();
	}
	
	@AfterTest
	public void closeBrowser()
	{
	browserQuite();
	}

}
