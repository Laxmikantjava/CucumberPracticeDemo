package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Cucumber Options tag is used to provide a link between the feature files and step definition files.
//Each step of the feature file is mapped to a corresponding method on the step definition file.

//Below is the syntax of Cucumber Options tag:
//@CucumberOptions(features="Features",glue={"StepDefinition"})

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "C:\\Users\\hp\\git\\CucumberPracticeDemo\\CucumberDemo\\src\\test\\java\\features\\test.feature", glue = "seleniumGluCode", plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true,strict=true)

public class testRunner { 
	
}