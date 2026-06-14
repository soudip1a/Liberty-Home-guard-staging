package Locaters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Dashboard_Page {
	WebDriver d;


	public Dashboard_Page(WebDriver d) {

		this.d=d;

		PageFactory.initElements(d, this);

	}


	@FindBy(xpath="")
	private WebElement claimMenu;


	@FindBy(xpath="")
	private WebElement createClaim;



	public void openClaimIntake() {


		claimMenu.click();

		createClaim.click();


	}

	

}
