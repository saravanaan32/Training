package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/******************Launch Application***************************/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		//*****************Multi Select Value in List Box**************//
		WebElement multiSelect = driver.findElementByXPath("(//select)[6]");
		Select multiSelectOptions = new Select(multiSelect);
		multiSelectOptions.deselectByVisibleText("Select your programs");
		multiSelectOptions.selectByVisibleText("Selenium");
		multiSelectOptions.selectByVisibleText("Appium");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
