package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*********************Initialization - Application Block Code******************//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		//********************* Select Training Program by Index ******************//
		WebElement dropdownIndex = driver.findElementById("dropdown1");
		Select valuebyIndex = new Select(dropdownIndex);
		valuebyIndex.selectByIndex(1);
		//********************* Select Training Program by Text ******************//
		WebElement dropdownText = driver.findElementByName("dropdown2");
		Select valueByText = new Select(dropdownText);
		valueByText.selectByVisibleText("Appium");
		//********************* Select Training Program by Value ******************//
		WebElement dropdownValue = driver.findElementById("dropdown3");
		Select valueByValue = new Select(dropdownValue);
		valueByValue.selectByValue("3");
		//********************* Get the Number Of Dropdown Option and Print them All ******************//
		WebElement dropdownOptions = driver.findElementByXPath("//select[@class='dropdown']");
		Select valueOptions=new Select(dropdownOptions);
		List<WebElement> optionsForEachIterate = valueOptions.getOptions();
		System.out.println("The No.. of DropDown Option is:- " +optionsForEachIterate.size());
		for (WebElement optionsLists : optionsForEachIterate) 
		{
			System.out.println(optionsLists.getText());
		}
		//********************* You can also use SendKeys to choose the option from dropdown ******************//
		driver.findElementByXPath("(//select)[5]").sendKeys("Selenium");
		//********************* MultiSelect ******************//
		WebElement multiSelect = driver.findElementByXPath("(//select)[6]");
		Select multiOption = new Select(multiSelect);
		multiOption.selectByValue("1");
		multiOption.selectByVisibleText("Appium");
	}

}
