package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Values_page {
	
	public List<WebElement> listOfValues(WebDriver driver){
		return driver.findElements(By.cssSelector("[id *= 'val']"));
	}
	
	public List<WebElement> listOfTxtValues(WebDriver driver){
		return driver.findElements(By.cssSelector("[id ^= 'txt_val']"));
	}
	@FindBy(id = "lbl_val_1")
	public WebElement lbl_value_one;
	
	@FindBy(id = "lbl_val_2")
	public WebElement lbl_value_two;
	
	@FindBy(id = "lbl_val_3")
	public WebElement lbl_value_three;
	
	@FindBy(id = "lbl_val_4")
	public WebElement lbl_value_four;
	
	@FindBy(id = "lbl_val_5")
	public WebElement lbl_value_five;
	
	@FindBy(id = "lbl_ttl_val")
	public WebElement lbl_total_value;
	
	
	@FindBy(id = "txt_val_1")
	public WebElement txt_value_one;
	
	@FindBy(id = "txt_val_2")
	public WebElement txt_value_two;
	
	@FindBy(id = "txt_val_3")
	public WebElement txt_value_three;
	
	@FindBy(id = "txt_val_4")
	public WebElement txt_value_four;
	
	@FindBy(id = "txt_val_5")
	public WebElement txt_value_five;

	@FindBy(id = "txt_ttl_val")
	public WebElement txt_total_value;
	
	

	
}
