package Locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Repeatative_codes.redundant_code;

public class Admin_Login_Page extends redundant_code{

    

    @FindBy(name = "login_email")
    private WebElement emailfield;

    @FindBy(name = "login_pass")
    private WebElement passwordfield;

    @FindBy(xpath = "//select")
    private WebElement select_dropdown;

    @FindBy(xpath = "//*[@type='submit' and contains(@class,'btn-red legitRipple')]")
    private WebElement loginbutton;
    
    @FindBy(xpath = "//iframe")
    private WebElement iframe;
    
    @FindBy(xpath = "//*[contains(@class,'recaptcha-checkbox') and @role='checkbox' or @id='recaptcha-anchor']")
    private WebElement captcha_checkbox;

    
    WebDriver d;

    public Admin_Login_Page(WebDriver d) {

        super(d);

        PageFactory.initElements(d, this);
    }

    // METHODS

    public WebElement emailfield() throws InterruptedException {

    	WebElementwait(emailfield);
    	return emailfield;}

    public WebElement passwordfield() throws InterruptedException {

    	WebElementwait(passwordfield);
    	return passwordfield;}

    public WebElement select_dropdown() throws InterruptedException {

    	WebElementwait(select_dropdown);
    	return select_dropdown; }

    public WebElement loginbutton() throws InterruptedException {

    	WebElementwait(loginbutton);
    	return loginbutton;}
    
    public WebElement iframe() throws InterruptedException {

    	WebElementwait(iframe);
    	return iframe;}
    
    public WebElement captcha_checkbox() throws InterruptedException {

    	WebElementwait(captcha_checkbox);
    	return captcha_checkbox;}
    
    
    
    
    
    
    
}