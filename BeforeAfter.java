package in.amazon.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter extends Tools {
	
	@BeforeMethod
	public void setUp(Scenario senario) {
		
		Driver.init();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
