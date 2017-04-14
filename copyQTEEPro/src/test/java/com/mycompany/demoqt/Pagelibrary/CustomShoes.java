package com.mycompany.demoqt.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.demoqt.testbase.TestBase;

public class CustomShoes extends TestBase {

	/*
	 * loactors
	 */
	@FindBy(xpath="//div[@id='customShoesLabels']/a[1]")
	private WebElement sujajuicelink;

	@FindBy(xpath="//div[@id='customShoesLabels']/a[2]")
	private WebElement rebekahsteenlink;

	@FindBy(xpath="//div[@id='customShoesLabels']/a[3]")
	private WebElement ropethemoonjewelrylink;
	
	@FindBy(xpath="//div[@id='customShoesImages']/img[1]")
	private WebElement sujajuiceimage;

	@FindBy(xpath="//div[@id='customShoesImages']/img[2]")
	private WebElement rebekahsteenimage;

	@FindBy(xpath="//div[@id='customShoesImages']/img[3]")
	private WebElement ropethemoonjewelryimage;
	
	//locators - on form
	@FindBy(css="#BusinessOrOrganizationName")
	private WebElement buisnessname;
	

	@FindBy(css="#Address")
	private WebElement address;
	

	@FindBy(css="#ContactName")
	private WebElement contactname;
	

	@FindBy(css=".intPhone")
	private WebElement phone;
	

	@FindBy(css="#Website")
	private WebElement website;
	

	@FindBy(css="#Email")
	private WebElement email;

	@FindBy(css="#AboutCompany")
	private WebElement companydescription;
	
//  INCOMPLETE
//	@FindBy()
//	private WebElement checkbox1;
//	@FindBy()
//	private WebElement checkbox2;
	
	@FindBy(xpath="//form[@class='lpForm']/input[@type='submit']")
	private WebElement submit;
	
/*
 * Constructor
 */
	public CustomShoes(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	/*
	 * All methods
	 */
	
	public void clickOnSujaJuice()
	{
		sujajuicelink.click();
	}
	
	public boolean checkSujaJuiceImage(){
		if(sujajuiceimage.isDisplayed()==true)
		{
			return true;
		}
		else{
		return false;
		}
	}
	
	public void clickOnRebekahSteen()
	{
		rebekahsteenlink.click();
	}
	
	public boolean checkRebekahSteenImage(){
		if(rebekahsteenlink.isDisplayed()==true)
		{
			return true;
		}
		else{
		return false;
		}
	}
	
	public void clickOnRopeTheMoonJewelry()
	{
		ropethemoonjewelrylink.click();
	}
	
	public boolean checkRopeTheMoonJewelryImage(){
		if(ropethemoonjewelrylink.isDisplayed()==true)
		{
			return true;
		}
		else{
		return false;
		}
	}
	
	
	public void enterBuisnessName(String BuisnessName)
	{
		buisnessname.sendKeys(BuisnessName);
	}
	
	public void enterAddress(String Address)
	{
		address.sendKeys(Address);
	}
	
	public void enterContactName(String ContactName)
	{
		contactname.sendKeys(ContactName);
	}
	
	public void enterPhoneNumber(String PhoneNumber)
	{
		phone.sendKeys(PhoneNumber);
	}
	
	public void enterWebSite(String WebSite)
	{
		website.sendKeys(WebSite);
	}
	
	public void enterEmailId(String EmailID)
	{
		email.sendKeys(EmailID);
	}
	
	public void enterAboutCompany(String AboutCompany)
	{
		companydescription.sendKeys(AboutCompany);
	}
	
	
	//check box methods are remaining
	
	public void clickOnSubmit()
	{
		submit.click();
	}
}
