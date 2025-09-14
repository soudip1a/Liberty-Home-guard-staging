package Repeatative_codes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class redundant_code {
	
	public WebDriver d;
	
	public redundant_code(WebDriver d){
		
		this.d=d;
		
	}
	
	
	public void WebElementwait(WebElement element) throws InterruptedException{
		
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
		
		w.until(ExpectedConditions.visibilityOf(element));
		Thread.sleep(800);
	}

	
	
    public void WebElementswaits(List<WebElement> element) throws InterruptedException{
		
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
		
		w.until(ExpectedConditions.visibilityOfAllElements(element));
		Thread.sleep(800);
	}
    
    
    
    
    public void Movetoelements(WebElement element) throws InterruptedException{
    	
    	Actions a = new Actions(d);
    	
    	a.moveToElement(element).build().perform();
    	Thread.sleep(800);
    	
    	
    	
    	
    }
}
