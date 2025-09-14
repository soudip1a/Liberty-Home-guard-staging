package Locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Repeatative_codes.redundant_code;

public class Login_locaters extends redundant_code{
	
	
	@FindBy(xpath="(//h5)[1]")
	private WebElement login_page_bannertext;
	@FindBy(id="login_email")
	private WebElement emailfield;;
	@FindBy(id="login_pass")
	private WebElement passfield;
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement submit_button;
	@FindBy(xpath="(//*[@class='fl-failed'])[1]")
	private WebElement error_message;
	@FindBy(xpath="(//*[@aria-labelledby='recaptcha-anchor-label']//*[1])[1]")
	private WebElement captcha;
	@FindBy(id="login_success")
	private WebElement success_toast;
    @FindBy(xpath="//iframe[@title='reCAPTCHA']")
	private WebElement captcha_iframe;
	
	
	
	
	
	
	
	
	public Login_locaters(WebDriver d){
		super(d);
		PageFactory.initElements(d, this);}
	
	
	public WebElement login_page_bannertext() throws InterruptedException{
		WebElementwait(login_page_bannertext);
		return login_page_bannertext;}
	public WebElement emailfield() throws InterruptedException{
		WebElementwait(emailfield);
		return emailfield;}
	public WebElement passfield() throws InterruptedException{
		WebElementwait(passfield);
		return passfield;}
	public WebElement submit_button() throws InterruptedException{
		WebElementwait(submit_button);
		return submit_button;}/*
	public WebElement login_page_bannertext() throws InterruptedException{
		WebElementwait(login_page_bannertext);
		return login_page_bannertext;} */
      public WebElement error_message() throws InterruptedException{
		WebElementwait(error_message);
		return error_message;}
	     public WebElement captcha() throws InterruptedException{
			WebElementwait(captcha);
			return captcha;}
        public WebElement captcha_iframe() throws InterruptedException{
			WebElementwait(captcha_iframe);
			return captcha_iframe;}
	     public WebElement success_toast() throws InterruptedException{
			WebElementwait(success_toast);
			return success_toast;}
	     
	

}
