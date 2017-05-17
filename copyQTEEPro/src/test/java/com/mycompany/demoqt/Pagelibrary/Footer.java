package com.mycompany.demoqt.Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer {
	WebDriver driver;

	/*
	 * locators present in footer
	 */
	
	//!!!!!NEED HELP!!!!!!!!
//	@FindBy(xpath="//div/dl[1]/dd[1]")
//	private WebElement contactus;
	
	@FindBy(xpath="//div/dl[1]/dd[2]")
	private WebElement returnsAndExchange;
	
//	@FindBy(xpath="//div/dl[1]/dd[3]")
//	private WebElement shippingInfo;
	
//	@FindBy(xpath="//div/dl[1]/dd[4]")
//	private WebElement orderStatus;
	
	//!!!!!!QUICKQ's
	@FindBy(xpath="//div/dl[2]/dd[1]")
	private WebElement faq;
	
	
	@FindBy(xpath="//div/dl[2]/dd[2]")
	private WebElement sizeChart;
	
	@FindBy(xpath="//div/dl[2]/dd[3]")
	private WebElement emailSettings;
	
	
//	@FindBy(xpath="//div/dl[2]/dd[4]")
//	private WebElement howToCustomize;
	
	
	//!!!!!!!!COMPANY!!!!!!!!!!
//	@FindBy(xpath="//div/dl[3]/dd[1]")
//	private WebElement aboutUs;

	@FindBy(xpath="//div/dl[3]/dd[2]")
	private WebElement affiliates;

//	@FindBy(xpath="//div/dl[3]/dd[3]")
//	private WebElement feedback;

//	@FindBy(xpath="//div/dl[3]/dd[4]")
//	private WebElement community;

	@FindBy(xpath="//div/dl[3]/dd[5]")
	private WebElement blog;
	
	
	//!!!!!!!!FIND US ON !!!!!!!!!!!
	@FindBy(xpath="//div[@class='socialMediaIconsContainer']/ul/li[1]")
	private WebElement twitter ;

	@FindBy(xpath="//div[@class='socialMediaIconsContainer']/ul/li[2]")
	private WebElement facebook ;

	@FindBy(xpath="//div[@class='socialMediaIconsContainer']/ul/li[3]")
	private WebElement pinterest;

	@FindBy(xpath="//div[@class='socialMediaIconsContainer']/ul/li[4]")
	private WebElement instagram;

	//privacy policy---site map------terms
	@FindBy(xpath="//div[@class='legal']/ul/li[1]")
	private WebElement privacypolicy;
	
	@FindBy(xpath="//div[@class='legal']/ul/li[2]")
	private WebElement terms;
	
	@FindBy(xpath="//div[@class='legal']/ul/li[3]")
	private WebElement sitemap;
	
	
	//!!!!!!!WANT CUTE STUFF!!!!!!!!!
	@FindBy(css="#gsEmail")
	private WebElement subscibeemail;
	
	@FindBy(xpath="//div[@class='emailSubscribe']/form/input")
	private WebElement emailsubmit;
	

	
	/*
	 * Constructor
	 */
	public Footer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	/*
	 * Methods 
	 */
	
//	public void clickOnConatctUs()
//	{
//		contactus.click();
//	}
//	
//	public void clickOnReturnsAndExchanges()
//	{
//		returnsAndExchange.click();
//	}
//	
//	public void clickOnShippingInfo()
//	{
//		shippingInfo.click();
//	}
//	
//	public void clickOnOrderStatus()
//	{
//		orderStatus.click();
//	}
//	
	public void clickOnFaq()
	{
		faq.click();
	}
	
	public void clickOnSizeCharts()
	{
		sizeChart.click();
	}
	
	public void clickOnEmailSetting()
	{
		emailSettings.click();
	}
	
//	public void clickOnHowtoCustomize()
//	{
//		howToCustomize.click();
//	}
//	
//	public void clickOnAboutUs()
//	{
//		aboutUs.click();
//	}
//	
//	public void clickOnAffiliates()
//	{
//		affiliates.click();
//	}
//	
//	public void clickOnFeedback()
//	{
//		feedback.click();
//	}
//	
//	public void clickOnCommunity(){
//		community.click();
//	}
//	
	public void clickOnBlog()
	{
		blog.click();
	}
	
	
	
	
	//Methods for  social media icons
	public void clickOnTwitter()
	{
		twitter.click();
	}
	
	public void clickOnFacebook()
	{
		facebook.click();
	}
	
	public void clickOnPinterest()
	{
		pinterest.click();
	}
	
	public void clickOnInstagram()
	{
		instagram.click();
	}
	
	
	//Methods for privacy policy -terms------site map
	public void clickOnPrivacyPolicy()
	{
		privacypolicy.click();
	}
	
	public void clickOnTerms()
	{
		terms.click();
	}
	
	public void clickOnSiteMap()
	{
		sitemap.click();
	}
	
	
	
	
	// Email subscription related methods
	public void enterSubscibrEmailId(String SubEmailId)
	{
		subscibeemail.sendKeys(SubEmailId);
	}
	
	public void clickOnSubmit()
	{
		emailsubmit.click();
	}
	

}
