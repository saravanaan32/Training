package week2.day2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/******************Launch Application***************************/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		//*****************Edit Page**************//
		driver.findElementByXPath("//input[@id='email']").sendKeys("saravanaan@gmail.com");
		//*****************Append Value to Text Box**************//
		WebElement appendElement = driver.findElementByXPath("//input[@value='Append ']");
		System.out.println("Printing the Web Element:- " +appendElement);
		String appendValue = appendElement.getAttribute("value");
		System.out.println("The Value already available in the TextBox:- " +appendValue);
		appendElement.clear();
		appendElement.sendKeys(appendValue+"Modified Value");
		System.out.println("The Values after Appending the value in the Textbox:-" +appendElement.getAttribute("value"));
		//*****************Retrieving the Value from Text Box**************//
		String defaultTextEntered = driver.findElementByXPath("//label[text()='Get default text entered']/following-sibling::input[@name='username']").getAttribute("value");
		System.out.println("The default value entered in the Textbox is:- " +defaultTextEntered);
		//*****************Clear the Text in TextBox************//
		driver.findElementByXPath("//label[text()='Clear the text']/following-sibling::input[@name='username']").clear();
		//*****************Verification of Field Disabled*******//
		boolean textBoxGrayedOut = driver.findElementByXPath("//label[text()='Confirm that edit field is disabled']/following-sibling::input").isDisplayed();
		System.out.println("The Text Box Status:- " +textBoxGrayedOut);
	}
}