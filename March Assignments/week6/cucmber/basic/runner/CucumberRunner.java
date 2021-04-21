package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/feature/Login.features",glue="steps",monochrome=true)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
