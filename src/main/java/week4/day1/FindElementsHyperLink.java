package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsHyperLink {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//*********************Initialization - Application Block Code******************//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		System.out.println(driver.findElementsByTagName("a").size());
		List<WebElement> links = driver.findElementsByXPath("//a");
		for(WebElement eachLink:links)
		{
			System.out.println(eachLink.getAttribute("href"));
			System.out.println(eachLink.getText());
		}
	}

}
