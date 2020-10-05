package week4.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//*********************Initialization - Application Block Code******************//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev68594.service-now.com/");
		//*************Frame Handling- Switch to frame by using id / Name****************//
		/*
		driver.switchTo().frame("gsft_main");
		driver.findElementById("user_name").sendKeys("admin");
		*/
		//*************Frame Handling- using a webelement***************//
		/*
		WebElement frame = driver.findElementById("gsft_main");
		driver.switchTo().frame(frame);
		driver.findElementById("user_name").sendKeys("admin");
		*/
		//*************Frame Handling- using a index***************//
		driver.switchTo().frame(0);
		driver.findElementById("user_name").sendKeys("admin");
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		String text = driver.findElementByXPath("//*[text()='Service Management']").getText();
		System.out.println(text);

	}

}
