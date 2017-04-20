package com.mycompany.demoqt.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.demoqt.testbase.TestBase;

public class NavigationMenu extends TestBase{

	//locators for main navigation menu
	@FindBy(xpath="//nav/ul/li[1]")
	private WebElement shopcollections;


	@FindBy(xpath="//nav/ul/li[2]")
	private WebElement shoes;
	

	@FindBy(xpath="//nav/ul/li[3]")
	private WebElement sandals;
	

	@FindBy(xpath="//nav/ul/li[4]")
	private WebElement apparel;
	

	@FindBy(xpath="//nav/ul/li[5]")
	private WebElement accessories;
	

	@FindBy(xpath="//nav/ul/li[6]")
	private WebElement shopinstagram;
	

	@FindBy(xpath="//nav/ul/li[7]")
	private WebElement sale;
	

	@FindBy(xpath="//nav/ul/li[8]")
	private WebElement collaborations;
	
	
	/*
	 * Constructor
	 */
	public NavigationMenu(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	/*
	 * Methods for main navigation menu
	 */

	public void clickOnShopCollections()
	{
		shopcollections.click();
	}
	
	public void clickOnShoes()
	{
		shoes.click();
	}
	
	public void clickOnSandals()
	{
		sandals.click();
	}
	
	public void clickOnApparel()
	{
		apparel.click();
	}
	
	public void clickOnAccessories()
	{
		accessories.click();
	}
	
	public void clickOnShopInstagram()
	{
		shopinstagram.click();
	}
	
	public void clickOnSale()
	{
		sale.click();
	}
	
	public void Collaborations()
	{
		collaborations.click();
	}
	
	
	//hover-over methods 
	
}
