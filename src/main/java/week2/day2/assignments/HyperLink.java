package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//*********************Initialization - Application Block Code******************//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		//********************* Home Page Navigation ******************//
		driver.findElementByXPath("//label[text()='(Interact with same link name)']/preceding::a[4]").click();
		//*********************Home Page to Hyperlink page Navigation******************//
		driver.findElementByXPath("//h5[text()='HyperLink']").click();
		//********************* Find where am supposed to go without clicking me *********************//
		String hyperLinkUrl = driver.findElementByXPath("//*[text()='Find where am supposed to go without clicking me?']").getAttribute("href");
		System.out.println(hyperLinkUrl);
		//********************* Verify am I broken *********************//
		driver.findElementByXPath("//a[text()='Verify am I broken?']").click();
		String brokenPageTitle = driver.getTitle();
		boolean brokenPageTitleResult = brokenPageTitle.contains("HTTP Status 404");
		System.out.println("The Page Status:- " +brokenPageTitleResult);
		if (brokenPageTitleResult=true) 
		{
			System.out.println("The Page is Broken and it throws as HTTP 404 Error !!!");
		}
		else
		{
			System.out.println("The Page is not Broken");
		}
		//********************* Navigating back to Page - Broken Page*********************//
		driver.get("http://leafground.com/pages/Link.html");
		//********************* Go To Home Page (Interact with same link name) *********************//
		driver.findElementByXPath("//label[text()='(Interact with same link name)']/preceding::a[1]").click();
		//*********************Home Page to Hyperlink page Navigation******************//
		driver.findElementByXPath("//h5[text()='HyperLink']").click();
		//********************* Count and List of Hyperlinks *********************//
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("The Number of Hyperlink:-" +linksList.size());
		for (int i = 1; i < linksList.size(); i++) 
		{
			System.out.println("The Links are:-" +linksList.get(i).getText());
		}
		
	}

}
