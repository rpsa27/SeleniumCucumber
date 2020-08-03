package com.example.rpsa.stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.example.rpsa.utlities.AppInfo;
import com.example.rpsa.utlities.AppInfoYamlReader;
import com.example.rpsa.utlities.BaseStep;
import com.example.rpsa.utlities.LoginInfo;
import com.example.rpsa.utlities.Password;
import com.example.rpsa.utlities.UserName;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithExtrenalTestDataSteps {

	WebDriver driver;
	LoginInfo loginInfo;

	// PicoContainer injects class BaseStep
	public LoginWithExtrenalTestDataSteps(BaseStep basteStep) {
		driver = basteStep.getDriver();
	}

	AppInfo appInfo = AppInfoYamlReader.getAppInfo();

	@Given("User opens URL")
	public void user_opens_url() {

		String url = appInfo.getUrl();
		System.out.println("connecting to url: " + url);
		driver.get(url);
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {

		loginInfo = appInfo.getLoginInfo();
		UserName userName = loginInfo.getUserName();
		Password password = loginInfo.getPassword();

		System.out.println("Username =" + userName.getValue() + " and Password = " + password.getValue());

		driver.findElement(By.id(userName.getKey())).clear();
		driver.findElement(By.id(userName.getKey())).sendKeys(userName.getValue());
		driver.findElement(By.id(password.getKey())).clear();
		driver.findElement(By.id(password.getKey())).sendKeys(password.getValue());

	}

	@When("the User click on Log out link")
	public void the_user_click_on_log_out_link() {

		driver.findElement(By.linkText("Logout")).click();
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

	@Then("User verify page title")
	public void user_verify_page_title() {
		String title = appInfo.getLoginInfo().getMessage();
		System.out.println("expected title =" + title);
		System.out.println("  actual title =" + driver.getTitle());

		Assert.assertEquals(title, driver.getTitle());

	}

	@Then("close the broswer")
	public void close_the_broswer() {
		driver.quit();
	}
}
