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
		
		
		if(df.getdata("browser").equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
			d.get(df.getdata("url"));
			d.manage().window().maximize();}
		if(df.getdata("browser").equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			d = new FirefoxDriver();
			d.get(df.getdata("url"));
			d.manage().window().maximize();}
		
			
		}
		
	@AfterMethod	
	public void DriverKill(){
		
		
		if(d!=null){
			
			d.quit();
			
		}
		
		
		
		
	}
	
	
	
	}


