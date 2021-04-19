package seleniumNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioPrc {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/shop/sale ");
		driver.findElementByXPath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")
				.sendKeys("Bags", Keys.ENTER);
		driver.findElementByXPath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Women']")
				.click();
		driver.findElementByXPath("//div[@class='five-grid']").click();
		/*
		 * WebElement elePrg = driver.findElementByClassName("filter-dropdown"); Select
		 * dd = new Select(elePrg); dd.selectByVisibleText("What's New");
		 */
		driver.findElementByXPath("//option[@value='newn']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='price']").click();
		driver.findElementByXPath("//input[@id='minPrice']").sendKeys("3000");
		driver.findElementByXPath("//input[@id='maxPrice']").sendKeys("5000", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='contentHolder'])[1]").click();

		Set<String> wHandles = driver.getWindowHandles();
		List<String> winHan = new ArrayList<String>(wHandles);
		Thread.sleep(3000);
		String string = winHan.get(1);
		Thread.sleep(3000);
		driver.switchTo().window(string);

		String actualPrice = driver.findElementByXPath("//div[@class='prod-price-section ']/div").getText();
		// System.out.println(actualPrice);
		String newActPrice = actualPrice.substring(4);
		System.out.println(newActPrice);

		Thread.sleep(3000);
		String disPrice = driver.findElementByXPath("//div[@class='promo-discounted-price']/span").getText();
		// System.out.println(disPrice);
		String newDisPrice = disPrice.replaceAll("\\D", "");
		System.out.println(newDisPrice);
		
		
		

		String couponCode = driver.findElementByXPath("//div[@class='promo-title']").getText();
		// System.out.println(couponCode);
		String[] codeNew = couponCode.split("Code");
//		for (String stringArr : codeNew) {
//			System.out.println("Clarif1"+stringArr);
//		}
//		
		String couponCodeNew = (codeNew[codeNew.length - 1]).replaceAll("[^a-zA-Z]", "");
		//System.out.println("Clarif2"+couponCodeNew);
		//String couponCodeNew1 = (codeNew[codeNew.length - 1]);
		//System.out.println("Clarif3"+couponCodeNew1);
		
		
		System.out.println("the Coupon code:" + couponCodeNew);

		driver.findElementByXPath("//span[text()='Enter Pin-code To Know Estimated Delivery Date']").click();

		driver.findElementByXPath("//input[@name='pincode']").sendKeys("560043", Keys.ENTER);

		String delDate = driver.findElementByXPath("//li[text()='Expected Delivery: ']").getText();
		System.out.println(delDate);

		driver.findElementByXPath("//div[@class='other-info-toggle']").click();
		String adressCustom = driver.findElementByXPath("//div[text()='Customer Care Address']/following::div[2]").getText();
		System.out.println("Customer Care Details : "+adressCustom);

		driver.findElementByXPath("//div[@class='btn-gold']").click();

		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='popup-blk cart-blk']").click();

		String orderTot = driver.findElementByXPath("//section[@id='orderTotal']/span[2]").getText();
		// System.out.println(orderTot);
	
		String newOrderTOt = orderTot.substring(4);
		
		System.out.println(newOrderTOt);

		if (newActPrice.equals(newOrderTOt)) {
			System.out.println("Order Total is correct");
		} else {
			System.out.println("Order Total is incorrect");
		}

		driver.findElementByXPath("//input[@id='couponCodeInput']").sendKeys(couponCodeNew);

		driver.findElementByXPath("//button[text()='Apply']").click();

		String couponAppliedcost = driver.findElementByXPath("//span[@class='price-value bold-font']").getText();
		System.out.println(" Order total:" + couponAppliedcost);

		String couponApplly = couponAppliedcost.replaceAll("\\D", "");
		
		System.out.println(couponApplly);

		if (couponApplly.equals(newDisPrice)) {
			System.out.println("The bill amount is matching with the discount price ");
			
		}else {
			System.out.println("The bill amount is not matching with the discount price ");
			
		}
		Thread.sleep(2000);
		driver.findElementByXPath("//div[text()='Delete']").click();
		
		Thread.sleep(2000);
		driver.findElementByXPath("//div[text()='DELETE']").click();
		
		
		driver.quit();
		
		
		
	}

}
