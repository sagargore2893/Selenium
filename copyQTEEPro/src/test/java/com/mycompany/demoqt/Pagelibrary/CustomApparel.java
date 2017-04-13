package com.mycompany.demoqt.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomApparel {
	
	WebDriver driver;

	/*
	 * Locators
	 */
	
	@FindBy(css="#ContactName")
	private WebElement contactName;
	
	@FindBy(css="#PhoneNumber")
	private WebElement phonenumber;
	
	@FindBy(css="#Email")
	private WebElement emailid;
	
	@FindBy(css="#ConfirmEmail")
	private WebElement confirmemailid;
	
	@FindBy(css="#DesignerMessage")
	private WebElement designermessage;
	
	//check box locators remaining
	
	@FindBy(css="//form[@class='lpForm']/input[@type='submit']")
	private WebElement submit;
	
	
	/*
	 * Constructor
	 */
	public CustomApparel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	/*
	 * Methods
	 */
	
	public void enterContactName(String ContactName)
	{
		contactName.sendKeys(ContactName);
	}
	
	public void enterPhone(String Phone)
	{
		phonenumber.sendKeys(Phone);
	}
	
	public void enterEmail(String Email)
	{
		emailid.sendKeys(Email);
	}
	
	public void enterConfirmEmail(String ConfirmEmail)
	{
		confirmemailid.sendKeys(ConfirmEmail);
	}
	
	public void enterDesignerDescription(String description)
	{
		designermessage.sendKeys(description);
	}
	
	public void clickOnSubmit()
	{
		submit.click();
	}

}
