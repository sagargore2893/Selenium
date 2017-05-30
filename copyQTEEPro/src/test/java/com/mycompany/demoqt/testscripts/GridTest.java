package com.mycompany.demoqt.testscripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

 @Test
 public void gridTesting() throws MalformedURLException{
  
  DesiredCapabilities cap = DesiredCapabilities.chrome();
  cap.setPlatform(Platform.WIN8_1);
  URL url = new URL("http://10.55.0.16:5555/wd/hub");
  
  WebDriver driver = new RemoteWebDriver(url,cap);
  driver.get("http://www.google.com");
  driver.manage().window().maximize();
  System.out.println(driver.getTitle());
 
 }
}
