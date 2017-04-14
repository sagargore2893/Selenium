package com.mycompany.demoqt.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.demoqt.testbase.TestBase;

public class ForgotMyPassword extends  TestBase {
	
	
	@FindBy(css="#IdEmail")
	private WebElement emailid;
	
	@FindBy(css=".submit")
	private WebElement send;
	
/*
 * Constructor
 */
	public ForgotMyPassword(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	
/*
 * 	 Methods 
*/
	public void enterEmailId(String Email)
	{
		emailid.sendKeys(Email);
	}
	
	public void clickOnSend()
	{
		send.click();
	}
	

}
