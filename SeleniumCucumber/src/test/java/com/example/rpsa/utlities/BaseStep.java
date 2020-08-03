package com.example.rpsa.utlities;

//https://stackoverflow.com/questions/45780919/shared-webdriver-becomes-null-on-second-scenario-using-picocontainer
//https://stackoverflow.com/questions/24029341/before-doesnt-execute-in-java-cucumber-step/24234403
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseStep {

	public WebDriver baseDriver = null;

	@Before
	public void setUp() throws Exception {
		System.out.println("**Inside setUp() method***********");
		// initialize the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\WebDrivers\\Chrome\\chromedriver.exe");
		baseDriver = new ChromeDriver();

	}

	public WebDriver getDriver() {
		return baseDriver;
	}

	@After
	public void tearDown() {
		baseDriver.quit();
	}
}
