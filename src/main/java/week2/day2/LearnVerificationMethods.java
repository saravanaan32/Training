package week2.day2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnVerificationMethods {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/******************Launch Application***************************/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//***********Browser Verification Methods********//
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		//*************Web Element - Interactions*******//
		String tagName = driver.findElementByTagName("h2").getText();
		System.out.println(tagName);
		String attribute = driver.findElementById("username").getAttribute("name");
		System.out.println(attribute);
		Dimension size = driver.findElementByClassName("decorativeSubmit").getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		Point location = driver.findElementByClassName("decorativeSubmit").getLocation();
		System.out.println(location);
		System.out.println(location.getX());
		System.out.println(location.getY());
		boolean enabled = driver.findElementByClassName("decorativeSubmit").isEnabled();
		if (enabled==true)
		{
			System.out.println("Element is Enabled");
		}
		else
		{
			System.out.println("Element is Not Enabled");
		}
	}

}
