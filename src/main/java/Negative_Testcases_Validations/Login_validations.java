package Negative_Testcases_Validations;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.TreeMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Libertyhome.Automation_project.Data_fetcher;
import Libertyhome.Automation_project.Login;
import Locaters.Login_locaters;
@Listeners(listener_package.Listen.class)
public class Login_validations extends Login{

	
	@Test(dataProvider="logindatas")
	public void Login_validations_check(TreeMap<String,String> data) throws InterruptedException, IOException, AWTException{
		
		Login_locaters p = new Login_locaters(d);
		JavascriptExecutor js = (JavascriptExecutor)d;
		Data_fetcher df = new Data_fetcher();
		
		
		
		d.get(df.getdata("url"));
		d.manage().window().maximize();	
		p.login_page_bannertext();
		p.emailfield().sendKeys(data.get("lid"));
		p.passfield().sendKeys(data.get("password"));
		Thread.sleep(800);
		js.executeScript("window.scrollBy(0,380)");
		Thread.sleep(4500);
		//js.executeScript("arguments[0].click();",p.captcha());
		//p.captcha().click();
		p.submit_button().click();
		Thread.sleep(2500);
		try {
		p.error_message();
		System.out.println(p.error_message().getText());
		System.out.println();}catch(Exception e){
			
			System.out.println("Error not shown Login successfull");
			System.out.println();
		}}
	
	
	@DataProvider
	public Object[][] logindatas() throws IOException{
		
		Data_fetcher df = new Data_fetcher();
		
		
		TreeMap<String,String> data1 = new TreeMap<String,String>();
		
		data1.put("lid", "abc@yopmail.com");
		data1.put("password", df.getdata("pass"));
		
		
      TreeMap<String,String> data2 = new TreeMap<String,String>();
		
		data2.put("lid", df.getdata("id"));
		data2.put("password", "pass3325");
		
		
      TreeMap<String,String> data3 = new TreeMap<String,String>();
		
		data3.put("lid", "abc@yopmail.com");
		data3.put("password", "pass3325");
		
     TreeMap<String,String> data4 = new TreeMap<String,String>();
		
		data4.put("lid", df.getdata("id"));
		data4.put("password", df.getdata("pass"));
		
    return new Object[][]{{data1},{data2},{data3},{data4}};	
		
	}
	
	
	
	
}
