package steps002;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsFoCreateLead extends BaseClass {
	//public static ChromeDriver driver;

	// TC001
//	@Given("Open the chrome browser")
//	public void openBrowser() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--disable-notifications");
//		driver = new ChromeDriver(option);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//	}
//
	@Given("Load the application url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/");

	}

	@Given("Enter the username as {string}")
	public void enterUsername(String uName) {
		driver.findElementById("username").sendKeys(uName);

	}

	@Given("Enter the password as {string}")
	public void enterPassword(String pass) {
		driver.findElementById("password").sendKeys(pass);

	}

	@Given("Click on login button")
	public void clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();

	}

	@Given("Click on CRMSFA link")
	public void clickCrmsfaLink() {

		driver.findElementByLinkText("CRM/SFA").click();

	}

	@Given("Click on Leads button")
	public void clickOnLeads() {
		driver.findElementByLinkText("Leads").click();

	}

	@Given("Click on Create Leads button")
	public void clickOnCreateLeads() {
		driver.findElementByLinkText("Create Lead").click();

	}

	@Given("Enter company as {string}")
	public void enterCopanyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);

	}

	@Given("Enter FirstName as {string}")
	public void enterFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);

	}

	@Given("Enter SecondName as {string}")
	public void enterSecName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);

	}

	@Given("Enter number as {string}")
	public void enterNumber(String number) {
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(number);

	}

	@When("Click the Submit button")
	public void clickSubmitButton() {
		driver.findElementByName("submitButton").click();

	}

	@Then("Verify Lead is created Successfully")
	public void veriyTheTitle() {
		boolean displayed = driver.findElementByXPath("//div[text()='View Lead']").isDisplayed();
		Assert.assertTrue(displayed);
	}

	@Given("Click on close button")
	public void clickCloseBUtton() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	
	
	
	

//TC002
	@Given("Click on find Leads")
	public void clickOnFindLeads() {
		driver.findElementByLinkText("Find Leads").click();

	}

	@Given("Click on phone button")
	public void clickOnPhn() {
		driver.findElementByXPath("//span[text()='Phone']").click();

	}

	@Given("Enter Phone No as {string}")
	public void enterPhnNo(String phoNo) {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phoNo);

	}

	@Given("Click on the Find Leads button")
	public void clickOnFindLeads2() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();

	}

	@Given("Click on the first found lead")
	public void clickOnFirstLead() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();

	}

	@Given("Click on the Edit button")
	public void clickOnEditButton() {
		driver.findElementByLinkText("Edit").click();

	}

	@Given("Clear the company name field")
	public void clearField() {
		driver.findElementById("updateLeadForm_companyName").clear();

	}

	@Given("Enter company name as {string}")
	public void enterCompanyName(String compName) {
		driver.findElementById("updateLeadForm_companyName").sendKeys(compName);

	}

	@When("Click on the submit button")
	public void clickOnSubmit() {
		driver.findElementByName("submitButton").click();

	}

	@Then("Verify the Change made")
	public void verifyChangeMade() {
		boolean displayed2 = driver.findElementByXPath("//div[@class='x-panel-header sectionHeaderTitle']")
				.isDisplayed();
		Assert.assertTrue(displayed2);

	}
	
	//TC003
	
	@Given("Click on DuplicateLead button")
	public void clickOnDuplicate() {
		driver.findElementByLinkText("Duplicate Lead").click();
	}
	
	
	
	@When("Click on the submit button new")
	public void clickOnSubmitnew() {
		driver.findElementByName("submitButton").click();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
