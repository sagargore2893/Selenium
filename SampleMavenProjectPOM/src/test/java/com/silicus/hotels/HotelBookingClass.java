package com.silicus.hotels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.silicus.library.BaseTestClass;

public class HotelBookingClass extends BaseTestClass {

    @Test
    public void testHotelBooking() throws InterruptedException {
        System.out.println("Book the Hotel");

        driver.findElement(By.xpath("//li/a/span[text()='Hotels']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a/span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
        Thread.sleep(2000);
        Actions at = new Actions(driver);
        at.sendKeys(Keys.ARROW_DOWN).perform();
        at.sendKeys(Keys.ENTER).perform();

        driver.findElement(By.xpath("//a[@class='date_field_tab flL make_relative left']")).click();
        driver.findElement(By.linkText("26")).click();
        driver.findElement(By.xpath("//a[@class='date_field_tab flL make_relative right']")).click();
        driver.findElement(By.linkText("28")).click();
        driver.findElement(By.name("submit_name")).click();

    }
}
