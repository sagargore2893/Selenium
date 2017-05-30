package com.mycompany.demoqt.Pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.demoqt.testbase.TestBase;

public class NavigationMenu extends TestBase{

	//locators for main navigation menu
	@FindBy(xpath="//ul[@class='nav nav-pills']/li[1]")
	private WebElement shopdropdown;


	@FindBy(xpath="//ul[@class='nav nav-pills']/li[2]")
	private WebElement appareldropdown;
	

	@FindBy(xpath="//ul[@class='nav nav-pills']/li[3]")
	private WebElement shoesdropdown;
	

	@FindBy(xpath="//ul[@class='nav nav-pills']/li[4]")
	private WebElement accessoriesdropdown;
	

	@FindBy(xpath="//ul[@class='nav nav-pills']/li[5]")
	private WebElement createyourown;
	

	@FindBy(xpath="//ul[@class='nav nav-pills']/li[6]")
	private WebElement qteerep;
	

	@FindBy(xpath="//ul[@class='nav nav-pills']/li[7]")
	private WebElement ourcharity;
	
	
	/*
	 * Constructor
	 */
	public NavigationMenu(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	/*
	 * Select options present under SHOP menu
	 */
	public void clickOnBestSellers()
	{
		shopdropdown.click();
		driver.findElement(By.xpath("//ul[@class='nav nav-pills']/li[1]/ul/li[1]")).click();
	}
	public void clickOnBeachBabe()
	{
		shopdropdown.click();
		driver.findElement(By.xpath("//ul[@class='nav nav-pills']/li[1]/ul/li[2]")).click();
	}
	public void clickOnFestivalBound()
	{
		shopdropdown.click();
		driver.findElement(By.xpath("//ul[@class='nav nav-pills']/li[1]/ul/li[3]")).click();
	}
	public void clickOnFoodie()
	{
		shopdropdown.click();
		driver.findElement(By.xpath("//ul[@class='nav nav-pills']/li[1]/ul/li[4]")).click();
	}
	
	/*
	 *  Select options present under APPAREL menu
	 */
	public void clickOnGraphicTees()
	{
		appareldropdown.click();
		driver.findElement(By.xpath("//ul[@class='nav nav-pills']/li[2]/ul/li[1]")).click();
	}
	public void clickOnSwetShirts()
	{
		appareldropdown.click();
		driver.findElement(By.xpath("//ul[@class='nav nav-pills']/li[2]/ul/li[2]")).click();
	}
	public void clickOnBoyShorts()
	{
		appareldropdown.click();
		driver.findElement(By.xpath("//ul[@class='nav nav-pills']/li[2]/ul/li[3]")).click();
	}
	
	/*
	 * Select options present under SHOES menu
	 */
	public void clickOnConverseLowTop()
	{
		shoesdropdown.click();
		driver.findElement(By.xpath("//ul[@class='nav nav-pills']/li[3]/ul/li[1]")).click();
	}
	public void clickOnSandals()
	{
		shoesdropdown.click();
		driver.findElement(By.xpath("//ul[@class='nav nav-pills']/li[3]/ul/li[2]")).click();
	}
	
	/*
	 * Select options present under ACCESSORIES menu.
	 */
	public void clickOnCanvasToteBags()
	{
		accessoriesdropdown.click();
		driver.findElement(By.xpath("//ul[@class='nav nav-pills']/li[4]/ul/li[1]")).click();
	}
	public void clickOnPhoneCases()
	{
		accessoriesdropdown.click();
		driver.findElement(By.xpath("//ul[@class='nav nav-pills']/li[4]/ul/li[2]")).click();
	}
	public void clickOnJwellary()
	{
		accessoriesdropdown.click();
		driver.findElement(By.xpath("//ul[@class='nav nav-pills']/li[4]/ul/li[3]")).click();
	}
	public void clickOnPillows()
	{
		accessoriesdropdown.click();
		driver.findElement(By.xpath("//ul[@class='nav nav-pills']/li[4]/ul/li[4]")).click();
	}
	
	/*
	 * Click on CREATE YOUR OWN menu
	 */
	public void clickOnCreateYourOwn()
	{
		createyourown.click();
	}
	
	/*
	 * Click ON QTEE REP menu
	 */
	
	public void clickOnQteeRep()
	{
		qteerep.click();
	}
	
	/*
	 * Click on OUR CHARITY menu
	 */
	public void clickOnOurCharity()
	{
		ourcharity.click();
	}
}
