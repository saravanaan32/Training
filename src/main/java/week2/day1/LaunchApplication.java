package week2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//To Setup the Driver using Driver Manager instead System.setProperty("webdriver.chrome.driver" "path")
		WebDriverManager.chromedriver().setup();
		
		//Code to Open the Browser
		ChromeDriver driver=new ChromeDriver();
		
		/*
		 * if you take WebDriver(interface) --> RemoteWebDriver --> ChromiumDriver --> ChromeDriver
		 * 
		 * ChromeDriver driver = new ChromeDriver();
		 * 
		 * WebDriver driver = new ChromeDriver(); - WebDriver will have all the methods in it such as get, findElements...
		 * 
		 * Scope will be moved from ChromeDriver to WebDriver - This is the use of Scope Restrictions
		 * 
		 */
		
		
		
		
		//To Maximise the Window
		driver.manage().window().maximize();
		//To Load the Application URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//To close the browser
		driver.close();

	}

}
