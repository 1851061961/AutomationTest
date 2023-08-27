package automation.PageLocator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPageFactory_Day15 {

	@FindBy(xpath="//a[@title='Add client']")
	private WebElement btnAddClient;
	@FindBy(xpath="//label[text()='Person']")
	private WebElement checkboxPerson;
	@FindBy(xpath="//input[@name='company_name']")
	private WebElement textCompanyName;
	//xpath của Owner dropdownlist
	@FindBy(xpath="//div[@id='s2id_created_by']")
	private WebElement checkboxOwner;
	// Giá trị của từng Owner trong màn Add Client
	@FindBy(xpath="(//ul[@role='listbox'])[2]/li[1]")
	private WebElement ownerValue1;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement btnSave;
	@FindBy(xpath="//a[text()='Clients']")
	private WebElement clientTab;
	@FindBy(xpath="(//input[@placeholder='Search'])[2]")
	private WebElement textboxSearch;
	@FindBy(xpath="//a[text()='Class28.6 Test']")
	private WebElement searrResult;
	private WebDriver driver;
	
	public ClientPageFactory_Day15(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void AddClient(String companyName,String address) {
		// TODO Auto-generated method stub
        DashboardPage dashboard = new  DashboardPage();
        driver.findElement(dashboard.clientLink).click();
        btnAddClient.click();
        checkboxPerson.click();
        textCompanyName.sendKeys(companyName);
        checkboxOwner.click();
        
	}

}
