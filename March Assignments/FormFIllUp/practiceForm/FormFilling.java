package practiceForm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFilling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.pdffiller.com/256387-fillable-practice-applications-for-employment-form");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Get Form")).click();
		
		driver.findElement(By.xpath("(//span[@class='icon icon--size--extra-small'])[3]")).click();
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[2]")).sendKeys("Saheel");
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[3]")).sendKeys("9999900000");
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[4]")).sendKeys("67545");
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[5]")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[6]")).sendKeys("M17/1,Tnhb");
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[7]")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[8]")).sendKeys("9898980000");
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[9]")).sendKeys("Testing Engineer");
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[10]")).sendKeys("10000");
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[11]")).sendKeys("25000");

		driver.findElement(By.xpath("//span[@class='text text--size--14 text--weight--regular']")).click();
		driver.close();

	}

}
