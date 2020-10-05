package week4.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassSelectOption 
{
	/*
	 * 	Classroom3:
		https://jqueryui.com/selectable/
		// to get into frame
		driver.switchTo().frame(0);
		Select all the odd items (1,3,5,7)
	 */

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		//Thread.sleep(10000);
		Actions builder=new Actions(driver);
		driver.switchTo().frame(0);
		List<WebElement> itemList = driver.findElementsByXPath("//li[contains(text(),'Item')]");
		System.out.println(itemList.size());
		//Thread.sleep(10000);
		for (int i = 1; i <= itemList.size(); i++) 
		{
			if(i%2!=0)
			{
				WebElement itemLists = driver.findElementByXPath("//li[contains(text(),'Item "+i+"')]");
				System.out.println(itemLists);
				//builder.clickAndHold(itemLists).perform();
				builder.keyDown(Keys.COMMAND).click(itemLists).build().perform();
				//builder.keyUp(Keys.CONTROL).build().perform();
			}
		}


	}

}
