package Step_Definitions;

import java.io.IOException;

import Libertyhome.Automation_project.Login;
import io.cucumber.java.en.Given;

public class Login_Cucumber extends Login{
	
	public void Driver_Binder(){
		
		super.d = Cucumber_Base.d;
		
		
	}
	
	@Given("Positive Testcase of Login with Cucumnber")
	public void Cucumber_login() throws InterruptedException, IOException{
		Driver_Binder();
		login();
		
		
	}

}
