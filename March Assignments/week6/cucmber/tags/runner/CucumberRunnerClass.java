package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features01/CreateLead.feature",glue="steps01",monochrome = true,publish=true,
tags = "@smoke or @regression")
public class CucumberRunnerClass extends AbstractTestNGCucumberTests {

}
