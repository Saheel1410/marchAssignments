package testng_DataPro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
@Test(dataProvider="fetchData")
	public void testCreateLead(String compName,String fName, String lName) {
	
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(compName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
		
}
@DataProvider(name="fetchData")
public String[][] sendData() {
	String[][] data = new String[2][3];
	data[0][0]="TestLeaf";
	data[0][1]="Hari";
	data[0][2]="R";
	
	data[1][0]="TestLeaf";
	data[1][1]="Saheel";
	data[1][2]="A";
	
return data;
	
	
}
}






