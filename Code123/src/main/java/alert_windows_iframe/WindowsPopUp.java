package alert_windows_iframe;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
//import dev.failsafe.internal.util.Assert;
//import dev.failsafe.internal.util.Assert;

public class WindowsPopUp extends CommonBase{
	@BeforeTest
	public void openPage() {
		driver = initChromeDriver("https://demo.guru99.com/popup.php");
	}
	@Test
	public void TestPopupWindow() {
		click(By.xpath("//a[contains(@href,'popup.php')]"));
		String mainWindow = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String Subwindow : windows) {
		    System.out.println(windows);
		    if (!mainWindow.equals(Subwindow)) {
		    	driver.switchTo().window(Subwindow);
		    	pause(2000);
		    	System.out.println("Đã chuyển đến window con");
		    	
		    	System.out.println("Title"+ driver.switchTo().window(Subwindow).getTitle());
		    	System.out.println("CurentTitle: "+ driver.switchTo().window(Subwindow).getCurrentUrl());
		    	type(By.name("emailid"),"testdemo@gmail.com");
		    	click(By.name("btnLogin"));
		    	
		    	String text = driver.findElement(By.xpath("//table//td//h2")).getText();
		    	System.out.println(text);
		    	org.testng.Assert.assertEquals(text, "Access details to demo site.");
		    	driver.close();
		    	
		    }
		    driver.switchTo().window(mainWindow);
		    System.out.println("Đã chuyển đến lớp Window chính: " + driver.getCurrentUrl());
		}
		

} 
}