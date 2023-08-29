package alert_windows_iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Dangky extends CommonBase{
	@BeforeMethod
	public void openPage() {
		driver = initChromeDriver("https://codestar.vn/");
	}
	@Test
	public void handleIFrame() {
		System.out.println("iframe total: " + driver.findElements(By.tagName("iframe")).size());
		scrollToElement(By.xpath("//h2[text()='Đăng ký nhận tài liệu:']"));
		//int index = findIFrame();
		driver.switchTo().frame(1);
		type(By.name("account_name"),"Hai");
		type(By.id("account_phone"),"0338469226");
		click(By.xpath("//button[text()='Đăng ký ngay']"));
	}
}
