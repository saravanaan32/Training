package week4.day1.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop 
{
	/*
	 * Assignment 2: Drag and drop the source element into the target element
		https://jqueryui.com/droppable/
	 */

	public static void main(String[] args) 
	{
		//*****************launch Application******************//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frameFocus = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(frameFocus);
		WebElement source = driver.findElementById("draggable");
		WebElement destination = driver.findElementById("droppable");
		Actions builder=new Actions(driver);
		builder.dragAndDrop(source, destination).perform();
	}

}
