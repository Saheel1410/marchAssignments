package week2.day2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindOpportunity {
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElementByXPath("//div[@id='label']").click();
		
		driver.findElement(By.xpath("//a[text()='Opportunities']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Opportunities']")).click();
		//List<WebElement> opportunityIdList = driver.findElementsByXPath("//table[@class='x-grid3-row-table']//tr/td[1]");
		List<WebElement> opportunityIdList = driver.findElements(By.xpath("//div[contains(@class,'salesOpportunityId')]/a[contains(@href,'salesOpportunityId')]"));
	for (int i = 0; i < opportunityIdList.size(); i++) {
		System.out.println(opportunityIdList.get(i).getText());
	}
		
		if (driver.getTitle().contains("Find Opportunities")) {
			System.out.println("Title verified: "+driver.getTitle());
		}
		
	}
	

}