package com.mycompany.demoqt.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mycompany.demoqt.Pagelibrary.NavigationMenu;
import com.mycompany.demoqt.testbase.TestBase;

@Listeners(com.mycompany.demoqt.customelistener.Listner.class)

public class TestSortPageValidation extends TestBase{
	NavigationMenu navigation ;
	
	@BeforeTest
	public void setUp() throws IOException, InterruptedException
	{
		init();
	    //closePopUp();
	}
	
	@Test
	public void test_sort_page_validation_under_Shop_dropdown_option()
	{
		navigation = new NavigationMenu(driver);
		navigation.clickOnBestSellers();
		Assert.assertEquals("BEST SELLERS – QTEE", driver.getTitle());
		navigation.clickOnBeachBabe();
		Assert.assertEquals("BEACH BABE – QTEE", driver.getTitle());
		navigation.clickOnFestivalBound();
		Assert.assertEquals("FESTIVAL BOUND – QTEE", driver.getTitle());
		navigation.clickOnFoodie();
	    Assert.assertEquals("FOODIE – QTEE", driver.getTitle());
	}
	
	@Test
	public void test_sort_page_validation_under_Apparel_dropdown_option()
	{
		navigation = new NavigationMenu(driver);
		navigation.clickOnGraphicTees();;
		Assert.assertEquals("GRAPHIC TEES – QTEE", driver.getTitle());
		navigation.clickOnBoyShorts();
		Assert.assertEquals("BOY SHORTS – QTEE", driver.getTitle());
		navigation.clickOnSwetShirts();
		Assert.assertEquals("SWEATSHIRTS – QTEE", driver.getTitle());
	}
	
	
	@Test
	public void test_sort_page_validation_under_Shoes_dropdown_option()
	{
		navigation = new NavigationMenu(driver);
		navigation.clickOnConverseLowTop();
		Assert.assertEquals("CONVERSE LOW TOP – QTEE", driver.getTitle());
		navigation.clickOnSandals();
		Assert.assertEquals("SANDALS – QTEE", driver.getTitle());
	}
	
	
	@Test
	public void test_sort_page_validation_under_Accessories_dropdpwn_option()
	{
		navigation = new NavigationMenu(driver);
		navigation.clickOnCanvasToteBags();
		Assert.assertEquals("CANVAS TOTE BAGS – QTEE", driver.getTitle());
		navigation.clickOnPhoneCases();
		Assert.assertEquals("PHONE CASES – QTEE", driver.getTitle());
		navigation.clickOnJwellary();
		Assert.assertEquals("JEWELRY – QTEE", driver.getTitle());
		navigation.clickOnPillows();
		Assert.assertEquals("PILLOWS – QTEE", driver.getTitle());
	}
	
	@Test
	public void test_create_your_own_page_validation()
	{
		navigation = new NavigationMenu(driver);
		navigation.clickOnCreateYourOwn();
		Assert.assertEquals("Qtee", driver.getTitle());
		driver.navigate().back();
	}
	
	@Test
	public void test_shop_instagram_page_validation()
	{
		navigation = new NavigationMenu(driver);
        navigation.clickOnQteeRep();
        Assert.assertEquals("QTEE CAMPUS REP", driver.getTitle());
	}
	
	@Test
	public void test_our_charity_page_validation()
	{
		navigation = new NavigationMenu(driver);
        navigation.clickOnOurCharity();
        Assert.assertEquals("OUR CHARITY – QTEE", driver.getTitle());
		
	}
	
	
	@AfterTest
	public void closeBrowser()
	{
		browserQuite();
	}

}
