package automation.testsuite;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import automation.common.CommonBase;

public class Bai1Xpath extends CommonBase {
	@BeforeTest
    public void openPage()
    {
		driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
    }
	@Test
	public void findByID()
	{
		driver.findElement(By.id("userId"));
	    System.out.println("Found userID element User Email");
	    driver.findElement(By.id("pass"));
	    System.out.println("Found id element Password");
	}
	@Test
	public void findByName()
	{
		driver.findElement(By.name("email"));
	    System.out.println("Found name element User Email");
	    driver.findElement(By.name("Password"));
	    System.out.println("Found name element Password");
	    driver.findElement(By.name("company"));
	    System.out.println("Found name element Company ");
	    driver.findElement(By.name("mobile number"));
	    System.out.println("Found name element Mobile Number ");
	}
	@Test
	public void findByClassName()
	{
		driver.findElement(By.className("selectors-input"));
		System.out.println("Found Class Name element User Email");
		driver.findElement(By.className("selectors-input"));
		System.out.println("Found Class Name element User Password");
		driver.findElement(By.className("form-control"));
		System.out.println("Found Class Name element Company");
		driver.findElement(By.className("form-control"));
		System.out.println("Found Class Name element Mobile Number");
		
	}	
	@AfterTest
	public void quitDriver()
	{
	   // driver.close();	
	}
}
