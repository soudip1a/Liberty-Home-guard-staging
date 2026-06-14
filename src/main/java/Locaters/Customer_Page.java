package Locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Customer_Page {


	WebDriver d;


	// Constructor

	public Customer_Page(WebDriver d) {

		this.d = d;

		PageFactory.initElements(d, this);

	}



	// ==============================
	// Customer Management Menu
	// ==============================


	@FindBy(xpath="//span[contains(text(),'CUSTOMERS MANAGEMENT')]")
	private WebElement customerManagement;


	@FindBy(xpath="//a[contains(text(),'Customers')]")
	private WebElement customers;



	// ==============================
	// Customer Search Page
	// ==============================


	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement customerSearch;



	// Action 9 dots icon

	@FindBy(xpath="(//span[text()='apps'])[1]")
	private WebElement actionMenu;



	// Create New Claim option

	@FindBy(xpath="//a[contains(text(),'Create New Claim')]")
	private WebElement createNewClaim;




	// ==============================
	// Methods
	// ==============================


	public void openCustomersPage() throws InterruptedException {


		Actions act = new Actions(d);

		act.moveToElement(customerManagement).perform();

		Thread.sleep(1000);

		customers.click();


	}



	public void searchCustomer(String customerName) throws InterruptedException {


		customerSearch.clear();

		customerSearch.sendKeys(customerName);

		Thread.sleep(2000);


	}



	public void clickCreateNewClaim() throws InterruptedException {


		actionMenu.click();

		Thread.sleep(1000);

		createNewClaim.click();


	}


}