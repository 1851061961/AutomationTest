package alert_windows_iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class IFrame_ExpliciWait extends CommonBase{
	@BeforeMethod
	public void openPage() {
		driver = initChromeDriver("https://codestar.vn/");
	}
	@Test
	public void handleIFrame() {
		System.out.println("iframe total: " + driver.findElements(By.tagName("iframe")).size());
		scrollToElement(By.xpath("//h2[text()='Đội ngũ giảng viên']"));
		//int index = findIFrame();
		driver.switchTo().frame(1);
		type(By.id("account_phone"),"0338469116");
		click(By.xpath("//button[text()='Gửi ngay']"));
	}
	@Test
	public void findIFrame1() {
		pause(1000);
		//int indexOfIframe = 0;
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("So luong frane: " + size);
		for (int i = 0; i< size; i++)
		{
			driver.switchTo().frame(i);
			int numberOfIframe = driver.findElements(By.xpath("//button[text()='Gửi ngay']")).size();
			if (numberOfIframe !=0)
			{
				System.out.println("element can tim thu i :" + i);
			}
			driver.switchTo().defaultContent();
		}
		click(By.xpath("//span[text()='Bắt đầu chat']"));
	}
}
