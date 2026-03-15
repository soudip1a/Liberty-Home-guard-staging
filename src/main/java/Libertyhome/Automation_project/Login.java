package Libertyhome.Automation_project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Locaters.Login_locaters;
import listener_package.Listen;


@Listeners({Listen.class})
public class Login extends Base{

	
	@Test
	public void login() throws InterruptedException, IOException{
		
		Login_locaters p = new Login_locaters(d);
		Data_fetcher df = new Data_fetcher();
		JavascriptExecutor js = (JavascriptExecutor)d;
		
		String email = df.getdata("id");
		String password = df.getdata("pass");


		Listen.print_in_report().log(Status.INFO,
		"🔹 STEP 1 : Verify Login Page Banner\n"+
		"Description : Validate that the login page loads correctly\n"+
		"Expected Result : Login banner text should be visible");

		p.login_page_bannertext();

		Listen.print_in_report().log(Status.PASS,
		"✅ Banner validation successful\n"+
		"Actual Result : Login page banner is displayed");

/*
		File screenshot1 = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		Listen.print_in_report().addScreenCaptureFromBase64String("Login Page"); */


		Listen.print_in_report().log(Status.INFO,
		"🔹 STEP 2 : Enter Email Address\n"+
		"Description : Enter registered email into email field\n"+
		"Test Data Used : "+email+"\n"+
		"Expected Result : Email should populate email textbox");

		p.emailfield().sendKeys(email);

		Listen.print_in_report().log(Status.PASS,
		"✅ Email entry successful\n"+
		"Actual Result : Email '"+email+"' entered into email field");




		Listen.print_in_report().log(Status.INFO,
		"🔹 STEP 3 : Enter Password\n"+
		"Description : Enter account password into password field\n"+
		"Test Data Used : ****** (masked)\n"+
		"Expected Result : Password should populate password textbox");

		p.passfield().sendKeys(password);

		Listen.print_in_report().log(Status.PASS,
		"✅ Password entry successful\n"+
		"Actual Result : Password entered successfully");

      


		Thread.sleep(500);

		Listen.print_in_report().log(Status.INFO,
		"🔹 STEP 4 : Captcha Verification\n"+
		"Description : Switch to captcha iframe and verify captcha checkbox\n"+
		"Expected Result : Captcha should be selected successfully");

		d.switchTo().frame(p.captcha_iframe());

		Thread.sleep(500);

		p.captcha().click();

		Listen.print_in_report().log(Status.PASS,
		"✅ Captcha selected successfully\n"+
		"Actual Result : Captcha checkbox clicked");

		Thread.sleep(500);

		d.switchTo().defaultContent();

		


		Thread.sleep(1500);

		Listen.print_in_report().log(Status.INFO,
		"🔹 STEP 5 : Scroll To Submit Button\n"+
		"Description : Scroll page until submit button is visible\n"+
		"Expected Result : Submit button should be visible");

		js.executeScript("arguments[0].scrollIntoView(true)", p.submit_button());

		Listen.print_in_report().log(Status.PASS,
		"✅ Submit button visible\n"+
		"Actual Result : Submit button successfully scrolled into view");


		Listen.print_in_report().log(Status.INFO,
		"🔹 STEP 6 : Click Submit Button\n"+
		"Description : Submit login credentials to system\n"+
		"Expected Result : Login request should be processed");

		p.submit_button().click();

		Listen.print_in_report().log(Status.PASS,
		"✅ Login request submitted\n"+
		"Actual Result : Submit button clicked successfully");


		Thread.sleep(500);

		Listen.print_in_report().log(Status.INFO,
		"🔹 STEP 7 : Validate Login Success Toast\n"+
		"Description : Capture system response toast after login\n"+
		"Expected Result : System should display successful login message");

		//js.executeScript("arguments[0].scrollIntoView(true)", p.success_toast());
 /*
		String Toast = p.success_toast().getText();

		Listen.print_in_report().log(Status.INFO,
		"📢 System Toast Message : "+Toast);

		Listen.print_in_report().log(Status.PASS,
		"🎉 Login Validation Successful\n"+
		"Expected Result : User should login successfully\n"+
		"Actual Result : "+Toast); */

      
		
	}
	
	
	
}
