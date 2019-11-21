package step_definitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import utils.Test_base;

public class Hooks {
	WebDriver driver;
	@After
	public void setUp() {
		Test_base.closeDriver();
	}
}
