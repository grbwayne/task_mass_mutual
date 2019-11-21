package utils;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


import org.openqa.selenium.WebElement;

public class BrowserUtils {
	
	public static Double valueToDouble(String value) {
		Locale locale = Locale.US;
		Double number = null;
		try {
			number = (Double) NumberFormat.getCurrencyInstance(locale).parse(value);
		} catch (ParseException e) {
			number = 0.0;
		}
		return (double) number;
	}
	
	public static boolean isCurrency(String value) {
		Locale locale = Locale.US;
		boolean flag = true;
		try {
			NumberFormat.getCurrencyInstance(locale).parse(value);
		} catch (ParseException e) {
			flag = false;
		}
		return flag;
	}
	
	public static List<String> toListOfString(List<WebElement> list){
		 List<String> list1 = new ArrayList<String>(); 
		for (WebElement webElement : list) {
			list1.add(webElement.getText());
		}
		return list1;
	}
}
