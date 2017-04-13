package com.mycompany.demoqt.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.demoqt.testbase.TestBase;

public class LogIn extends TestBase {
	//WebDriver driver;

	@FindBy(css=".title")
	private WebElement logintext;
	
	@FindBy(xpath="//div/input[@class='required']")
	private WebElement username;
	
	@FindBy(css="#signInForm>div>fieldset>div>input.password")
	private WebElement password;
	
	@FindBy(css=".submit")
	private WebElement signin;
	
	public LogIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void enterUserName(String UserName)
	{
		username.sendKeys(UserName);
	}
	
	public void enterPassword(String Password)
	{
		password.sendKeys(Password);
	}
	
	public void clickOnSignIn()
	{
		signin.click();
	}

}
