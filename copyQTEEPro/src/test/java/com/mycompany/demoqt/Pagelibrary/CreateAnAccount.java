package com.mycompany.demoqt.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.demoqt.testbase.TestBase;

public class CreateAnAccount extends TestBase{
	
	
	@FindBy(css="#create-customer>div>h2.title")
	private WebElement createaccountheading;

	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstname;

	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastname;

	@FindBy(xpath="//input[@id='email']")
	private WebElement email;

	@FindBy(xpath="//input[@id='password']")
	private WebElement password;

	@FindBy(css=".action_bottom>input.btn.btn-success")
	private WebElement createbutton;
	
//	@FindBy(css=".editor-label>input#ConfirmEmail")
//	private WebElement confirmemail;

//	@FindBy(css=".editor-label>input#ConfirmPassword")
//	private WebElement confirmpassword;
		
//	@FindBy(xpath="//div[@class='chosen-drop']/ul/li[7]")
//	private WebElement selectquestion;
	
//	@FindBy(css=".editor-label>input#SecurityAnswer")
//	private WebElement securityanswer;
	
//	@FindBy(css=".rememberMe>label>div")
//	private WebElement checkbox;
	
//	@FindBy(xpath="//div/a[@href='https://qtee.com/Secure/Account/GetFacebookUrl']")
//	private WebElement facebookloginbutton;
	
	
	/*
	 * CONSTRUCTOR to initialize the object
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
	
	public void  enterPassword(String Password)
	{
		password.sendKeys(Password);
	}
	public void clickOnCreateButton()
	{
		createbutton.click();
	}
	
	
//	public void enterConfirmEmailId(String ConfirmEmailID)
//	{
//		confirmemail.sendKeys(ConfirmEmailID);
//	}
//	public void enterConfirmPassword(String ConfirmPassword)
//	{
//		confirmpassword.sendKeys(ConfirmPassword);
//	}
//	public void selectSecurityQuestion()
//	{
//		selectquestion.click();
//	}
//	public void enterSecurityAnswer(String SecurityAnswer)
//	{
//		securityanswer.sendKeys(SecurityAnswer);
//	}
//	public void verifyCheckbox()   //logic is incomplete
//	{
//		checkbox.isSelected();
//	}
//	public void clickOnFacebookLoginButton()
//	{
//		facebookloginbutton.click();
//	}

}
