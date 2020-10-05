package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//*********************Initialization - Application Block Code******************//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		//***************To get the Window Reference ID*****************//
		String parenWindow = driver.getWindowHandle();
		System.out.println(parenWindow);
		String firstWindowTitle = driver.getTitle();
		System.out.println(firstWindowTitle);
		System.out.println("**********************************************");
		driver.findElementById("home").click();
		Set<String> setOfHandles = driver.getWindowHandles();
		for (String eachWindows : setOfHandles) //Just to Print the Windows List
		{ 
			System.out.println(eachWindows); 
		}
		List<String> listOfHandles=new ArrayList<String>(setOfHandles);
		
		String secondReferenceWindow = listOfHandles.get(1);
		driver.switchTo().window(secondReferenceWindow);
		String secondWindowTitle = driver.getTitle();
		System.out.println(secondWindowTitle);
		
		

		 
		

	}

}
