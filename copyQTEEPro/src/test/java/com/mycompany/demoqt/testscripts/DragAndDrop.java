package com.mycompany.demoqt.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

	
	@Test
	public void drag() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//src//test//java//com//mycompany//demoqt//browserproperty//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
		
	}

}
