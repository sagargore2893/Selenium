
package com.mycompany.demoqt.testscripts;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mycompany.demoqt.Pagelibrary.Header;
import com.mycompany.demoqt.Pagelibrary.LogIn;
import com.mycompany.demoqt.testbase.TestBase;

public class CreateAccountAndSignInTest extends TestBase{

	LogIn logIn;
	
	@BeforeClass
	public void setUp() throws IOException, InterruptedException
	{
		init();
	    closePopUp();
	}
	
	@Test
	public void testLogIn() throws InterruptedException
	{
		Header header = new Header(driver);
		header.clickOnAccount();
		logIn = new LogIn(driver);
		logIn.enterUserName("nisargak@lampsplus.com");
		logIn.enterPassword("test123");
		logIn.clickOnSignIn();
	}
	

}
