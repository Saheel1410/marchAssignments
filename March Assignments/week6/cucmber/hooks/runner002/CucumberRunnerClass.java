package runner002;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features002",glue="steps002",monochrome = true,publish=true)
public class CucumberRunnerClass extends AbstractTestNGCucumberTests {

}
