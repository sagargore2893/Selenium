
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

public class TestLogin extends TestBase{

	LogIn logIn;
	
	@BeforeTest
	public void setUp() throws IOException, InterruptedException
	{
		init();
	    //closePopUp();
	}
	
	@Test
	public void testLoginPageIsDisplayed() throws InterruptedException
	{
		Header header = new Header(driver);
		header.clickOnAccount();
		Assert.assertEquals("Account – QTEE",driver.getTitle());
//		System.out.println(driver.findElement(By.cssSelector("#customer-login>div>h2")).getText());
		Assert.assertEquals("CUSTOMER LOGIN", driver.findElement(By.cssSelector("#customer-login>div>h2")).getText());
	}
	
	@Test
	public void testFieldValidation() throws InterruptedException
	{
		Header header = new Header(driver);
		header.clickOnAccount();
		logIn = new LogIn(driver);
		logIn.clickOnSignIn();
		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.xpath("//form[@id='customer_login']/div[1]/ul/li")).getText());
		Assert.assertEquals("Invalid login credentials.", driver.findElement(By.xpath("//form[@id='customer_login']/div[1]/ul/li")).getText());
	}
	
	
	@Test
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
	
	
	@Test     //email id is present in the system
	public void testValidRecoverPassword() throws InterruptedException
	{
		Header header = new Header(driver);
		header.clickOnAccount();
		logIn = new LogIn(driver);
		logIn.recoverPassword("test@mailinator.com");
		Thread.sleep(3000);
		Assert.assertNotEquals("No account found with that email.", driver.findElement(By.cssSelector("#customer-login>div>h2")).getText());
	}
	
	@Test   //email id is not present in the system
	public void testInvalidRecoverPassword() throws InterruptedException
	{
		Header header = new Header(driver);
		header.clickOnAccount();
		logIn = new LogIn(driver);
		logIn.recoverPassword("test888@mailinator.com");
		Thread.sleep(3000);
		Assert.assertEquals("No account found with that email.", driver.findElement(By.cssSelector("#recover-password>form>div>ul>li")).getText());
	}
	
	@AfterTest
	public void closeBrowser()
	{
	browserQuite();
	}

}
