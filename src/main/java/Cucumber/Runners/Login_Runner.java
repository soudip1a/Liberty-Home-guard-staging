package Cucumber.Runners;

import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@Listeners({listener_package.Listen.class})
@CucumberOptions(
		features= "src\\main\\java\\Cucumber\\Feature\\Files\\Login.feature",
		glue="Step_Definitions",
		monochrome = true,
		plugin={"pretty","html:target/cucumber.html"}
	)
public class Login_Runner extends AbstractTestNGCucumberTests{

}
