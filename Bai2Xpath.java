package automation.testsuite;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import automation.common.CommonBase;
public class Bai2Xpath extends CommonBase{
	@BeforeTest
    public void openPage()
    {
		driver = initChromeDriver("https://automationfc.github.io/basic-form/index.html");
    }
	@Test
	public void findByID1()
	{
		driver.findElement(By.id("name"));
	    System.out.println("Found ID element Name");
	    driver.findElement(By.id("address"));
	    System.out.println("Found ID element Address");
	    driver.findElement(By.id("email"));
	    System.out.println("Found ID element Email");
	    driver.findElement(By.id("password"));
	    System.out.println("Found ID element Password");
	}
	@Test
	public void findByName1()
	{
		driver.findElement(By.name("name"));
	    System.out.println("Found name element Name");
	    driver.findElement(By.name("address"));
	    System.out.println("Found name element Address");
	    driver.findElement(By.name("email"));
	    System.out.println("Found name element Email ");
	    driver.findElement(By.name("password"));
	    System.out.println("Found name element Password ");
	}
	
	@AfterTest
	public void quitDriver()
	{
	   // driver.close();	
	}
}
