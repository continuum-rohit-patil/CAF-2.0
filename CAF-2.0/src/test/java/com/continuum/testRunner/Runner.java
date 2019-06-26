package com.continuum.testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "features"
 ,glue={"src//main//java//com//continuum//stepDefination"}
 ,plugin = {
			"pretty",
			"html:test-report/cucumber",
			"json:test-report/cucumber.json",
	"rerun:target/rerun.txt" },
	tags={"@AllureReport"}

 )
 
public class Runner {
 
}
