package week2.day2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//********************* Application Invoked *********************//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		//********************* Home Page *********************//
		driver.findElementByXPath("//*[text()='Click on this image to go home page']/following-sibling::img").click();
		//*********************Home Page to Hyperlink page Navigation******************//
		driver.findElementByXPath("//h5[text()='Image']").click();
		//********************* Broken Image Validation *********************//
		
		//********************* Click Image using Keyboard or Mouse ****************//
		driver.findElementByXPath("//*[text()='Click me using Keyboard or Mouse']/following-sibling::img").click();


	}

}
