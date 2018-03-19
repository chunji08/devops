package com.mycompany.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//import src.test.java.com.mycompany.app.Exception;
//import src.test.java.com.mycompany.app.String;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Platform;
import java.net.URL;


public class AppTest {
    /*
    @Test
	public void runTestOnDocker() throws Exception {
	DesiredCapabilities dcap = DesiredCapabilities.chrome();
	String driverPath = System.getProperty("user.dir") + "/exe/chromedriver";
	System.setProperty("webdriver.chrome.driver", driverPath);

	// Hub Port at 4444                                                                                                                               
	URL gamelan = new URL("http://localhost:4444/wd/hub");
	WebDriver driver = new RemoteWebDriver(gamelan, dcap);
	// Get URL                                                                                                                                        
	driver.get("https://www.google.com/");
	// Print Title                                                                                                                                    
	System.out.println(driver.getTitle());
    }
    */

    @Test
	public void runTestOnDocker() throws Exception {
	DesiredCapabilities dcap = DesiredCapabilities.chrome();
	String driverPath = System.getProperty("user.dir") + "/exe/chromedriver";
	System.setProperty("webdriver.chrome.driver", driverPath);
	
	// You should check the Port No here.
	URL gamelan = new URL("http://localhost:32770/wd/hub");
	WebDriver driver = new RemoteWebDriver(gamelan, dcap);
	// Get URL
	driver.get("https://www.google.com/");
	// Print Title
	System.out.println(driver.getTitle());
    }
}