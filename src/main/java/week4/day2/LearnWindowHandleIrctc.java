package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandleIrctc {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElementByXPath("//button[text()='Ok']").click();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		System.out.println("==========================================");
		driver.findElementByXPath("//a[contains(text(), 'FLIGHTS')]").click();
		Thread.sleep(8000);
		
		Set<String> setOfHandles = driver.getWindowHandles();
		for (String eachWindows : setOfHandles) //Just to Print the Windows List
		{ 
			System.out.println(eachWindows); 
		}
		List<String> listOfHandles=new ArrayList<String>(setOfHandles);
		System.out.println("==========================================");
		String newWindow = listOfHandles.get(1);
		System.out.println(newWindow);
		driver.switchTo().window(newWindow);
		System.out.println(driver.getTitle());
		driver.close();
		System.out.println("==========================================");
		String parentWindow = listOfHandles.get(0);
		driver.switchTo().window(parentWindow);
		System.out.println(parentWindow);
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		driver.quit();

	}

}
