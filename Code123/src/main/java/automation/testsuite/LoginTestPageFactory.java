package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.PageLocator.DashboardPage;
import automation.PageLocator.LoginPage;
import automation.common.CommonBase;
import automation.constant.CT_Account;

public class LoginTestPageFactory extends CommonBase{
    @BeforeTest
    public void openApplication()
    {
    	driver = initChromeDriver(CT_Account.webURL);
    }
    @Test
	public void loginSuccessfully() 
    {
    	LoginTestPageFactory factory = new LoginTestPageFactory();
    	factory.LoginFunctionFactory("admin@demo.com", "riseDemo");
    	
    	DashboardPage dashboard = new DashboardPage();
    	pause(4000);
    	WebElement expected = driver.findElement(dashboard.textDashboard);
  	    assertTrue(expected.isDisplayed());	
	}
//    @AfterTest
//    public void closeDriver{
//    	driver.close();
//    }
	private void LoginFunctionFactory(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

}
