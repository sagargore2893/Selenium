package com.mycompany.demoqt.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.demoqt.testbase.TestBase;

public class CustomProducts extends TestBase {


	/*
	 * Locators
	 */
	@FindBy(xpath="//a[@href='https://qtee.com/Secure/custom-apparel']/img")
	private WebElement apparelimage;
	
	@FindBy(xpath="//a[@href='https://qtee.com/Secure/custom-apparel']/div[1]")
	private WebElement appareltext;
	
	@FindBy(xpath="//a[@href='https://qtee.com/Secure/custom-apparel']/div[2]")
	private WebElement apparelstartnow;
	
	@FindBy(xpath="//a[@href='https://qtee.com/Secure/custom-shoes/']/img")
	private WebElement shoesimage;
	
	@FindBy(xpath="//a[@href='https://qtee.com/Secure/custom-shoes/']/div[1]")
	private WebElement shoestext;
	
	@FindBy(xpath="//a[@href='https://qtee.com/Secure/custom-shoes/']/div[2]")
	private WebElement shoesstartnow;
	
	
	/*
	 * constructor
	 */
	public CustomProducts(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	/*
	 * Methods
	 */
	
	public void clickOnApprelStartNowButton(){
		apparelstartnow.click();
	}
	
	public void cliclOnShoesStartNowButton()
	{
		shoesstartnow.click();
	}
	
	
}
