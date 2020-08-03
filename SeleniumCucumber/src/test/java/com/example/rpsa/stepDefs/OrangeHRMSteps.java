package com.example.rpsa.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSteps {
	
	
	WebDriver driver;
	

	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\WebDrivers\\Chrome\\chromedriver.exe");
		driver= new ChromeDriver();
		
		
		
	}

	@When("I open orange hrm homepage")
	public void i_open_orange_hrm_homepage() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("I verify that the logo present on page")
	public void i_verify_that_the_logo_present_on_page() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		
		boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
		Assert.assertEquals(true, status);
	}

	@Then("close browser")
	public void close_browser() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		driver.quit();
	}

}
