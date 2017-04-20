package com.silicus.flights;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.silicus.library.BaseTestClass;

public class SearchFlightsClass extends BaseTestClass {

    @Test
    public void testSearchFlights() throws InterruptedException {
        System.out.println("Flight Search");

//        driver.findElement(By.xpath("//input[@class='ui-state-default ui-combobox-input ui-autocomplete-input ui-widget ui-widget-content ui-corner-left']")).sendKeys("Bangalore, India (BLR)");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@tabindex='5']")).sendKeys("Mumbai, India (BOM)");
//        driver.findElement(By.xpath("//a[@class='date_field_tab flL make_relative left']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.linkText("26")).click();
//        driver.findElement(By.name("submit_name")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//div[@class='grenBttn']")).click();

        /*
         Actions at = new Actions(driver);
         WebElement from = driver.findElement(By.xpath("//input[@class='ui-state-default ui-combobox-input ui-autocomplete-input ui-widget ui-widget-content ui-corner-left']"));
         //at.sendKeys(Keys.ENTER).perform();	
         */
        System.out.println("Flights Searched Done");
    }
}
