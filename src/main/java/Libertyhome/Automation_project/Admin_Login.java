package Libertyhome.Automation_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Locaters.Admin_Login_Page;
import listener_package.Listen;

public class Admin_Login extends Base {

@Test
public void admin_login() throws Exception, InterruptedException {


    Admin_Login_Page p = new Admin_Login_Page(d);
    Data_fetcher df = new Data_fetcher();

    
    String url = df.getdata("admin_url");
    String email = df.getdata("admin_id");

    String password = df.getdata("admin_pass");
    
    d.get(url);
    p.emailfield().sendKeys(email);
    p.passwordfield().sendKeys(password);
    Select sl = new Select(p.select_dropdown());
    sl.selectByVisibleText("DASHBOARD");
	Thread.sleep(500);
    captcha_click();
    WebElement loginbutton = p.loginbutton();
    loginbutton.click();
    
    }
   
public void captcha_click() throws InterruptedException{
	
	Admin_Login_Page p = new Admin_Login_Page(d);
	
	WebElement iframe= p.iframe();
	d.switchTo().frame(iframe);
	Thread.sleep(500);
	WebElement captchacheckbox = p.captcha_checkbox();
	captchacheckbox.click();
	d.switchTo().defaultContent();
	
	
	
}



}