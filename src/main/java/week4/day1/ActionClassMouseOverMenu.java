package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassMouseOverMenu
{
	/*
	 * Classroom2:
		1. Load https://www.snapdeal.com/
		2. Mouse hover on Men's Fashion and Click Shirts
		3. Mouse hover on the first product and Click on Quick View
		4. Close all the browsers
	 */

	public static void main(String[] args) throws InterruptedException 
	{
		// Launch and Application
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		//Action Class
		Actions builder = new Actions(driver);
		WebElement Men = driver.findElementByXPath("(//span[@class='catText'])[6]");
		Thread.sleep(10000);
		builder.moveToElement(Men).build().perform();
		driver.findElementByXPath("(//span[text()='Shirts'])[2]").click();
		Thread.sleep(8000);
		WebElement shirt = driver.findElementByXPath("(//p[@class='product-title'])[1]");
		builder.moveToElement(shirt).build().perform();
		WebElement quickView = driver.findElementByXPath("(//div[contains(text(),'Quick View')])[1]");
		builder.moveToElement(quickView).click().build().perform();
		Thread.sleep(5000);
		driver.close();
	}

}
