package alert_windows_iframe;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class AlertBasic_java extends CommonBase {
	@BeforeTest
	public void openPage() {
		driver = initChromeDriver("https://demo.guru99.com/test/delete_customer.php");
	}
	@Test
	public void TestAlert01() {
		driver.findElement(By.xpath("//input[@name = 'cusid']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name = 'submit']")).submit();
		
		Alert alert = driver.switchTo().alert();
		String alerMessage = driver.switchTo().alert().getText();
		System.out.println(alerMessage);
		assertEquals(alerMessage, "Do you really want to delete this Customer?");
		driver.switchTo().alert().accept();
		pause(2000);


//      Alert alert2 = driver.switchTo().alert();
//		String alerMessage2 = driver.switchTo().alert().getText();
//		System.out.println(alerMessage2);
//		assertEquals(alerMessage2, "Customer Successfully Delete!");
//		
//		pause(2000);
	}
//	@AfterTest
//	public void closePage() {
//		quitDriver(driver);
//	}

}
