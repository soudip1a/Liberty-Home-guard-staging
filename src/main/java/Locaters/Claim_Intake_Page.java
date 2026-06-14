package Locaters;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;


	public class Claim_Intake_Page {
		
		WebDriver d;
		
		
		public Claim_Intake_Page(WebDriver d) {
			
			this.d = d;
			
			PageFactory.initElements(d, this);
			
		}
		
		
		// Covered Item Dropdown
		
		@FindBy(xpath="")
		private WebElement coveredItem;
		
		
		
		public void selectCoveredItem(String itemName) {
			
			
			Select select = new Select(coveredItem);
			
			select.selectByVisibleText(itemName);
			
			
		}

	}
	


