package step_definitions;

import static org.junit.Assert.*;
import java.util.List;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Values_page;
import utils.BrowserUtils;
import utils.Test_base;

public class Values_step_definition {

	Values_page values_page = new Values_page();
	WebDriver driver;
	List<String> textValues;

	@Given("User is already on the values page")
	public void user_is_already_on_the_values_page() {
		driver = Test_base.getDriver();
		driver.get("https://www.exercise1.com/values");
	}

	@Then("Verify the count of values is {int}")
	public void verify_the_count_of_values_is(int count_of_values) {
		int expectedCount = values_page.listOfValues(driver).size();
		assertEquals(expectedCount, count_of_values);
	}

	@Then("Verify the values on the screen are greater than {int}")
	public void verify_the_values_on_the_screen_are_greater_than(int zero) {
		textValues = BrowserUtils.toListOfString(values_page.listOfTxtValues(driver));
		for (String string : textValues) {
			assertTrue(BrowserUtils.valueToDouble(string) > zero);
		}
	}

	@Then("Verify the total balance is equal to {double}")
	public void verify_the_total_balance_is_equal_to(double total_balance) {
		double actualTotatl_balance = 0;
		for (int i = 0; i < textValues.size(); i++) {
			actualTotatl_balance += BrowserUtils.valueToDouble(textValues.get(i));
		}
		assertTrue(actualTotatl_balance == total_balance);
	}

	@Then("Verify the values are formatted as currencies")
	public void verify_the_values_are_formatted_as_currencies() {
		for (String string : textValues) {
			assertTrue(BrowserUtils.isCurrency(string));
		}
	}

	
}
