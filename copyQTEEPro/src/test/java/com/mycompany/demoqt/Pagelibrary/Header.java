package com.mycompany.demoqt.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.demoqt.testbase.TestBase;

public class Header extends TestBase {

	//WebDriver driver;
	@FindBy(xpath="//a[@class='search-show']")
	private  WebElement search;
	
	@FindBy(xpath="//a[@href='/account/login']/i")
	private WebElement login;

	@FindBy(xpath="//a[@class='custom-font slide-menu slide-menu-cart']/i")
	private WebElement cart;
	
	
	//initialize the object using constructor
	public Header(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void clickOnAccount() throws InterruptedException
	{
		login.click();
		Thread.sleep(5000);
	}
	
	public void clickOnCart()
	{
		cart.click();
	}
	
	public void clickOnSearch()
	{
		search.click();
	}
	
	
	
}
