package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args)  
	{
		// TODO Auto-generated method stub
		//*********************Initialization - Application Block Code******************//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		//******************** Select the languages that you know? ********************//
		driver.findElementByXPath("(//input[@type='checkbox'])[1]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[3]").click();
		//******************** Confirm Selenium is checked ********************//
		String attributeValue1 = driver.findElementByXPath("(//input[@type='checkbox'])[6]").getAttribute("value");
		System.out.println(attributeValue1);
		String attributeValue2 = driver.findElementByXPath("(//input[@type='checkbox'])[6]").getAttribute("checked");
		System.out.println(attributeValue2);
		if ((driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected())==true)
		{
			System.out.println("The Selenium CheckBox is Already Selected");
		}
		else 
		{
			driver.findElementByXPath("(//input[@type='checkbox'])[6]").click();
		}
		//******************** DeSelect only checked ********************//
		if ((driver.findElementByXPath("(//input[@type='checkbox'])[7]").isSelected())==true)
		{
			driver.findElementByXPath("(//input[@type='checkbox'])[7]").click();
		}
		else if ((driver.findElementByXPath("(//input[@type='checkbox'])[8]").isSelected())==true) 
		{
			driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
		}
		//******************** Select all below checkboxes ********************//
		for (int i = 9; i < 14; i++) 
		{
			System.out.println("The Parameterized Xpath are:- " +driver.findElementByXPath("(//input[@type='checkbox'])"+"["+i+"]"));
			WebElement optionsParameterizedXpath = driver.findElementByXPath("(//input[@type='checkbox'])"+"["+i+"]");
			optionsParameterizedXpath.click();
		}	
	}
}