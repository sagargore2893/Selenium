package com.mycompany.demoqt.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.demoqt.testbase.TestBase;

public class LogIn extends TestBase {
	//WebDriver driver;

	
	
	@FindBy(id="customer_email")
	private WebElement email;
	
	@FindBy(id="customer_password")
	private WebElement password;
	
	@FindBy(css="#customer-login>form>div>input[class='btn btn-success']")
	private WebElement signin;
	
	@FindBy(xpath="//a[@href='/account/register']")
	private WebElement createaccount;
	
	@FindBy(css="#recover_email>input#recover-email")
	private WebElement recoveremail;
	
	@FindBy(css="#recover-password>form>div>input.btn.btn-success")
	private WebElement submit;
	
	
	
	/*constructor*/
	public LogIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	
	
	/*Methods*/
	public void enterEmail(String Email)
	{
		email.sendKeys(Email);
	}
	
	public void enterPassword(String Password)
	{
		password.sendKeys(Password);
	}
	
	public void clickOnSignIn()
	{
		signin.click();
	}
	
	
	public void clickOnCreateAnAccount()
	{
		createaccount.click();
	}
	
	
	public void recoverPassword(String RecoverEmail)
	{
		recoveremail.sendKeys(RecoverEmail);
		submit.click();
	}
	
}
