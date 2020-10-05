package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindElements 
{
	public static void main(String[] args) 
	{
		//*********************Initialization - Application Block Code******************//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.findElementByXPath("//input").sendKeys("DeMOSAKESMANAGER");//it will identify the first match if its more matches
		//driver.findElementByTagName("input").sendKeys("demosalesmanager"); //even we can interact with the tagname, if we have more than one element for that particular tag
		List<WebElement> input = driver.findElementsByTagName("input");
		System.out.println(input.size());
		for (WebElement eachElement : input) 
		{
			String attributeValue = eachElement.getAttribute("name");
			System.out.println(attributeValue);//Driver issue thats why its not returning the 3 elements, only it returns 2 elements
			
		}
	}

}
