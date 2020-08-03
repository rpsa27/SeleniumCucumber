package com.example.rpsa.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Training\\TestBed\\STS_Workspace\\SeleniumCucumber\\src\\test\\resources\\features",
		glue = {"com/example/rpsa/stepDefs","com/example/rpsa/utlities"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","junit:target/jUnitReports/report.xml"},
		tags="@test3"
		
		
		
		
		)
public class TestRunner {

}
