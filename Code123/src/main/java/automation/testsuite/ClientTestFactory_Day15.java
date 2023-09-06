package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.PageLocator.DashboardPage;
import automation.PageLocator.LoginPage;
import automation.PageLocator.LoginPageFactory;
import automation.common.CommonBase;
import automation.constant.CT_Account;

public class ClientTestFactory_Day15 extends CommonBase{
	@BeforeTest
	@Parameters("testNGbrowser")
	public void openApplication(@Optional("chrome") String browser) {
		setupDriver(browser);
		driver.get(CT_Account.webURLRise);
	}

//	public void openTest() {
//		driver = initChromeDriver(CT_Account.webURLRise);
//	}
	@Test
	public void addClientSuccessfuly()
	{
		LoginPageFactory login = new LoginPageFactory(driver);
		login.LoginFunctionFactory("admin@demo.com", "riseDemo");
		DashboardPage dashboard = new DashboardPage();
		pause(4000);
		WebElement expected = driver.findElement(dashboard.textDashboard);
		assertTrue(expected.isDisplayed());
		
		ClientTestFactory_Day15 client = new ClientTestFactory_Day15();
		client.AddClient("Class28.6 Test");
	}
	private void AddClient(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
