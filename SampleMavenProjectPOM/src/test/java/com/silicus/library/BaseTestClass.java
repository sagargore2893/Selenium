package com.silicus.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTestClass {

    public WebDriver driver;

    @Parameters({"browser", "port"})
    @BeforeClass
    public void browserLaunch(String browser, String port) {
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setBrowserName(browser);
        if (browser.equals("firefox")) {
            capability = DesiredCapabilities.firefox();
        } else if (browser.equals("chrome")) {
            capability = DesiredCapabilities.chrome();
        } else if (browser.equals("internet explorer")) {
            capability = DesiredCapabilities.internetExplorer();
            capability.setJavascriptEnabled(true);
            capability.setCapability("ignoreZoomSetting", true);
        } else if (browser.equals("safari")) {
            capability = DesiredCapabilities.safari();
        }
        try {
            System.out.println("Browser Launching");
            driver = new RemoteWebDriver(new URL("http://localhost:".concat(
                    port).concat("/wd/hub")), capability);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
//        driver.get("http://www.makemytrip.com");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public void browserQuit() {
        System.out.println("Browser Closed");
        driver.quit();
    }
}
