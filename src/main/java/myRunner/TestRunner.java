package myRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Selenium_workspace\\BDDFrameworkPractise\\src\\main\\java\\features\\Login.feature"
		,glue={"stepDefinations"},  
	plugin = { "pretty","html:test-outout/testoutputs.html","junit:junit_xml/cucumber.xml"}
		//dryRun = false
		)

public class TestRunner {

}
//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//
//	@RunWith(Cucumber.class)
//	@CucumberOptions(
//			features = "C:\\Selenium_workspace\\BDDFrameworkPractise\\src\\main\\java\\features\\Login.feature", //the path of the feature files
//			glue={"stepDefinations"},//the path of the step definition files
//			//format={"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},  //to generate different types of reporting
//			monochrome = true, //display the console output in a proper readable format
//			//strict = true, //it will check if any step is not defined in step definition file
//			dryRun = false //to check the mapping is proper between feature file and step def file
//			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
//			)
//	 
//	public class TestRunner {
//	 
//	}