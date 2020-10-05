package week4.day1.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 
{
	/*
	 * Assignment 4: Complete all the below tasks
		http://leafground.com/pages/disapper.html
		http://leafground.com/pages/appear.html
		http://leafground.com/pages/TextChange.html
	 */

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/disapper.html");
		

	}

}
