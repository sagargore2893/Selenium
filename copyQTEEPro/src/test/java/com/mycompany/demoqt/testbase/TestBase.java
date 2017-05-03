package com.mycompany.demoqt.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
	public static Properties Repositary = new Properties();
	public File f;
	public FileInputStream FI;
	public WebDriver driver;
	
	public void init() throws IOException
	{
		loadPropertiesFile();
		selectBrowser(Repositary.getProperty("browser"));
		driver.get(Repositary.getProperty("url"));	
	}
	
	public void loadPropertiesFile() throws IOException
	{
		f = new File(System.getProperty("user.dir")+"//src//test//java//com//mycompany//demoqt//config//config.properties");
		FI = new FileInputStream(f);
		Repositary.load(FI);
	}
	
	public WebDriver selectBrowser (String browser)
	{
		if(browser.equals("FIREFOX")||browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//src//test//java//com//mycompany//demoqt//browserproperty//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}else if(browser.equals("CHROME")||browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//java//com//mycompany//demoqt//browserproperty//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}else if(browser.equals("IE")||browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//src//test//java//com//mycompany//demoqt//browserproperty//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		}
		return null;
	}
	
	public void closePopUp() throws InterruptedException
	{
		driver.findElement(By.cssSelector("#lpModalClose")).click();
		Thread.sleep(5000);
	}
	
	public void browserQuite()
	{
		driver.quit();
	}
	
	public String randomEmailId()
	{
		Random randomemail =new Random();
		int randomInt = randomemail.nextInt(1000);
		String RandomEail = "user"+randomInt+"@mailinator.com";
		return RandomEail;
	}

	

}
