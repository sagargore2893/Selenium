package com.mycompany.demoqt.testscripts;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mycompany.demoqt.Pagelibrary.NavigationMenu;
import com.mycompany.demoqt.testbase.TestBase;

public class TestDropdown extends TestBase{
	NavigationMenu navigation ;
	
	@BeforeTest
	public void setUp() throws IOException, InterruptedException
	{
		init();
	    closePopUp();
	}
	
	@Test
	public void testShopoption()
	{
		navigation = new NavigationMenu(driver);
		navigation.clickOnBestSellers();
	}
	

}
