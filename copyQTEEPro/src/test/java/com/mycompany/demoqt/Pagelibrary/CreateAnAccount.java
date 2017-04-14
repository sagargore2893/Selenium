package com.mycompany.demoqt.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.demoqt.testbase.TestBase;

public class CreateAnAccount extends TestBase{
	
	
	@FindBy(css="#accountContainer>h2")
	private WebElement createaccounttext;

	@FindBy(css=".editor-label>input#FirstName")
	private WebElement firstname;

	@FindBy(css=".editor-label>input#LastName")
	private WebElement lastname;

	@FindBy(css=".editor-label>input#Email")
	private WebElement email;

	@FindBy(css=".editor-label>input#ConfirmEmail")
	private WebElement confirmemail;
 
	@FindBy(css=".editor-label>input#Password")
	private WebElement password;

	@FindBy(css=".editor-label>input#ConfirmPassword")
	private WebElement confirmpassword;
	
	
	@FindBy(xpath="//div[@class='chosen-drop']/ul/li[7]")
	private WebElement selectquestion;
	
	@FindBy(css=".editor-label>input#SecurityAnswer")
	private WebElement securityanswer;
	
	@FindBy(css=".rememberMe>label>div")
	private WebElement checkbox;
	
	@FindBy(css=".submit>input")
	private WebElement createaccountbutton;
	
	@FindBy(xpath="//div/a[@href='https://qtee.com/Secure/Account/GetFacebookUrl']")
	private WebElement facebookloginbutton;
	
	
	/*
	 * CONSTRUCTOR
	 */
	public CreateAnAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	
//	public void verifyCreateAccontPage()    //logic is incomplete
//	{
//		createaccounttext.isDisplayed();
//	}
	
	public void enterFirstName(String FirstName)
	{
		firstname.sendKeys(FirstName);
	}
	
	public void enterLastName(String LastName)
	{
		lastname.sendKeys(LastName);
	}
	
	public void enterEmailId(String EmailID)
	{
		email.sendKeys(EmailID);
	}
	
	public void enterConfirmEmailId(String ConfirmEmailID)
	{
		confirmemail.sendKeys(ConfirmEmailID);
	}
	
	public void  enterPassword(String Password)
	{
		password.sendKeys(Password);
	}
	
	public void enterConfirmPassword(String ConfirmPassword)
	{
		confirmpassword.sendKeys(ConfirmPassword);
	}
	
	public void selectSecurityQuestion()
	{
		selectquestion.click();
	}
	
	public void enterSecurityAnswer(String SecurityAnswer)
	{
		securityanswer.sendKeys(SecurityAnswer);
	}
	
//	public void verifyCheckbox()   //logic is incomplete
//	{
//		checkbox.isSelected();
//	}
	
	public void clickOnCreateAccountButton()
	{
		createaccountbutton.click();
	}
	
	public void clickOnFacebookLoginButton()
	{
		facebookloginbutton.click();
	}

}
