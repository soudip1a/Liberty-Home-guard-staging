package Libertyhome.Automation_project;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Locaters.Login_locaters;


@Listeners({listener_package.Listen.class})
public class Login extends Base{

	
	@Test
	public void login() throws InterruptedException, IOException{
		
		Login_locaters p = new Login_locaters(d);
		Data_fetcher df = new Data_fetcher();
		
		 
		p.login_page_bannertext();
		p.emailfield().sendKeys(df.getdata("id"));
		p.passfield().sendKeys(df.getdata("pass"));
		Thread.sleep(500);
		d.switchTo().frame(p.captcha_iframe());
		Thread.sleep(500);
		p.captcha().click();
		Thread.sleep(500);
		d.switchTo().defaultContent();
		Thread.sleep(500);
		p.submit_button().click();
		
		
	}
	
	
	
}
