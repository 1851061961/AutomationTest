package alert_windows_iframe;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class AlertSendKeys extends CommonBase{
	@BeforeTest
	public void openPage() {
		driver = initChromeDriver("https://demo.automationtesting.in/Alerts.html");
	}
	@Test
	public void TestAlert02() {
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		pause(2000);
		driver.findElement(By.xpath("//button[@class = 'btn btn-info']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hong Hai");
		alert.accept();
		WebElement expect = driver.findElement(By.xpath("//p[@id='demo1']"));
		assertTrue(expect.isDisplayed());

	}
//	@AfterTest
//	public void closePage() {
//		quitDriver(driver);
//	}


}
