package practiceForm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestForm extends BaseClass {

	@Test(dataProvider = "fetchData")
	public void main(String name,String currNum,String faxNum,String email,String add1,String add2,String newNum,String desgn,String curSal,String expSal) {
		driver.findElement(By.linkText("Get Form")).click();
		// driver.findElement(By.xpath("(//span[@class='icon
		// icon--size--extra-small'])[3]")).click();
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[2]")).sendKeys(name);
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[3]")).sendKeys(currNum);
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[4]")).sendKeys(faxNum);
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[5]"))
				.sendKeys(email);
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[6]")).sendKeys(add1);
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[7]")).sendKeys(add2);
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[8]")).sendKeys(newNum);
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[9]"))
				.sendKeys(desgn);
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[10]")).sendKeys(curSal);
		driver.findElement(By.xpath("(//textarea[@class='fillable-field__input-control'])[11]")).sendKeys(expSal);

		driver.findElement(By.xpath("//span[@class='text text--size--14 text--weight--regular']")).click();

	}

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		ReadExcell obj = new ReadExcell();
		String[][] data = obj.excelRead();
		return data;
	}

}
