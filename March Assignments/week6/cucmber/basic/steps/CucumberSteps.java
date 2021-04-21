package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberSteps {
	public ChromeDriver driver;
@Given("Open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
@Given("Load the application url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
	}
@Given("Enter the username as Demosalesmanager")
	public void enterUsername() {
		driver.findElementById("username").sendKeys("demosalesmanager");
	}
@Given("Enter the password as crmsfa")
	public void enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
	}
@When("Click on login button")
	public void clickSubmit() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
@Then("Homepage should be displayed")
	public void homePage() {
System.out.println("HomePage is displayed");
	}
}
