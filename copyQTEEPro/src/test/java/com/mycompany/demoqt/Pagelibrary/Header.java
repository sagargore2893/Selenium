package com.mycompany.demoqt.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.demoqt.testbase.TestBase;

public class Header extends TestBase {

	//WebDriver driver;
	
	@FindBy(xpath="//a[@href='/account/login']/i")
	private WebElement login;

	public Header(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void clickOnAccount() throws InterruptedException
	{
		login.click();
		Thread.sleep(5000);
	}
	
	
	
}
