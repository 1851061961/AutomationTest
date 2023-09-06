package alert_windows_iframe;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Bai1 extends CommonBase{
	@BeforeMethod
	public void openPage() {
		driver = initChromeDriver("https://codestar.vn/");
	}
	@Test
	public void handleIFrame() {
		System.out.println("iframe total: " + driver.findElements(By.tagName("iframe")).size());
		scrollToElement(By.xpath("//strong[text()='Chat với CodeStar Academy']"));
		//int index = findIFrame();
		driver.switchTo().frame(3);
		click(By.xpath("//span[text()='Bắt đầu chat']"));
	}
}
