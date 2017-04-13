package com.mycompany.demoqt.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.demoqt.testbase.TestBase;

public class AboutUs extends TestBase{
	
	
	@FindBy(xpath="//h2[@class='title']")
    private WebElement pageheading; 
	
	public AboutUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
}
