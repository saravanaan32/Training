package week4.day1.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickHoldReplace 
{
	/*
	 * Assignment 3: Place Item 1 in Item 4's position (Reorder as Item 2,3,4,1,5,6,7)
		https://jqueryui.com/sortable/
	 */

	public static void main(String[] args) 
	{
		//*************Launch Application*************//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//li[contains(text(),'Item 1')]");
		WebElement item4 = driver.findElementByXPath("//li[contains(text(),'Item 4')]");
		int x = item4.getLocation().getX();
		System.out.println("X:- " +x);
		int y = item4.getLocation().getY();
		System.out.println("Y:- " +y);
		Actions builder= new Actions(driver);
		builder.dragAndDropBy(item1, x, y).build().perform();
	}
}
