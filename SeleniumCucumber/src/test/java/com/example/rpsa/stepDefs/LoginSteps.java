package com.example.rpsa.stepDefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.rpsa.pageObjects.LoginPage;
import com.example.rpsa.utlities.BaseStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;
	public LoginPage lp;

	public LoginSteps(BaseStep baseStep) {
		driver = baseStep.baseDriver;
	}

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Softwares\\WebDrivers\\Chrome\\chromedriver.exe");
		// driver = new ChromeDriver();

		lp = new LoginPage(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {

		if(driver != null) {
			driver.get(url);
		}else {
			System.err.println("driver object is null");
		}
		

	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_and_password_as(String email, String password) {
		lp.setUserName(email);
		lp.setPassword(password);

	}

	@When("Click on Login")
	public void click_on_login() {
		lp.clickLogin();

	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {

		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue("Incorrect page title", false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}

	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		lp.clickLogout();
		Thread.sleep(3000);
	}

	@Then("close broswer")
	public void close_broswer() {
		driver.quit();
	}

}
