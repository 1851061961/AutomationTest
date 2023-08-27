package automation.PageLocator;

import java.awt.Button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	private WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement txtEmail;
	
	@FindBy(id = "password")
	private WebElement txtPass;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void LoginFunctionFactory(String email,String password) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
		txtPass.clear();
		txtPass.sendKeys(password);
		btnLogin.click();
	}

}
