package com.mycompany.demoqt.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.demoqt.testbase.TestBase;

public class QteeRep extends TestBase{
	
	/*
	 * Locators
	 */
	@FindBy(css=".col1>dl>dd>input.firstName")
	private WebElement firstname;
	
	@FindBy(css=".col2>dl>dd>input.lastName")
	private WebElement lastname;
	
	@FindBy(css=".col1>dl>dd>input.email")
	private WebElement email;
	
	@FindBy(css=".col2>dl>dd>input#ConfirmEmail")
	private WebElement confirmemail;
	
	@FindBy(css=".fullWidth>dd>input")
	private WebElement city;
	
	@FindBy(css=".fullWidth>dd>textarea")
	private WebElement socialchannels;
	
	@FindBy(css=".fullWidth>dd>label>div")
	private WebElement checkbox;
	
	@FindBy(xpath="//div[@class='formPage repProgram']/form/input[@type='submit']")
	private WebElement submit;
	
	
	
	/*
	 * Constructor
	 */
	public QteeRep(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	/*
	 * Methods
	 */
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
	
	public void enterStateAndCity(String StateAndCity)
	{
		city.sendKeys(StateAndCity);
	}
	
	public void enterSocialChannels(String SocialChannels){
		socialchannels.sendKeys(SocialChannels);
	}
	
//	public void verifyCheckbox()   //Incomplete logic and method
//	{
//		checkbox.isSelected();
//	}
	
	public void clickOnSubmit()
	{
		submit.click();
	}

}
