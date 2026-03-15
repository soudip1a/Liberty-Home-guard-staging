package Libertyhome.Automation_project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver d;
	
	
	@BeforeMethod
	public void Setup() throws IOException{
		
		Data_fetcher df = new Data_fetcher();
		
		
		String Browser = System.getProperty("Browser")!=null ? System.getProperty("Browser") : df.getdata("browser");
		String Target_url = System.getProperty("url")!=null ? System.getProperty("url") : df.getdata("url");
		
		if(Browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
			d.get(Target_url);
			d.manage().window().maximize();}
		if(Browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			d = new FirefoxDriver();
			d.get(Target_url);
			d.manage().window().maximize();}
		
			
		}
		
	@AfterMethod	
	public void DriverKill(){
		
		
		if(d!=null){
			
			d.quit();
			
		}
		
		
		
		
	}
	
	
	
	}


